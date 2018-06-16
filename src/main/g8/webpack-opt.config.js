var merge = require('webpack-merge');
var core = require('./webpack-core.config.js')
var webpack = require("webpack");
var path = require("path");
var HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = merge(core, {
  mode: "production",
  entry: {
    "$name$-opt": [ path.resolve(__dirname, "./opt-launcher.js") ]
  },
  output: {
    "path": path.resolve(__dirname, "../../../../build"),
    "filename": "[name]-bundle.js"
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: path.resolve(__dirname, "../../../../public/index.html")
    }),
    new webpack.DefinePlugin({
      'process.env': {
        NODE_ENV: JSON.stringify('production')
      }
    })
  ]
})
