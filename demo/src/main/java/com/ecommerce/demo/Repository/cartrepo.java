package com.ecommerce.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.demo.model.cart;

@Repository
public interface cartrepo  extends JpaRepository <cart, Integer>{
    
}
