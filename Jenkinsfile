pipeline {
    agent 'any'

    tools {
        jdk 'JDK 8'
        maven 'Maven'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn --batch-mode -V -U -e clean verify cobertura:cobertura -Dcobertura.report.format=xml -Dsurefire.useFile=false -Dmaven.test.failure.ignore'
//                 sh "mvn install -Dmaven.test.skip=true"
            }
        }
        stage ('Analysis') {
            steps {
                sh 'mvn --batch-mode -V -U -e checkstyle:checkstyle pmd:pmd pmd:cpd findbugs:findbugs spotbugs:spotbugs'
            }
        }
        stage ('Code Coverage') {
            steps {
                cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
            }
        }
    }
    post {
        always {
            junit testResults: '**/target/surefire-reports/TEST-*.xml'

            recordIssues enabledForFailure: true, tools: [mavenConsole(), java(), javaDoc()]
            recordIssues enabledForFailure: true, tool: checkStyle()
            recordIssues enabledForFailure: true, tool: spotBugs()
            recordIssues enabledForFailure: true, tool: cpd(pattern: '**/target/cpd.xml')
            recordIssues enabledForFailure: true, tool: pmdParser(pattern: '**/target/pmd.xml')
        }
    }
}