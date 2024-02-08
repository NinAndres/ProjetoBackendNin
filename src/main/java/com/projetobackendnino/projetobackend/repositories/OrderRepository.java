package com.projetobackendnino.projetobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobackendnino.projetobackend.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
