pipeline {
  agent any
  stages {
    
      stage('Checkout') {
            steps {
              git(url: 'https://github.com/LSETProject2024/ecommerceservice.git', branch: 'main', credentialsId: 'LSETProject2024', poll: true)
            }
      }

       stage("Build & SonarQube Analysis "){
            steps {
              withSonarQubeEnv('SonarQube') {
                sh "mvn clean package sonar:sonar"
              }
            }
       }

       stage("Test Application"){
           steps {
                 sh "mvn test"
           }
       }

  }
}
