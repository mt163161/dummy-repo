#!/usr/bin/env groovy

@Library('pipeline-library-demo')_

node {
    stage('Greetings') {
        echo "Good Day!"
        sayHello 'Dave'
    }
}