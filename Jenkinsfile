pipeline {
    agent any
    environment {
        DOCKER_PASSWORD=credentials('dockerhub')
        DOCKER_USERNAME='nisharathod232001'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/nisharathod2301/Calculator_DevOps.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker Build'){
            steps{
                sh 'docker build -t nisharathod232001/calculator_image .'
            }
        }
        stage('Push Image to DockerHub'){
            steps {
                script {
                    sh 'docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD'
                    sh 'docker push nisharathod232001/calculator_image'
                }
            }
        }
        stage('Run ansible playbook'){
            steps{
                sh 'ansible-playbook -i inventory deploy.yml'
            }
        }
    }
}