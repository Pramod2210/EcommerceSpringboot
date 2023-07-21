package com.ecommerce.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ecommerce.demo.Repository.demorepo;
import com.ecommerce.demo.Services.demoservices;
import com.ecommerce.demo.model.login;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	demoservices ds;

	@MockBean
	demorepo dr;

	@Test
	void contextLoads() {

	when(dr.findAll()).thenReturn(Stream.of(new login("abc@gmail.com", "1234567890", "abc123","124589")).collect(Collectors.toList()));
	assertEquals(1,ds.show().size());
	}

}
