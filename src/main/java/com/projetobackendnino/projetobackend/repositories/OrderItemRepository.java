package com.projetobackendnino.projetobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobackendnino.projetobackend.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
