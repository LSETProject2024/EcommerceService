pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/LSETProject2024/ecommerceservice.git', branch: 'main', credentialsId: 'LSETProject2024', poll: true)
      }
    }
    #stage('Build skip') {
    # steps {
    #   sh "mvn package"
    # }
    # }
    stage('Test') {
      steps {
        sh "mvn test"
      }
    }
  }
}
