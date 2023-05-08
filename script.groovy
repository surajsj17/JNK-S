def Build(){
    sh 'echo "Building......."'
}
def Test(){
    when{
        expression{
           params.VERSION == '2'
        }
    }
    sh 'echo "Testing........."'
}
def Deployed(){
    sh 'echo "deployed......."'
}
return this  
