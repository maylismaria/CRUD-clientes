package com.desafio.CRUD.clientes.dto;

import com.desafio.CRUD.clientes.entities.Client;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class ClientDTO {


    private long id;

    @Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
    @NotBlank(message = "Campo nome requerido")
    private String name;


    @NotBlank(message = "Campo CPF requerido")
    @CPF(message = "CPF inválido")
    private String cpf;

    @NotBlank(message = "Campo income requerido")
    private Double income;

    @PastOrPresent
    @NotBlank(message = "Campo requerido")
    private LocalDate birthDate;

    @Size(min = 0, message = "A quantidade de filhos deve ser igual a 0 ou superior")
    @NotBlank(message = "Campo requerido")
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
