/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pilha;

/**
 *
 * @author vinyj
 */
public class Bola {
    
    //Variaveis da bola
    private int numero;

    //Construtor padrão de Aluno
    public Bola() {
        this.numero = 0;
    }

    //Construtor de Aluno
    public Bola(int numero) {
        this.numero = numero;
    }
    
    //Getters and Setters de aluno
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}