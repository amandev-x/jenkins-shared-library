def call(Map args) {
    echo "App ${args.appName} with version ${args.appversion}"
    echo "Using build tool ${args.buildTool} in environment ${args.environment}"
}
