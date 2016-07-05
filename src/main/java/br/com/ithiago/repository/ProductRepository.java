package br.com.ithiago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ithiago.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
