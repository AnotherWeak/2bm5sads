package com.jwt.jwt2.pessoa;

public enum PessoaRole {

    ADMIN("admin"),
    USER("user");

    private String role;

    PessoaRole (String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

}
