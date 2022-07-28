#!/usr/bin/env groovy

def call(name = 'human') {
    x = 15
    echo "Hello, ${name}-${x}."
}