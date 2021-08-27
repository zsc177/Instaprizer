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
//                 sh "mvn -DskipTests install"
//                 sh "mvn cobertura:cobertura"
            }
//             post {
//                 always {
//                     junit '**/target/*-reports/TEST-*.xml'
//                     step([$class: 'CoberturaPublisher', coberturaReportFile: 'target/site/cobertura/coverage.xml'])
//                 }
//                 always {
//                     junit '**/nosetests.xml'
//                     step([$class: 'CoberturaPublisher', autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/coverage.xml', failUnhealthy: false, failUnstable: false, maxNumberOfBuilds: 0, onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false])
//                 }
//             }
        }
        stage ("Generate Test Report") {
            cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
        }
    }
}