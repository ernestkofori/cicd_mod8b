def gv
gv = load 'script.groovy'
pipeline {
    agent any
    parameters {
        booleanParam(name: 'RUN_TESTS', defaultValue: true, description: 'Whether to run tests')
        choice(name: 'DEPLOY_ENVIRONMENT', choices: ['development', 'staging', 'production'], description: 'Deployment environment')
    }
    // stages {
    //     stage('init') {

    //         steps {
    //             script {
    //                 gv = load 'script.groovy'
    //             }
    //         }
    //     }

        stage('Build') {
            steps {
                script {
                    gv.buildApp()
                }
            }

        }
        stage('Test') {
            when {
                expression { params.RUN_TESTS == true }
            }
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