pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -v'
      }
    }
    stage('Test') {
      steps {
        emailext(subject: '$DEFAULT_SUBJECT', body: '$DEFAULT_CONTENT', to: 'xiaopan@xceder.com', replyTo: '$DEFAULT_REPLYTO', postsendScript: '$DEFAULT_POSTSEND_SCRIPT', presendScript: '$DEFAULT_RECIPIENTS')
      }
    }
  }
}