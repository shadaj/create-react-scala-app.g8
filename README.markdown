# Create React Scala App
Create [React](https://facebook.github.io/react/) apps in [Scala](https://scala-lang.org/) (via [Slinky](https://github.com/shadaj/slinky)) with no build configuration

## Quick Overview
Make sure you have SBT and NPM installed.

```sh
sbt new shadaj/create-react-scala-app.g8
... follow instructions to create your app

cd my-app/
sbt "dev"
```

Then open http://localhost:8080 to see your app.
When you're ready to deploy to production, create a minified bundle with `sbt fullOptJS::webpack`

### Get Started Immediately
You **don’t** need to install or configure tools like Webpack.
They are preconfigured so that you can focus on the code.

Just create a project, and you’re good to go.

## Getting Started
### Installation
To use create-react-scala-app, you'll need SBT, which is the primary build tool, and NPM, which is used to pull in JavaScript dependencies and bundle your application with Webpack.

**You’ll need to have Node >= 6 on your machine.** You can use [nvm](https://github.com/creationix/nvm#installation) to easily switch Node versions between different projects.

**This tool doesn’t assume a Node backend.** The Node installation is only required for Create React Scala App itself.

### Creating an App
To create a new app, run: `sbt new shadaj/create-react-scala-app.g8`, follow the instructions that follow, then `cd my-app`.

This will create a folder `my-app` inside the current folder.
Inside that directory, it will generate the initial project structure:
```
my-app
├── build.sbt
├── hot-launcher.js
├── opt-launcher.js
├── webpack-fastopt.config.js
├── webpack-opt.config.js
├── project
│   └── build.properties
│   └── plugins.sbt
├── public
│   └── favicon.ico
│   └── index.html
│   └── manifest.json
└── src
    └── main
        └── resources
            └── App.css
            └── index.css
            └── logo.svg
        └── scala
            └── hello/world
                └── App.scala
                └── Main.scala
```

No configuration or complicated folder structures, just the files you need to build your app.
Once the installation is done, you can run some commands inside the project folder:

### `sbt "dev"`
Runs the app in development mode with hot-reloading enabled.
Open http://localhost:8080 to see your app

The page will automatically reload if you make changes to the code. You will see compilation and Webpack errors in your console.

### `sbt test`
Runs unit tests for your app inside a Node environment with simulated DOM APIs.

### `sbt fullOptJS::webpack`
Builds the app for production to the `build` folder. It correctly bundles React in production mode and optimizes the build for the best performance. It also minifies the build using UglifyJS.

Your app is ready to be deployed.

## Philosophy
+ Compatibility: You can use tools from both the Scala and JavaScript ecosystems and integrate them into your build setup. Your project starts with an SBT configuration for handling compilation and dependencies, but also has a customizable Webpack setup for adding plugins and loaders.
+ No Configuration Required: You don't need to configure anything. Reasonably good configuration of both development and production builds is handled for you so you can focus on writing code.
+ No Lock-In: Your generated project is free of any dependencies specific to create-react-scala-app. You can start customizing the build configuration anytime without even needing an "eject" command!

## What’s Inside?
The generated project uses the following tools and libraries:
+ [SBT](http://www.scala-sbt.org/) to compile Scala sources and [NPM](https://www.npmjs.com/) to resolve JavaScript package dependencies
+ Scala.js DOM wrappers: [Scala.js DOM](https://github.com/scala-js/scala-js-dom)
+ React wrapper, HTML DSL, and hot reloading: [Slinky](https://github.com/shadaj/slinky)
+ [Scala.js Bundler](https://github.com/scalacenter/scalajs-bundler) to bundle your Scala.js app with Webpack
+ [Webpack](https://webpack.js.org/) with [webpack-dev-server](https://github.com/webpack/webpack-dev-server), [file-loader](https://github.com/webpack-contrib/file-loader), [style-loader](https://github.com/webpack-contrib/style-loader), [css-loader](https://github.com/webpack-contrib/css-loader), [html-webpack-plugin](https://github.com/jantimon/html-webpack-plugin), and [copy-webpack-plugin](https://github.com/webpack-contrib/copy-webpack-plugin)

## Why Use This?
With create-react-scala-app you can quickly bootstrap a new application using Scala and React. Your environment will have everything you need to build a new Scala app:
+ A familiar API for writing React code in Scala, with support for hot reloading components.
+ A dev server that automatically compiles your Scala code to JavaScript.
+ A build script to bundle JavaScript, CSS, and images for production, with sourcemaps.

## Acknowledgements
`create-react-scala-app` is based on Facebook's [Create React App](https://github.com/facebookincubator/create-react-app) and JetBrains' [Create React Kotlin App](https://github.com/JetBrains/create-react-kotlin-app).
