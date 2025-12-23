def buildApp() {
    echo 'Building...'
    // Add build steps here
}

def testApp() {
    echo 'Testing...'
    // Add test steps here
}

def deployApp() {
    parameters {
        choice(name: 'VERSION', choices: ['1.0.1', '1.0.2'], description: 'Version to deploy')
    }
    echo "Deploying version ${params.VERSION} to ${params.DEPLOY_ENVIRONMENT} environment"
    echo 'Deploying...'
    // Add deploy steps here
}

return this