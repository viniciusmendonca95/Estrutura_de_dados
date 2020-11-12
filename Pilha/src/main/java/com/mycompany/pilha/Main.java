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

public class Main {
    public static void main(String[] args) {
        
        //Instanciando as bolas
        Bola b1 = new Bola(1);
        Bola b2 = new Bola(2);
        Bola b3 = new Bola(3);
        Bola b4 = new Bola(4);
        Bola b5 = new Bola(5);
        Bola b6 = new Bola(10);
        
        //Instanciando a pilha
        Pilha pilha = new Pilha();
        
        //Adicionando valores na pilha
        pilha.Push(b1);
        pilha.Push(b2);
        pilha.Push(b3);
        pilha.Push(b4);
        pilha.Push(b5);
     
        //Verificando se a pilha está vazia
        System.out.println(pilha.isEmpty());

        //Limpando a pilha
        pilha.limpa();
        
        //Trocando o valor do ultimo valor da pilha
        pilha.Pull(b6);
        
        //Verificando o tamanho da pilha
        System.out.println(pilha.tamanho());
        
        //Removendo o ultimo valor da pilha
        pilha.Pop();

        //Recuperando o valor do topo da pilha
        b1 = (Bola) pilha.Top();

       
        //Printando o valor do topo da pilha
        System.out.println(b1.getNumero());        
    }
}
