pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World6'
            }
        }
    }
    //마지막 어떻게 할껀지
    post {
        always {
            echo 'build done!!!!!'
        }
        failure {
            echo 'build Fail!!!!!'
            //mail to: team@gmail.com, subject: 'Pipeline fail email'
        }
    }
}
pipeline {
    /* insert Declarative Pipeline here */
}