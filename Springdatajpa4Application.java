package com.shubhamit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.context.ConfigurableApplicationContext;

import com.shubhamit.Entity.Product;
import com.shubhamit.Reposatory.productReposatory;

@SpringBootApplication
public class Springdatajpa4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Springdatajpa4Application.class, args);
		productReposatory reposatory=context.getBean(productReposatory.class);
		
		Product p1=new Product();
		p1.setProductName("Oppo A30");
		p1.setProductPrice(34500);
		Product p2=new Product();
		p2.setProductName("Samsung sultra20");
		p2.setProductPrice(78500);
		
		reposatory.saveAll(Arrays.asList(p1,p2));
		
		
		
	}

}
