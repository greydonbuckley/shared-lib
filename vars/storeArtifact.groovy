#!/usr/bin/groovy
def call(Closure body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = config
//	body()
	println(config)
    def url = java.net.URLDecoder.decode(env.JOB_BASE_NAME,"UTF-8");
    println("Uploading: ${url}")
    snDevOpsArtifact(artifactsPayload: """{"artifacts": [{"name": "zibbuild-web.jar", "version": "1.9","semanticVersion": "1.9.1","repositoryName": "services-1031"}]}""")
    echo ">>>>>>>Artifact Registered in Snow!"
}
