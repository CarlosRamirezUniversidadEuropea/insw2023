pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -f insw2023/pom.xml -B -DskipTests clean package'
            }
            post {
                success {
                    echo "Now Archiving the Artifacts....."
                    archiveArtifacts artifacts: '**/*.jar'
                }
            }
        }
        stage('Test') {
            steps {
                sh 'mvn -f insw2023/pom.xml test'
            }
            post {
                always {
                    junit 'insw2023/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
