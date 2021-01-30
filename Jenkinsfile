def workspace
node
{
    
    stage('Checkout')
    {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/sumit9090/api_testing_user1.git']]])
        workspace=pwd()
    }
    
     stage('static code analysis')
    {
        echo "static code analysis"
    }
    
    stage('Build')
    {
        echo "Build the code"
    }
    
    stage('Unit test')
    {
        echo "unit testing"
    }
}
