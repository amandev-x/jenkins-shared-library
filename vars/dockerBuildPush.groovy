def call(Map args) {
    withCredentials([usernamePassword(credentialsId: args.credentialsId, usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        sh "docker image build -t ${args.imageName}:latest ${args.imageName}:${args.imageTag} ."
        sh "docker tag ${args.imageName}:latest"
        sh "docker push ${args.imageName}:${args.imageTag}"
        sh "docker push ${args.imageName}:latest"
    }
}