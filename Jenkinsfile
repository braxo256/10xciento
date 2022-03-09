pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                sh "mvn clean"
            }
        }

        stage('Compile') {
            steps {
                sh "mvn compile"
            }
        }

        stage('Test') {
            steps {
                sh "mvn test"
            }
        }

         stage('Test NewMan') {
            steps {
                sh "npm install -g newman"
                sh "newman run mindicador.postman_collection.json --disable-unicode" 
            }
        }
    }
}
