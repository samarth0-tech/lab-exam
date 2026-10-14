pipeline {
    agent any

    tools {
        maven 'Maven3' // This name must match exactly what you typed in Jenkins
    }

    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}