pipeline {
    agent any
    stages {
        stage('Create Directory') {
            steps {
                script {
                    def dirName = "my_new_directory" // Name of the directory to create
                    sh "mkdir -p ${dirName}" // Command to create the directory
                    echo "Directory '${dirName}' has been created."
                }
            }
        }
    }
}