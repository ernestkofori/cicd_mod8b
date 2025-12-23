dev buildApp() {
    when {
        expression { params.RUN_TESTS == true }
        }
    echo 'Building...'
    // Add build steps here
}

dev testApp() {
    echo 'Testing...'
    // Add test steps here
}

dev deployApp() {
    echo "Deploying to ${params.DEPLOY_ENVIRONMENT} environment"
    echo 'Deploying...'
    // Add deploy steps here
}

return this