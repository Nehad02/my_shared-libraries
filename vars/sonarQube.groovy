def call() {
    withSonarQubeEnv('SonarCloud') {
        sh "mvn sonar:sonar"
    }
}
