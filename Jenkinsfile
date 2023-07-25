pipeline {
    agent any

    tools {
        maven 'Maven 3.8.7' 
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/apiTestUserr/NewRepoInternetHerookapp.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn verify'
            }
        }
    }

    post {
        always {
            // Archiver le fichier JSON du rapport
            archiveArtifacts artifacts: 'target/cucumber.json', fingerprint: true

            // Archiver le fichier html du rapport
            archiveArtifacts artifacts: 'target/cucumber-html-reports/cucumber.html', fingerprint: true

            // Envoyer l'email avec les rapports en pièces jointes
            emailext (
                to: 'proservicetestauto@gmail.com', // Remplacez par l'adresse email du destinataire
                subject: 'Rapport de test Cucumber',
                body: 'Bonjour,\nVeuillez trouver ci-joint les rapports générés par Cucumber.',
                attachmentsPattern: 'target/cucumber-html-reports/cucumber.html,target/cucumber.json'
            )
        }
    }
}