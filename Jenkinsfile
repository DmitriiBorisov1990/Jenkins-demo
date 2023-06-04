task_branch = "${BRANCH_NAME}"
def branch_name = task_branch.contains("origin") ? task_branch.split('/')[1] : task_branch.trim()
currentBuild.displayName = "$branch_name"
base_git_url = "https://github.com/DmitriiBorisov1990/Jenkins-demo.git"

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

def getProject(String repo,String branch){
    cleanWs()
    checkout scm: [
        $class : 'GitSCM',branches: [[name: branch]],
        userRemoteConfigs :[[url: repo]]
    ]
}
/*
pipeline {
     agent any

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
