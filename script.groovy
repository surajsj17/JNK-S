def Build(){
    sh 'echo "Building......."'
}
def Test(){
    when{
        expression{
    choice == '2' || choice == '3'
        }
    }
    sh 'echo "Testing........."'
}
def Deployed(){
    sh 'echo "deployed......."'
}
