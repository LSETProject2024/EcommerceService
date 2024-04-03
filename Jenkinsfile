pipeline {
  agent any
  stages {
    
      stage('Checkout') {
            steps {
              git(url: 'https://github.com/LSETProject2024/ecommerceservice.git', branch: 'main', credentialsId: 'LSETProject2024', poll: true)
            }
      }

       stage('Build'){
            steps {
                sh ""
              }
            }
  stage('SCM') {
    stage('SonarQube Analysis') {
    def mvn = tool 'Default Maven';
    withSonarQubeEnv('sq') {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=ecommerce"
    }
  }
  }
  }
}
