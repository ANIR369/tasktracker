pipeline {
    agent any

    stages {

<<<<<<< HEAD
=======
        stage('Clone') {
            steps {
                git 'YOUR_GITHUB_REPO_LINK'
            }
        }

>>>>>>> 10ceb7a (added jenkins pipeline)
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
<<<<<<< HEAD
                body: '''
Build completed successfully.

Project: Task Tracker

Regards,
Jenkins
''',
                to: 'maazismail7705@gmail.com'
=======
                body: 'Daily Task Tracker build successful.',
                to: 'YOUR_EMAIL@gmail.com'
>>>>>>> 10ceb7a (added jenkins pipeline)
            )
        }

        failure {
            emailext(
                subject: 'Build Failed',
                body: 'Pipeline failed.',
<<<<<<< HEAD
                to: 'maazismail7705@gmail.com'
=======
                to: 'YOUR_EMAIL@gmail.com'
>>>>>>> 10ceb7a (added jenkins pipeline)
            )
        }
    }
}
