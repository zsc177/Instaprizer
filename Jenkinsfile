pipeline {
    agent any

    tools {
        jdk 'JDK 8'
        maven 'Maven'
    }

    stages {
        stage('Install') {
            steps {
                sh "mvn install"
            }
        }
        stage ("Generate Test Report") {
            steps {
                cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
            }
        }
    }
}