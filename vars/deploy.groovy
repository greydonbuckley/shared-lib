#!/usr/bin/env groovy

def call(body) {
  /*  echo "Start Deploy"

    new Deployer(script:this).run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail*/
    stage('deploy') {
      //snDevOpsChange()
        echo "inside deploy stage"
        sleep 5
    }

    return this
}
