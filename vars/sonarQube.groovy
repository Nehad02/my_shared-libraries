def call() {
    withSonarQubeEnv('SonarCloud') {
        sh '''
            mvn sonar:sonar \
            -Dsonar.projectKey=Nehad02_maven_pro \
            -Dsonar.organization=nehad02
        '''
    }
}
