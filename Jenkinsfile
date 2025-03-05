pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: "main", url: 'https://github.com/janneesa/MetropoliaTripCostCalculator.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build("local-image:tagname")
                }
            }
        }
        stage('Tag Docker Image') {
            steps {
                script {
                    bat 'docker tag local-image:tagname janneesa/metropoliatripcostcalculator:tagname'
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'docker-hub-credentials') {
                        bat 'docker push janneesa/metropoliatripcostcalculator:tagname'
                    }
                }
            }
        }
    }
}