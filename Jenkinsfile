node {
    def mvnHome

    stage('Preparation') {
        // Clone the repository
        git 'https://github.com/otaku-codes/mavendemo.git'
        // Set up Maven home
        mvnHome = tool 'MAVEN3' // Ensure you have this Maven tool configured in Jenkins
    }

    stage('Build') {
        withEnv(["MVN_HOME=$mvnHome"]) {
            try {
                // Execute Maven commands with specified goals
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
        // Publish test results and archive artifacts
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
}
