pipeline {
    agent any

    tools {
        jdk 'JDK 8'
        maven 'Maven'
    }

    stages {
        stage('Install') {
            steps {
                sh "mvn clean cobertura:cobertura -Dcobertura.report.format=xml"
                sh "mvn install -Dmaven.test.skip=true"
            }
            post {
                always {
                    junit '**/target/*-reports/TEST-*.xml'
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