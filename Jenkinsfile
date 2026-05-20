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
                to: 'anirudhtemkar@gmail.com'
            )
        }

        failure {
            emailext(
                subject: 'Build Failed',
                body: 'Pipeline failed.',
                to: 'anirudhtemkar@gmail.com'
            )
        }
    }
}
