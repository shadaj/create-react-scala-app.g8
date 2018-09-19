var merge = require('webpack-merge');
var core = require('./webpack-core.config.js')

var generatedConfig = require("./scalajs.webpack.config.js");
const entries = {};
entries[Object.keys(generatedConfig.entry)[0]] = "scalajs";

module.exports = merge(core, {
  devtool: "source-map",
  entry: entries,
  module: {
    noParse: (content) => {
      return content.endsWith("-fastopt.js");
    }
  }
})
