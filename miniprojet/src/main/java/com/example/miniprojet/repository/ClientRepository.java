package com.example.miniprojet.repository;

import com.example.miniprojet.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
