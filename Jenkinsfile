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
                sh 'chmod +x mvnw'
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t springboot-demo .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker stop demo || true'
                sh 'docker rm demo || true'
                sh 'docker run -d --name demo -p 8080:8080 springboot-demo'
            }
        }
    }
}
