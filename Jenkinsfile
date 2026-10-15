pipeline {
    agent any
    
    tools {
        maven 'M3' 
    }
    
    stages {
        stage('Build & Test') {
            steps {
                bat 'mvn clean test' 
            }
        }
    }
    
    post {
        always {
            // This line automatically captures and displays test cases in Jenkins
            junit 'target/surefire-reports/*.xml' 
        }
    }
}