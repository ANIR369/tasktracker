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
                body: '''
Build completed successfully.

Project: Task Tracker

Regards,
Jenkins
''',
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
