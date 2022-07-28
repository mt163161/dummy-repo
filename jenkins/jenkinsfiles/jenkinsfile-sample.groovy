#!/usr/bin/env groovy

// @Library('pipeline-library-demo@main')_

node {
    stage('Greetings') {
        echo "Good Day!"
        // sayHello 'Dave'
    }
}