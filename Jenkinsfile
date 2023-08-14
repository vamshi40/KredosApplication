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
        stage('Stage 3 - Run Regression Tests') {
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
            subject: "Jenkins Pipeline Automation Report For Project: ${env.JOB_NAME} - Success", 
            body: """<p style="font-family: Arial, sans-serif; font-size: 14px;">
Hi Team,<br><br>

Automation Report Details:<br><br>

Status: Job Success<br>
Application Name: "${env.JOB_NAME}"<br>
BuildNo: build: ${env.BUILD_NUMBER}<br><br>

View the log at:<br>
${env.BUILD_URL}<br><br>

Blue Ocean:<br>
${env.RUN_DISPLAY_URL}<br><br>

Please find attachments below are the Automation Test Reports:<br><br>

Thanks & Regards,<br>
VamshiQA
</p>""",
            attachmentsPattern: 'reports/ExtentReport.html,reports/SparkReport.html,reports/ExtentPdf.pdf'
        )
    }

    failure {
    emailext( 
        attachLog: true,
        to: 'vamshi.krishna@vassarlabs.com', from: 'jenkins@example.com',
        subject: "Jenkins Pipeline Automation Report For Project: ${env.JOB_NAME} - Failed", 
        body: """<p style="font-family: Arial, sans-serif; font-size: 14px;">
Hi Team,<br><br>

Automation Report Details:<br><br>

Status: Job Failed<br>
Application Name: "${env.JOB_NAME}"<br>
BuildNo: build: ${env.BUILD_NUMBER}<br><br>

View the log at:<br>
${env.BUILD_URL}<br><br>

Blue Ocean:<br>
${env.RUN_DISPLAY_URL}<br><br>

Please find attachments below are the Automation Test Reports:<br><br>

Thanks & Regards,<br>
VamshiQA
</p>""",
        attachmentsPattern: 'reports/ExtentReport.html,reports/SparkReport.html,reports/ExtentPdf.pdf'
    )
}
 }
}


