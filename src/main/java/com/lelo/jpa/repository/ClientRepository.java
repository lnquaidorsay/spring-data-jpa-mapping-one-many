package com.lelo.jpa.repository;

import com.lelo.jpa.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
