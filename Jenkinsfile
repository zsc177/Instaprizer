pipeline {
    agent any

    tools {
        jdk 'JDK 8'
        maven 'Maven'
    }

    stages {
        stage('Install') {
            steps {
                sh "mvn clean install test cobertura:cobertura -Dcobertura.report.format=xml"
            }
            post {
                always {
                    junit '**/target/*-reports/TEST-*.xml'
//                     step([$class: 'CoberturaPublisher', coberturaReportFile: 'target/site/cobertura/coverage.xml'])
                }
            }
        }
        stage ("Generate Test Report") {
            steps {
                cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
            }
        }
    }
}