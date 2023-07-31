package org.pessoa;

import org.w3c.dom.ls.LSOutput;

public class Pessoa {
    private int id;
    private String nome;
    private String telefone;
    private String email;


    public Pessoa(int id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void atualizar(String nome, String telefone,String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
}
