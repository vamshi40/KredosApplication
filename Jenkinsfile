pipeline {
    agent any

    tools {
<<<<<<< HEAD

=======
            
>>>>>>> a583c955fdbfec6f8b4fe47d4ce29ecfc3e7f78c
        maven "MAVEN_HOME"
    }

    stages {
        stage('Stage 1 - Git Clone') {
            steps {
<<<<<<< HEAD
                // Get the code from GitHub
=======
                // Get the code from GitHub							
>>>>>>> a583c955fdbfec6f8b4fe47d4ce29ecfc3e7f78c
               git branch: 'main',  url: 'https://github.com/vamshi40/KredosApplication.git'
            }
        }
        stage('Stage 2 - Compile Code') {
            steps {
<<<<<<< HEAD
                // Command to compile the code
=======
                // Command to compile the code							
>>>>>>> a583c955fdbfec6f8b4fe47d4ce29ecfc3e7f78c
                bat "mvn compile"
                // or: sh "mvn compile"
            }
        }
        stage('Stage 3 - Run Regression Tests') {
            steps {
<<<<<<< HEAD
                // Command to run tests
=======
                // Command to run tests							
>>>>>>> a583c955fdbfec6f8b4fe47d4ce29ecfc3e7f78c
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
<<<<<<< HEAD
        emailext(
            attachLog: true,
            to: 'vamshi.krishna@vassarlabs.com,vamshikrishna556677@gmail.com', from: 'jenkins@example.com',
            subject: "Jenkins Pipeline Automation Report For Project: ${env.JOB_NAME} - Success",
=======
        emailext( 
            attachLog: true,
            to: 'vamshi.krishna@vassarlabs.com,vamshikrishna556677@gmail.com', from: 'jenkins@example.com',
            subject: "Jenkins Pipeline Automation Report For Project: ${env.JOB_NAME} - Success", 
>>>>>>> a583c955fdbfec6f8b4fe47d4ce29ecfc3e7f78c
            body: """Hi Team,

Automation Report Details:

Status: Job Success
Application Name: "${env.JOB_NAME}"
BuildNo: ${env.BUILD_NUMBER}

View the log at:
${env.BUILD_URL}

Blue Ocean:
${env.RUN_DISPLAY_URL}

Please find attachments below are the Automation Test Reports:

Thanks & Regards,
VamshiQA""",
            attachmentsPattern: 'reports/ExtentReport.html,reports/SparkReport.html,reports/ExtentPdf.pdf'
        )
    }
    failure {
<<<<<<< HEAD
        emailext(
            attachLog: true,
            to: 'vamshi.krishna@vassarlabs.com,vamshikrishna556677@gmail.com', from: 'jenkins@example.com',
            subject: "Jenkins Pipeline Automation Report For Project: ${env.JOB_NAME} - Failed",
=======
        emailext( 
            attachLog: true,
            to: 'vamshi.krishna@vassarlabs.com,vamshikrishna556677@gmail.com', from: 'jenkins@example.com',
            subject: "Jenkins Pipeline Automation Report For Project: ${env.JOB_NAME} - Failed", 
>>>>>>> a583c955fdbfec6f8b4fe47d4ce29ecfc3e7f78c
            body: """Hi Team,

Automation Report Details:

Status: Job Failed
Application Name: "${env.JOB_NAME}"
BuildNo: ${env.BUILD_NUMBER}

View the log at:
${env.BUILD_URL}

Blue Ocean:
${env.RUN_DISPLAY_URL}

Please find attachments below are the Automation Test Reports:

Thanks & Regards,
VamshiQA""",
            attachmentsPattern: 'reports/ExtentReport.html,reports/SparkReport.html,reports/ExtentPdf.pdf'
        )
    }
}
}

