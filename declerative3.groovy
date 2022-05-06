pipeline {
        agent any 
        stages {
          stage('pull-code') { 
            steps {
                git credentialsId: 'ubuntu-git', url: 'git@github.com:mangeshkokse/devops-mk.git'
            }
          }
          stage('Test') { 
            steps {
              sh '''pwd
                 '''
            }
          }
          stage('Deploy') { 
            steps {
              echo 'Deployed'
            }
          }
        }
      }