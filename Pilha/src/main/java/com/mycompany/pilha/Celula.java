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
public class Celula {
    
    //Variaveis de celula
    private Celula anterior;
    private Object elemento;

    //Construtor padrão de celula
    public Celula() {
    }
    
    //Construtor de objeto em celula
    public Celula(Object elemento) {
        this.elemento = elemento;
    }
    
    //Construtor de celula
    public Celula(Celula anterior, Object elemento) {
        this.anterior = anterior;
        this.elemento = elemento;
    }
    
    //Getters and Setters de celula
    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    } 
}
