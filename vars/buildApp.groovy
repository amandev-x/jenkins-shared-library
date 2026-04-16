def call(Map args) {
    echo "App ${args.APP_NAME} with version ${args.APP_VERSION}"
    echo "Using build tool ${args.BUILD_TOOL} in environment ${args.ENVIRONMENT}"
}
