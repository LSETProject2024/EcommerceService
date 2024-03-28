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
   node {
  stage('SCM') {
    git 'git@github.com:LSETProject2024/ecommerceservice.git'
  }
  stage('SonarQube analysis') {
    withSonarQubeEnv(credentialsId: 'sonarqube_secret', installationName: 'sq1') { // You can override the credential to be used
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
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
