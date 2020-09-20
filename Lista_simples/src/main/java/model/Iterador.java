/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;

/**
 *
 * @author vinyj
 */
public class Iterador<T> implements Iterator {

    //Variaveis Iterador
    T[] itens;
    int posicao = 0;

    //Construtor Iterador
    public Iterador(T[] itens) {
        this.itens = itens;
    }

    //Verifica se ainda existe dado 
    public boolean hasNext() {
        if (posicao < 0 || posicao >= itens.length) {
            return false;
        } else {
            return true;
        }
    }

    //Retorna o próximo valor 
    public Object next() {
        Object item = itens[posicao];
        posicao++;
        return item;
    }

}
