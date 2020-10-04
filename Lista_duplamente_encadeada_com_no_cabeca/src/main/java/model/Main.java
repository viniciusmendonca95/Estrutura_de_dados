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
public class Main {

    public static void main(String[] args) {

        //Instanciando aluno
        Aluno a1 = new Aluno("Vinicius", 25);
        Aluno a2 = new Aluno("Kevin", 26);
        Aluno a3 = new Aluno("Francisco", 29);
        Aluno a4 = new Aluno("Brenno", 18);
        //Aluno a5 = new Aluno("Rafaella", 19);
        //Aluno a6 = new Aluno("Maria", 20);
        //Aluno a7 = new Aluno("José", 30);

        //Instanciando a lista duplamente encadeada
        ListaDuplamenteEncadeadaNoCabeca lista = new ListaDuplamenteEncadeadaNoCabeca();

        //Adicionando objetos no inicio da lista duplamente encadeada
        //lista.adicionaInicio(a1);
        //lista.adicionaInicio(a2);
        //lista.adicionaInicio(a3);
        //lista.adicionaInicio(a4);
        //Adicionando objetos no fim da lista duplamente encadeada
        lista.adicionaFim(a1);
        lista.adicionaFim(a2);
        lista.adicionaFim(a3);
        

        //lista.adicionaFim(a4);
        //lista.adicionaFim(a5);
        //lista.adicionaFim(a6);
        //lista.adicionaFim(a7);
        //Adicionando um elemento em uma posição da lista duplamente encadeada
        //lista.adiciona(a5, 5);
        //Verificando a existencia de dado na lista duplamente encadeada
        //System.out.println(lista.existeDado());
        //Verificando o tamanho da lista duplamente encadeada
        //System.out.println(lista.tamanho());
        //Removendo um elemento de uma posição da lista duplamente encadeada
        //lista.remove(0);
        //Removendo o elemento do inicio da lista duplamente encadeada
        //lista.removeInicio();
        //Removendo o elemento do final da lista duplamente encadeada
        //lista.removeFim();
        //Limpando a lista duplamente encadeada
        //lista.limpa();
        //Recuperando um objeto da lista duplamente encadeada
        //a1 = (Aluno) lista.Recupera(0);
        //a2 = (Aluno) lista.Recupera(1);
        //a3 = (Aluno) lista.Recupera(2);
        //a4 = (Aluno) lista.Recupera(3);
        //a5 = (Aluno) lista.Recupera(4);
        //a6 = (Aluno) lista.Recupera(5);
        //a7 = (Aluno) lista.Recupera(6);
        //Excluir isso
        //Object teste = lista.Recupera(0);
        //Object teste1 = lista.Recupera(1);
        //Object teste3 = lista.Recupera(2);
        //Object teste4 = lista.Recupera(3);
        //Printando valores da lista duplamente encadeada
        //System.out.println(a1.getNome() + " - " + a1.getIdade());
        //System.out.println(a2.getNome() + " - " + a2.getIdade());
        //System.out.println(a3.getNome() + " - " + a3.getIdade());
        //System.out.println(a4.getNome() + " - " + a4.getIdade());
        //System.out.println(a5.getNome() + " - " + a5.getIdade());
        //System.out.println(a6.getNome() + " - " + a6.getIdade());
        //System.out.println(a7.getNome() + " - " + a7.getIdade());
        //Excluir isso
        //System.out.println(teste);
        //System.out.println(teste1);
        //Excluir isso
        System.out.println("Nó Início: " + lista.getInicio());
        System.out.println("Nó Fim: " + lista.getFim());
        System.out.println("Nó Cabeça: " + lista.getNoCabeca());
        System.out.println("    ");
        System.out.println("Nó Cabeça anterior: " + lista.getNoCabeca().getAnterior());
        System.out.println("Nó Cabeça proximo: " + lista.getNoCabeca().getProximo());
        System.out.println("    ");
        System.out.println("Anterior inicio: " + lista.getInicio().getAnterior());
        System.out.println("Proximo inicio: " + lista.getInicio().getProximo());
        System.out.println("    ");
        System.out.println("Anterior fim: " + lista.getFim().getAnterior());
        System.out.println("Proximo fim: " + lista.getFim().getProximo());

        lista.remove(2);
        System.out.println("    ");
        System.out.println("    DEPOIS ");
        System.out.println("    "); 
        System.out.println("Nó Início: " + lista.getInicio());
        System.out.println("Nó Fim: " + lista.getFim());
        System.out.println("Nó Cabeça: " + lista.getNoCabeca());
        System.out.println("    ");
        System.out.println("Nó Cabeça anterior: " + lista.getNoCabeca().getAnterior());
        System.out.println("Nó Cabeça proximo: " + lista.getNoCabeca().getProximo());
        System.out.println("    ");
        System.out.println("Anterior inicio: " + lista.getInicio().getAnterior());
        System.out.println("Proximo inicio: " + lista.getInicio().getProximo());
        System.out.println("    ");
        System.out.println("Anterior fim: " + lista.getFim().getAnterior());
        System.out.println("Proximo fim: " + lista.getFim().getProximo());

    }
}
