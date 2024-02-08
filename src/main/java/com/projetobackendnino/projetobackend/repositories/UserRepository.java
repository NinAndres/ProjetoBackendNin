package com.projetobackendnino.projetobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobackendnino.projetobackend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
