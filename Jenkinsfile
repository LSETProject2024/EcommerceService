pipeline {
  agent any

  tools{
    maven 'maven3'
  }
  
  stages {
      stage('Checkout') {
            steps {
              git branch: 'main', credentialsId: '512fd7be-2f22-4c11-874c-9c20ac94d419', url: 'https://github.com/LSETProject2024/ecommerceservice.git'
            }
      }
      stage('Build') {
            steps {
                sh 'mvn clean package'
              }
      }
      stage('Test') {
            steps {
                sh 'mvn test'
            }
      }
      
  }
}
