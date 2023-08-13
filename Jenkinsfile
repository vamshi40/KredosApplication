pipeline {
    agent any

    tools {
            
        maven "MAVEN_HOME"
    }

    stages {
        stage('Stage 1 - Git Clone') {
            steps {
                // Get the code from GitHub							
               git branch: 'main',  url: 'https://github.com/vamshi40/KredosApplication.git'
            }
        }
        stage('Stage 2 - Compile Code') {
            steps {
                // Command to compile the code							
                bat "mvn compile"
                // or: sh "mvn compile"
            }
        }
        stage('Stage 3 - Run Unit Tests') {
            steps {
                // Command to run tests							
                bat "mvn test"
            }
        }
        stage ('Cucumber Reports') {
            steps {
                cucumber buildStatus: "UNSTABLE",
               fileIncludePattern: "**/cucumber-report.json",
               jsonReportDirectory: 'target'
            }

        }
    }

    post {
        always {
       
           script {
                def reportsPath = findFiles(glob: 'reports/ExtentReport.html')
                if (!reportsPath.isEmpty()) {
                    emailext (
                        subject: 'Cucumber Test Report',
                        body: 'Attached is the Cucumber test report.',
                        attachmentsPattern: 'reports/ExtentReport.html',
                        to: 'vamshi.krishna@vassarlabs.com',
                    )
                }
            }
        }
    }
}
