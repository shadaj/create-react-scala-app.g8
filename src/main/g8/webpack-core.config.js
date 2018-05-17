var path = require("path");
var CopyWebpackPlugin = require('copy-webpack-plugin');

module.exports = {
  mode: "development",
  output: {
    "filename": "[name]-bundle.js"
  },
  resolve: {
    alias: {
      "resources": path.resolve(__dirname, "../../../../src/main/resources")
    }
  },
  module: {
    rules: [
      {
        test: /\.css\$/,
        use: [ 'style-loader', 'css-loader' ]
      },
      // "file" loader for svg
      {
        test: /\.svg\$/,
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
    ])
  ]
}
