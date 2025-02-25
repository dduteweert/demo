pipeline {
    agent any

    stages {
        stage("build") {
            steps {
                // the script that executes on the jenkins server/jenkins agent
                echo 'building the application'
                sh 'mvn build'
            }

        }

        stage("test") {
            steps {
                echo 'testing the application'
            }

        }
    }
}