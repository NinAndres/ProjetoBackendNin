package com.projetobackendnino.projetobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobackendnino.projetobackend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
