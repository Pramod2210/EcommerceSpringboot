package com.ecommerce.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.demo.Services.demoservices;
import com.ecommerce.demo.model.cart;
import com.ecommerce.demo.model.login;



@Controller
public class democontroller {
  @Autowired
  demoservices ds;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/loginp")
    public String log(){
      return "login";
    }
    
     @GetMapping("/signup")
    public String sign(){
      return "signup";
    }

    @GetMapping("forget")
    public String forg(Model model) {
      model.addAttribute("data", new login());
      return "forget";
  }
   
      @GetMapping("cart")
    public String car(Model m, cart c){
    
     m.addAttribute("data", ds.so());
      return "cart";
    }
    @GetMapping("buy")
    public String by(){
      return "buy";
    }

    @GetMapping("mentop")
    public String mtop(){
      return "mentop";
    }

    @GetMapping("menbot")
    public String mbot(){
      return "menbot";
    }

    @GetMapping("menacce")
    public String macc(){
      return "menacce";
    }

    @GetMapping("menfoot")
    public String mfot(){
      return "menFoot";
    }
   
     @GetMapping("womentop")
    public String wtop(){
      return "womentop";
    }

      @GetMapping("womenbot")
    public String wbot(){
      return "womenbot";
    }

      @GetMapping("womenfoot")
    public String wfot(){
      return "womenfoot";
    }

      @GetMapping("Beuaty")
    public String wb(){
      return "Beuaty";
    }

      @GetMapping("jewellery")
    public String wj(){
      return "jewellery";
    }

      @GetMapping("Aboutus")
    public String about(){
      return "Aboutus";
    }

@PostMapping("/welpage")
public String addd(@ModelAttribute login l,Model m){
  
   m.addAttribute("firstname",l.getFirstname());
  m.addAttribute("lastname", l.getLastname());
  m.addAttribute("email", l.getEmail());
  m.addAttribute("password",l.getPassword());

 ds.add(l);

 return "login";
}
  
 @PostMapping("/check")
public String chec(@ModelAttribute login l,Model m){

  List<login>z = ds.show();

  for(login x:z){
    if(x.getEmail().equals(l.getEmail()) && x.getPassword().equals(l.getPassword())){
      return "index";
    }
  }
  return "login";
}



@PostMapping("/reset")
public String update(@ModelAttribute login l,Model m){
  List<login>z = ds.show();
  //m.addAttribute("data",ds.show());
   for(login x:z){
    if(x.getEmail().equals(l.getEmail())){
     x.setPassword(l.getPassword());
     x.setFirstname(x.getFirstname());
     x.setLastname(x.getLastname());
  ds.add(x);
  return "login";
}
   } 
   return "forget";

}



////----------------------------- 


  @PostMapping("/Addcart/{id}/{pname}/{price}")
public String cartadd(@PathVariable int id, @PathVariable int price, @PathVariable String pname, @RequestParam("imgurl") String imgurl,Model m) {
    cart c = new cart();
    c.setId(id);
    c.setPrice(price);
    c.setPname(pname);
    c.setImgurl(imgurl);

    ds.adda(c);
     m.addAttribute("data", ds.so());

    return "cart";
}



  @GetMapping("/deletedata/{id}")
  public String deleteTutorial(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
    try {
      ds.delet(id);

      redirectAttributes.addFlashAttribute("message", "The Tutorial with id=" + id + " has been deleted successfully!");
    } catch (Exception e) {
      redirectAttributes.addFlashAttribute("message", e.getMessage());
    }
     
    return "redirect:/cart";
  }

  @GetMapping("/table")
public String showTable(Model model) {
    List<cart> cartData = ds.so();
   // Add this line to check the data
    model.addAttribute("data", cartData);
    return "cart";
}
}





