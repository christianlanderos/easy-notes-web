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
	post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
			mail to: 'c_landeros_a@yahoo.com.mx',
             subject: "Succeded Pipeline: ${currentBuild.fullDisplayName}",
             body: "Success with ${env.BUILD_URL}"
        }
        failure {
            echo 'This will run only if failed'
			mail to: 'c_landeros_a@yahoo.com.mx',
             subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Something is wrong with ${env.BUILD_URL}"
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}