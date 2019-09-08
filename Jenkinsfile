pipeline {
    agent { docker { image 'maven3.3.3' } }
    stages {
        stage('build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}