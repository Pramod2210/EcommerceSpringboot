package com.ecommerce.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class cart {
    @Id
    private int id;

    private int price;

    private String pname;

   private String imgurl;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    
    public String getImgurl() {
        return imgurl;
    }
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
    @Override
    public String toString() {
        return "cart [id=" + id + ", price=" + price + ", pname=" + pname + ", imgurl=" + imgurl + "]";
    }


    
}
