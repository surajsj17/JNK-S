def Build(){
    sh 'echo "Building......."'
}
def Test(){
    when{
        expression{
           params.choice == '2'
        }
    }
    sh 'echo "Testing........."'
}
def Deployed(){
    sh 'echo "deployed......."'
}
return this  
