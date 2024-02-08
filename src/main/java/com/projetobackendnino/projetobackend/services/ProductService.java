package com.projetobackendnino.projetobackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetobackendnino.projetobackend.entities.Product;
import com.projetobackendnino.projetobackend.repositories.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
    return repository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> obj = repository.findById(id);
    return obj.get();
  }
}
