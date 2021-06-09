#!/usr/bin/env groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo config.name
    echo "Param1 is: ${env.param1}"
    echo "Param2 is: ${env.param2}"
    if (env.param1 == 'One default') {
        echo "Param1 is default"
    }
    snDevOpsArtifact(artifactsPayload: """{"artifacts": [{"name": "shared-lib.jar", "version": "1.1","semanticVersion": "1.1.1","repositoryName": "fakerepo"}], "branchName": "master"}""")
   
    return this
}
