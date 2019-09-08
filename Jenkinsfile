pipeline {
    agent { docker { image 'maven3.3.3' } }
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