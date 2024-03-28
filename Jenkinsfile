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
stage("Quality Gate"){
  steps {
          timeout(time: 1, unit: 'HOURS') {
              def qg = waitForQualityGate()
              if (qg.status != 'OK') {
                  error "Pipeline aborted due to quality gate failure: ${qg.status}"
              }
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
