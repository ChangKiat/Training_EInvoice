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

        stage('Run Docker Compose') {
		    steps {
		        bat '''
		        docker-compose down
		        docker-compose up -d --build
		        '''
		    }
		}
    }
}
