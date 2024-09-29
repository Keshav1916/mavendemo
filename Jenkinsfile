node {
    def mvnHome
    stage('Preparation') {
        git url: 'https://github.com/otaku-codes/mavendemo.git', branch: 'main'
        mvnHome = tool 'MAVEN3'
    }
    stage('Build') {
        withEnv(["MVN_HOME=$mvnHome"]) {
            try {
                if (isUnix()) {
                    sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore=false clean validate compile test package install site'
                } else {
                    bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore=false clean validate compile test package install site/)
                }
            } catch (Exception e) {
                echo "Build step failed: ${e.getMessage()}"
            }
        }
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
}
