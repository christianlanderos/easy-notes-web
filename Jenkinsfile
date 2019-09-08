pipeline {
    agent any
    stages {
        stage('build') {
            steps {
				echo "runing steps"
                bat 'mvn clean install'
				echo "steps finished"
            }
        }
    }
}