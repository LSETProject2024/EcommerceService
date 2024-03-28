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
    stage("Scan"){
      steps {
       withSonarQubeEnv(installationName: 'sq1') {
         sh 'mvn clean package sonar:sonar'
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
