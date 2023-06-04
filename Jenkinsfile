task_branch = "${BRANCH_NAME}"
def branch_name = task_branch.contains("origin") ? task_branch.split('/')[1] : task_branch.trim()
currentBuild.displayName = "$branch_name"
currentBuild.description =  "I like Jenkins"
base_git_url = "https://github.com/DmitriiBorisov1990/Jenkins-demo.git"

properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '1', numToKeepStr: '5')),
            [$class: 'GitnubProjectProperty', displayName: 'my Jenkins demo from Jenkinsfile', projectUrlStr: '$base_git_url'],
            pipelineTriggers([])])

node {
    withEnv(["branch=${branch_name}","base_url=${base_git_url}"]) {
        stage("Checkout branch") {
            if(!"branch_name".contains("master")) {
                try{
                    getProject("$base_git_url","$branch_name")
                } catch(err){
                   echo "Fail get branch  $branch_name"
                   throw ("${err}")
                }
            } else {
                echo "Current branch is master"
            }
        }
    }
}

def getProject(String repo,String branch) {
    cleanWs()
    checkout scm: [
        $class : 'GitSCM',branches: [[name: branch]],
        userRemoteConfigs :[[url: repo]]
        echo "Current branch is $branch_name"
    ]
}
/*
pipeline {
     agent any
     options {
        buildDiscarder(logRotator(numToKeepStr:'5'))
     }
     stages {
        stage ('clean') {
            steps {
                sh "clean"
            }
        }
        stage('test')
            steps {
                sh "test"
            }
     }
 } */
