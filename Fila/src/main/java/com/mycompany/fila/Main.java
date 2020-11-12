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

public class Main {
    public static void main(String[] args) {
        
        //Instanciando as pessoas
        Pessoa p1 = new Pessoa("Vinícius");
        Pessoa p2 = new Pessoa("Rafaella");
        Pessoa p3 = new Pessoa("Francisco");
        Pessoa p4 = new Pessoa("Brenno");
        Pessoa p5 = new Pessoa("Gledson");
        Pessoa p6 = new Pessoa("Anderson");
        
        //Instanciando a fila
        Fila fila = new Fila();
        
        //Inserindo valores na fila
        fila.Inserir(p1);
        fila.Inserir(p2);
        fila.Inserir(p3);
        fila.Inserir(p4);
        fila.Inserir(p5);
        
        //Verificando se a fila está vazia
        //System.out.println(fila.isEmpty());
        
        //Recuperando o objeto do início da fila
        //System.out.println(fila.Recuperar());
        
        //Verificando o tamanho da fila
        //System.out.println(fila.tamanho());
        
        //Limpando a fila
        //fila.limpa();
        
        //Alterando o dado do início da fila
        //fila.Alterar(p6);
        
        //Removendo o dado do início da fila
        //fila.Remover();

        
        //Declarando o primeiro e ultimo da fila
        p1 = (Pessoa) fila.getPrimeiro();
        p2 = (Pessoa) fila.getUltimo();

        //Printando os dados do primeiro e ultimo da fila
        System.out.println("Primeiro da fila: " + p1.getNome());
        System.out.println("Último da fila: " + p2.getNome());
    }
}
