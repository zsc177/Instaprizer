pipeline {
    agent any

    tools {
        jdk 'JDK 8'
        maven 'Maven'
    }

    stages {
        stage('Install') {
            steps {
                sh "mvn clean test"
            }
            post {
                always {
                    junit '**/target/*-reports/TEST-*.xml'
                }
            }
        }
    }
}