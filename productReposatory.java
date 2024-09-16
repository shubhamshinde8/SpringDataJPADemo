package com.shubhamit.Reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shubhamit.Entity.Product;

public interface productReposatory extends JpaRepository<Product, Integer>{
   
}
