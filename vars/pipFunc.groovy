#!/usr/bin/env groovy
def call(Closure body) {
    node {
        try {
            body()
        } catch (e) {
            throw e
        }

        
    }
}