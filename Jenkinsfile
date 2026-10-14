pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                // On Windows, use 'bat'. On Mac/Linux, replace 'bat' with 'sh'
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Publishes JUnit test results in Jenkins
            junit 'target/surefire-reports/*.xml'
        }
    }
}