pipeline {
    agent any
    parameters {
        booleanParam(name: 'RUN_TESTS', defaultValue: true, description: 'Whether to run tests')
        choice(name: 'DEPLOY_ENVIRONMENT', choices: ['development', 'staging', 'production'], description: 'Deployment environment')
    }
    stages {
        stage('Build') {
            when {
                expression { params.RUN_TESTS == true }
            }
            steps {
                echo 'Building...'
                // Add build steps here
            }

        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Add test steps here
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying to ${params.DEPLOY_ENVIRONMENT} environment"
                echo 'Deploying...'
                // Add deploy steps here
            }
        }
    }

    // post {
    //     always {
    //         echo 'This will always run after the stages.'
    //     }
    //     success {
    //         echo 'This will run only if the pipeline succeeds.'
    //     }
    //     failure {
    //         echo 'This will run only if the pipeline fails.'
    //     }
    // }
}