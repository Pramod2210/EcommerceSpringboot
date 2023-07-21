package com.ecommerce.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.Repository.cartrepo;
import com.ecommerce.demo.Repository.demorepo;
import com.ecommerce.demo.model.cart;
import com.ecommerce.demo.model.login;

@Service
public class demoservices {
    @Autowired
    demorepo repo;
    
    @Autowired
     cartrepo cr;

    public Object add;

    public void add(login m){
        repo.save(m);
    }

    public List<login>show(){
       return repo.findAll();
    }

   public String message(){
    return "Invalid user";
   }


   /*public login getByid(int id){
      Optional<login>op=repo.findAll();
      if(op.isPresent()){
        return op.get();
      }else{
        return null;
      }
   }*/


 /*  public login getbyemail(String email){
    List<login>op=repo.findAll();
      if(op.contains(email)){
        return op.get();
      }
      else{
        return null;
      }
   }*/


   ///****************** */s

     public void adda(cart c){
        cr.save(c);
    }

    public List<cart> so(){
      return cr.findAll();
     }

     public void delet(int id){
       cr.deleteById(id);
    }
}
