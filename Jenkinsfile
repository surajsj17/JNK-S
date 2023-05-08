def gv
pipeline{
    agent any
    parameters{
    choice (name : 'VERSION', choices: ['1','2','3'] , description:'')
    }
    stages{
        stage ('init'){
            steps {
                script{
                        try {
                        gv = load 'script.groovy'
                    } catch (Exception e) {
                        echo "Error loading script.groovy: ${e.message}"
                        error "Failed to load script.groovy"
                    }
                }         
            }
        }
        stage ('Build'){
            steps{
                script{
                    gv.Build()
                }
            }
        }
        stage ('Test'){
            steps{
                script{
                    gv.Test()
                }
            }
        }
        stage ('Deployed'){
            steps{
                script{
                    gv.Deployed()
                }
            }
        }
    }

}
