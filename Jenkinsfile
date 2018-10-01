#!Groovy
node{
    stage('checkout'){
        checkout scm
    }

    stage('check tools'){
        bat "echo %cd%"
        bat "gradlew --version"
    }

    stage('clean'){

        bat "gradlew clean"
    }


    stage('test'){
        bat "gradlew :web-sandbox:test"
    }

    stage('packaging'){
        bat "gradlew :web-sandbox:war"
    }

    stage('deploying'){
        bat "gardlew :web-sandbox:deployBeta"
    }
}