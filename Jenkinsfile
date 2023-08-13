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
    success {
        emailext( 
            attachLog: true,
            to: 'vamshi.krishna@vassarlabs.com', from: 'jenkins@example.com',
            subject: "Automation Report For: ${env.JOB_NAME} - Success", 
            body: """Hi Team,

Automation Report Details:

Status: Job Success
Application Name: "${env.JOB_NAME}"
BuildNo: build: ${env.BUILD_NUMBER}

View the log at:
${env.BUILD_URL}

Blue Ocean:
${env.RUN_DISPLAY_URL}

Please find attachments below are the Automation Test Reports:

Thanks & Regards,
VamshiQA""",
            attachmentsPattern: 'reports/ExtentReport.html'
        )
    }
    failure {
        emailext( 
            attachLog: true,
            to: 'vamshi.krishna@vassarlabs.com', from: 'jenkins@example.com',
            subject: "Automation Report For: ${env.JOB_NAME} - Failed", 
            body: """Hi Team,

Automation Report Details:

Status: Job Failed
Application Name: "${env.JOB_NAME}"
BuildNo: build: ${env.BUILD_NUMBER}

View the log at:
${env.BUILD_URL}

Blue Ocean:
${env.RUN_DISPLAY_URL}

Please find attachments below are the Automation Test Reports:

Thanks & Regards,
VamshiQA""",
            attachmentsPattern: 'reports/ExtentReport.html'
        )
    }
}
}
