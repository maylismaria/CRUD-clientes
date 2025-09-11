package com.desafio.CRUD.clientes.dto;

import com.desafio.CRUD.clientes.entities.Client;
import jakarta.persistence.Column;

import java.time.LocalDate;

public class ClientDTO {


    private long id;

    private String name;

    private String cpf;

    private Double income;

    private LocalDate birthDate;

    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity){
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
