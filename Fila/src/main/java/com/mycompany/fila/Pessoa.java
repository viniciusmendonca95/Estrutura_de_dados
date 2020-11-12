/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fila;

/**
 *
 * @author vinyj
 */
public class Pessoa {
    
    //Variaveis da pessoa
    private String nome;

    //Construtor da pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    //Getters e Setters da pessoa
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}