pipeline {
    agent any

    tools {
        jdk 'JDK 8'
        maven 'Maven'
    }

    stages {
        stage('Install') {
            sh "mvn install"
        }
        stage ("Generate Test Report") {
            cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
        }
    }
}