pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''mvn -v
echo something'''
      }
    }
    stage('Test') {
      steps {
        emailext(subject: '$DEFAULT_SUBJECT',
        recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
        body: '$DEFAULT_CONTENT', replyTo: '$DEFAULT_REPLYTO', 
        postsendScript: '$DEFAULT_POSTSEND_SCRIPT', 
        presendScript: '$DEFAULT_RECIPIENTS', 
        to: '$DEFAULT_RECIPIENTS')
      }
    }
  }
   post {
        success {  
          emailext (
            subject: "${env.JOB_NAME} - Build# ${env.BUILD_NUMBER} - Successful!",
            to: '$DEFAULT_RECIPIENTS',
            recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
            body: '',  
            attachLog: true           
          )
        }

        failure {
          emailext (
            subject: "${env.JOB_NAME} - Build# ${env.BUILD_NUMBER} - Successful!",
            to: '$DEFAULT_RECIPIENTS',
            recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider'], [$class: 'FailingTestSuspectsRecipientProvider']],  
            body: '',
            attachLog: true            
          )
        }
    }
}
