#!/usr/bin/env groovy
def pipFunc(Closure body) {
    node {
        try {
            body()
        } catch (e) {
            throw e
        }

        
    }
}