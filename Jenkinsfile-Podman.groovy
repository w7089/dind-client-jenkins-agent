pipeline {
    agent  {
        label 'podman'
    }

    stages {
        stage("build image") {
            steps {
                script {
                    sh "podman build jenkins -t docker-in-jenkins ."
                }
            }
        }
    }
}
