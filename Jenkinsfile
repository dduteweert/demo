pipeline {
    agent any

    stages {
        stage("build") {
            steps {
                // the script that executes on the jenkins server/jenkins agent
                echo 'building the application'
                sh 'mvn -B -DskipTests clean package'
            }

        }

        stage("test") {
            steps {
                echo 'testing the application'
            }

        }
    }
}