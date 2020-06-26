pipeline {
    agent any
    stages{
        stage ('Execute pipeline1') {
            steps {
                build job: 'pipeline1', propagate: true, wait: true
            }
        }
  }
}