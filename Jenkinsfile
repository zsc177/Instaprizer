pipeline {
    agent any

    tools {
        jdk 'JDK 8'
        maven 'Maven'
    }

    stages {
        stage('Install') {
            steps {
                sh "mvn clean install test"
            }
            post {
                always {
                    junit '**/target/*-reports/TEST-*.xml'
                }
            }
        }
        stage ("Generate Test Report") {
            steps {
                cobertura coberturaReportFile: '**/target/site/cobertura/coverage.xml'
            }
        }
    }
}