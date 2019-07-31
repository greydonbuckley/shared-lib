# Jenkins Pipeline Shared Library Sample

This project provides easy example of shared library which can be used into Jenkins pipeline.

Setup instructions

1. In Jenkins, go to Manage Jenkins → Configure System. Under Global Pipeline Libraries, add a library with the following settings:
  * Library name: shared-lib
  * Default version: Specify a Git reference (branch or commit SHA), e.g. master
  * Retrieval method: Modern SCM
  * Select the Git type
  * Project repository: https://github.com/tarun-murala/shared-lib
  * Credentials: (leave blank) - As its a public repo

2. Then create a Jenkins job with the following pipeline (note that the underscore _ is not a typo):

```
@Library('shared-lib')_
pipFunc() {

	stage('Print Build Info') {
	    snDevOpsStep '60407d439f723300a1af5bb0657fcf6b'
		printBuildinfo {
			name = "Sample Name"
		}
	}
	stage('Disable balancer') {
	    snDevOpsStep '64407d439f723300a1af5bb0657fcf6b'
		disableBalancerUtils()
	}
	stage('Deploy') {
	    snDevOpsStep 'a8407d439f723300a1af5bb0657fcf6a'
		deploy()
	}
	stage('Enable balancer') {
	    snDevOpsStep 'e0407d439f723300a1af5bb0657fcf6b'
		enableBalancerUtils()
	}
	stage('Check Status') {
	    snDevOpsStep 'e4407d439f723300a1af5bb0657fcf6b'
	    snDevOpsChange()
		checkStatus()
	}
}
```

Run job!
