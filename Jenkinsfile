pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/ANIR369/tasktracker.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
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
                to: 'moahmmedibrahim3139@gmail.com'
            )
        }

        failure {
            emailext(
                subject: 'Build Failed',
                body: '''
Build failed.

Please check Jenkins console output.

Regards,
Jenkins
''',
                to: 'moahmmedibrahim@gmail.com'
            )
        }
    }
}
