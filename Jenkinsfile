pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/ANIR369/tasktracker.git'
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
