var path = require("path");
var HtmlWebpackPlugin = require('html-webpack-plugin');
var CopyWebpackPlugin = require('copy-webpack-plugin');

module.exports = {
  entry: {
    "$name$-fastopt": [ path.resolve(__dirname, "./hot-launcher.js") ]
  },
  output: {
    path: __dirname,
    filename: "[name]-bundle.js"
  },
  resolve: {
    alias: {
      "resources": path.resolve(__dirname, "../../../../src/main/resources")
    }
  },
  module: {
    rules: [
      {
        test: /\\.css\$/,
        use: [ 'style-loader', 'css-loader' ]
      },
      // "file" loader for svg
      {
        test: /\\.svg\$/,
        use: [
          {
            loader: 'file-loader',
            query: {
              name: 'static/media/[name].[hash:8].[ext]'
            }
          }
        ]
      }
    ]
  },
  plugins: [
    new CopyWebpackPlugin([
      { from: path.resolve(__dirname, "../../../../public") }
    ]),
    new HtmlWebpackPlugin({
      template: path.resolve(__dirname, "../../../../public/index.html")
    })
  ]
}
