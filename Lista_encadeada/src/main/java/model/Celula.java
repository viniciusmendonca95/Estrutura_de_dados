/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vinyj
 */
public class Celula {
    
    //Variaveis de celula
    private Celula proximo;
    private Object elemento;

    //Construtor padrão de celula
    public Celula() {
    }
    
    //Construtor de objeto em celula
    public Celula(Object elemento) {
        this.elemento = elemento;
    }
    
    //Construtor de celula
    public Celula(Celula proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }
    
    //Getters and Setters de celula
    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}