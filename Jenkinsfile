pipeline {
    agent any

    tools {
        jdk 'JDK 8'
        maven 'Maven'
    }

    stages {
        stage('Install') {
            steps {
                sh "mvn -U clean test cobertura:cobertura -Dcobertura.report.format=xml"
            }
            post {
                always {
                    junit '**/target/*-reports/TEST-*.xml'
                }
            }
        }
    }
}