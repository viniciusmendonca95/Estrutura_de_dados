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
public class Pilha<T> {

    //Variaveis da pilha
    private Celula topo;
    private int tamanho;

    //Construtor da pilha
    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    //Método que adiciona um elemento no fim da pilha
    public void Push(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            topo = nova;
            this.tamanho += 1;
        } else {
            nova.setAnterior(topo);
            topo = nova;
            this.tamanho += 1;
        }
    }

    //Método que recupera o objeto do topo da pilha
    public T Top() {
        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na pilha");
        } else {
            return (T) topo.getElemento();
        }
    }

    //Método que remove o objeto do topo da pilha
    public void Pop() {
        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na pilha");
        } else if (tamanho == 1) {
            topo = null;
            this.tamanho = 0;
        } else {
            Celula anterior = topo.getAnterior();
            topo.setAnterior(null);
            topo = anterior;
            this.tamanho -= 1;
        }
    }
    
    //Método que altera o valor do objeto do topo da pilha
    public void Pull(T elemento){
        Pop();
        Push(elemento);
    }

    //Método que retorna se a pilha está vazia
    public boolean isEmpty() {
        return this.topo == null;
    }

    //Método que retorna o tamanho da pilha
    public int tamanho() {
        return tamanho;
    }

    //Método que limpa a pilha
    public void limpa() {
        this.topo = null;
        this.tamanho = 0;
    }
}
