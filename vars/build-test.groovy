#!/usr/bin/env groovy
def build() {
    stage('build') {
        // withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
        //     sh 'mvn clean install -DskipTests'
        // }
        sleep 10;
    }
}
def test() {
    stage ('test') {
    //     withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
    //         sh 'mvn test -Dpublish'
    //     }
    sleep 10;
    }
}

return this