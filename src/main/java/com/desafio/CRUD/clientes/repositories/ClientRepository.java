package com.desafio.CRUD.clientes.repositories;

import com.desafio.CRUD.clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
