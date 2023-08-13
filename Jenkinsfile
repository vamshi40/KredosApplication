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
                to: 'vamshi.krishna@vassarlabs.com', from: 'jenkins@example.com',
                subject: "Automation Report For: ${env.JOB_NAME} - Success", 
                body: "Hi Team \n\n  Please Find the Automation Report \n\n Status -- Job Success  \n\n\ Application Name -- "${env.JOB_NAME}\" \n\n BuildNo -- build: ${env.BUILD_NUMBER} \n\n View the log at:\n ${env.BUILD_URL} \n\n Blue Ocean:\n${env.RUN_DISPLAY_URL}" \n\n Please Find Attachments Below are the Automation Reports\n\n,
                presendScript: Thanks & Regards\nVamshiQA
                attachmentsPattern: 'reports/ExtentReport.html'
                      )
        }
        failure {
             emailext( 
                 to: 'vamshi.krishna@vassarlabs.com', from: 'jenkins@example.com',
                 subject: "Automation Report For: ${env.JOB_NAME} - Failed", 
                 body: "Hi Team \n\n  Please Find the Automation Report \n\n Status -- Job Success  \n\n\ Application Name -- "${env.JOB_NAME}\" \n\n BuildNo -- build: ${env.BUILD_NUMBER} \n\n View the log at:\n ${env.BUILD_URL} \n\n Blue Ocean:\n${env.RUN_DISPLAY_URL}" \n\n Please Find Attachments Below are the Automation Reports\n\n,
                 presendScript: Thanks & Regards\nVamshiQA
                 attachmentsPattern: 'reports/ExtentReport.html'
                      )
        }
   }
}
