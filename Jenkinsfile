pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }

    post {

        success {
            emailext(
                subject: 'Build Success',
                body: 'Task Tracker build successful.',
                to: 'maazismail7705@gmail.com'
            )
        }

        failure {
            emailext(
                subject: 'Build Failed',
                body: 'Pipeline failed.',
                to: 'maazismail7705@gmail.com'
            )
        }
    }
}
