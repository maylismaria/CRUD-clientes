package com.desafio.CRUD.clientes.service.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg){
        super(msg);
    }

}
