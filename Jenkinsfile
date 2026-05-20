pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'YOUR_GITHUB_REPO_LINK'
            }
        }

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
                body: 'Daily Task Tracker build successful.',
                to: 'YOUR_EMAIL@gmail.com'
            )
        }

        failure {
            emailext(
                subject: 'Build Failed',
                body: 'Pipeline failed.',
                to: 'YOUR_EMAIL@gmail.com'
            )
        }
    }
}
