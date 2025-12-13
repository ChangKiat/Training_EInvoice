pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ChangKiat/Training_EInvoice.git'
            }
        }

        stage('Build JAR') {
            steps {
                bat 'mvnw.cmd clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t springboot-demo .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat '''
                docker stop demo || exit 0
                docker rm demo || exit 0
                docker run -d --name demo -p 8080:8080 springboot-demo
                '''
            }
        }
    }
}
