var merge = require('webpack-merge');
var core = require('./webpack-core.config.js')
var webpack = require("webpack");
var path = require("path");

module.exports = merge(core, {
  mode: "production",
  output: {
    "path": path.resolve(__dirname, "../../../../build")
  },
  plugins: [
    new webpack.DefinePlugin({
      'process.env': {
        NODE_ENV: JSON.stringify('production')
      }
    })
  ]
})
