pipeline{
    agent{
        node{
            label 'docker'
        }
    }
    stages{
        stage('Sonarqube-Scanning'){
            steps{
                script{
                    withSonarQubeEnv('Local_Sonarqube'){
                        def scannerHome = tool 'Sonarqube_Scanner'
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
                }
            }
        }
    }
}