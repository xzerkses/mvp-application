#!Groovy
node{
    stage('checkout'){
        checkout scm
    }

    stage('check tools'){
        bat "echo %cd%"
        bat "gradlew --version"
    }

    stag('clean'){

        sh "./gradlew clean"
    }


    stage('test'){
        sh "./gradlew :web-sandbox:test"
    }

    stage('packaging'){
        sh "./gradlew :web-sandbox:war"
    }

    stage('deploying'){
        sh "./gardlew :web-sandbox:deployTest"
    }
}