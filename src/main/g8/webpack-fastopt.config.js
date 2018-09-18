var merge = require('webpack-merge');
var core = require('./webpack-core.config.js')

module.exports = merge(core, {
  devtool: "source-map",
  module: {
    noParse: (content) => {
      return content.endsWith("-fastopt.js");
    }
  }
})
