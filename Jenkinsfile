def gv = load 'script.groovy'
pipeline {
    agent any
    parameters {
        booleanParam(name: 'RUN_TESTS', defaultValue: true, description: 'Whether to run tests')
        choice(name: 'DEPLOY_ENVIRONMENT', choices: ['development', 'staging', 'production'], description: 'Deployment environment')
    }
    stages {
        stage('Build') {

            steps {
                script {
                    gv.buildApp()
                }
            }

        }
        stage('Test') {
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    gv.deployApp()
                }
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