package com.ecommerce.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.demo.model.login;

@Repository
public interface demorepo extends JpaRepository <login, Integer>{
    
}
