def call(String app_name){
   sh "docker build -t "${app_name}" . "
}
  
