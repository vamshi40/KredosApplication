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
                emailext attachLog: true, 
                body: '''Hi Team,

                         PFA Below are the Automation Reports




                        please note this is auto generated email

                        Thanks & Regards
                        Vamshi QA''', 
                subject: 'Cucumber Automation Report', 
                attachmentsPattern: 'reports/ExtentReport.html,reports/SparkReport.html,reports/ExtentPdf.pdf',
                to: 'vamshi.krishna@vassarlabs.com'
        }

        success {
            mail to: 'vamshi.krishna@vassarlabs.com', from: 'jenkins@example.com',
                subject: "Example Build: ${env.JOB_NAME} - Failed", 
                body: "Job Failed - \"${env.JOB_NAME}\" build: ${env.BUILD_NUMBER}\n\nView the log at:\n ${env.BUILD_URL}\n\nBlue Ocean:\n${env.RUN_DISPLAY_URL}",
                attachmentsPattern: 'reports/ExtentReport.html,reports/SparkReport.html,reports/ExtentPdf.pdf'
        }
        failure {
            mail to: 'vamshi.krishna@vassarlabs.com', from: 'jenkins@example.com',
                subject: "Example Build: ${env.JOB_NAME} - Failed", 
                body: "Job Failed - \"${env.JOB_NAME}\" build: ${env.BUILD_NUMBER}\n\nView the log at:\n ${env.BUILD_URL}\n\nBlue Ocean:\n${env.RUN_DISPLAY_URL}",
               attachmentsPattern: 'reports/ExtentReport.html,reports/SparkReport.html,reports/ExtentPdf.pdf'
        }
    }
}
