var merge = require('webpack-merge');
var core = require('./webpack-core.config.js')
var webpack = require("webpack");

var generatedConfig = require("./scalajs.webpack.config.js");
const entries = {};
entries[Object.keys(generatedConfig.entry)[0]] = "scalajs";

module.exports = merge(core, {
  mode: "production",
  devtool: "source-map",
  entry: entries,
  plugins: [
    new webpack.DefinePlugin({
      'process.env': {
        NODE_ENV: JSON.stringify('production')
      }
    })
  ]
})
