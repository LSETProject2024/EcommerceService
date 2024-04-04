pipeline {
  agent any

  tools{
    maven 'maven3'
  }

  environment{
        SCANNER_HOME= tool 'sonar-scanner'
  }  
  stages {
      stage('Checkout') {
            steps {
              git branch: 'main', credentialsId: '512fd7be-2f22-4c11-874c-9c20ac94d419', url: 'https://github.com/LSETProject2024/ecommerceservice.git'
            }
      }
      stage('Compile') {
            steps {
                sh 'mvn compile'
              }
      }
      stage('Test') {
            steps {
                sh 'mvn test'
            }
      }
      stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonar') {
                    sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=ecommerceservice -Dsonar.projectKey=ecommerceservice \
                            -Dsonar.java.binaries=. '''
                }
            }
      }
      stage('SonarQube QualityGate'){
        steps {
                script {
                  waitForQualityGate abortPipeline: false, credentialsId: 'sonar-token' 
                }
            }
      }
      stage('Build') {
            steps {
               sh "mvn package"
            }
        }
    
  }
}
