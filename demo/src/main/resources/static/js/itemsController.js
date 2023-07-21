 
 const valid=()=>{
   List<login>z = ds.show();

   for(login x:z){
     if(x.getEmail().equals(l.getEmail()) && x.getPassword().equals(l.getPassword())){
       return "index";
     }
   }
   
   return ds.message();
 
 }
    alert("Invalid user")
 }