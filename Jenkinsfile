pipeline {
  agent any
  stages {
    
      stage('Checkout') {
            steps {
              git(url: 'https://github.com/LSETProject2024/ecommerceservice.git', branch: 'main', credentialsId: 'LSETProject2024', poll: true)
            }
      }

       stage("Build"){
            steps {
                sh "mvn clean package"
              }
            }
    
  stage('SonarQube analysis') {
    steps {
    withSonarQubeEnv(credentialsId: 'sonarqube_secret', installationName: 'sq1') { // You can override the credential to be used
      sh 'mvn sonar:sonar'
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
