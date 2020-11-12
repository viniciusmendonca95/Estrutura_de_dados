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
public class Fila<T> {

    //Variaveis da fila
    private Celula primeiro, ultimo;
    private int tamanho;

    //Construtor da fila
    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    //Método que adiciona um elemento no fim da fila
    public void Inserir(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            primeiro = nova;
            ultimo = nova;
            this.tamanho += 1;
        } else {
            ultimo.setProximo(nova);
            ultimo = nova;
            this.tamanho += 1;
        }
    }

    //Método que recupera o objeto do início da Fila
    public T Recuperar() {
        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na fila");
        } else {
            return (T) primeiro.getElemento();
        }
    }

    //Método que remove o objeto do início da fila
    public void Remover() {
        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na fila");
        } else if (tamanho == 1) {
            primeiro = null;
            ultimo = null;
            this.tamanho = 0;
        } else {
            Celula proximo = primeiro.getProximo();
            primeiro.setProximo(null);
            primeiro = proximo;
            this.tamanho -= 1;
        }
    }

    //Método que altera o valor do objeto do início da fila
    public void Alterar(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na fila");
        } else if (tamanho == 1) {
            primeiro.setProximo(null);
            primeiro = nova;
            ultimo = nova;
        } else {
            Celula proximo = primeiro.getProximo();
            primeiro.setProximo(null);
            primeiro = nova;
            primeiro.setProximo(proximo);
        }
    }

    //Método que retorna se a fila está vazia
    public boolean isEmpty() {
        return this.primeiro == null;
    }

    //Método que retorna o tamanho da fila
    public int tamanho() {
        return tamanho;
    }

    //Método que limpa a fila
    public void limpa() {
        this.primeiro = null;
        this.tamanho = 0;
    }

    //Método que retorna o primeiro da fila
    public Object getPrimeiro() {
        return primeiro.getElemento();
    }
    
    //Método que retorna o último da fila
    public Object getUltimo() {
        return ultimo.getElemento();
    }
}
