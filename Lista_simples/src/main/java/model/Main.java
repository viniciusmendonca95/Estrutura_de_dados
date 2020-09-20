/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Aluno;
import model.Vetor;

/**
 *
 * @author vinyj
 */
public class Main {

    public static void main(String[] args) {

        /*Instanciando a classe genérica Vetor e nesse momento informando
		que ela é do tipo Aluno*/
        Vetor<Aluno> vetor = new Vetor<Aluno>(2);

        //Instanciando um aluno
        Aluno a = new Aluno("ANA", 30);
        Aluno a2 = new Aluno("MARIA", 35);
        Aluno a3 = new Aluno("JOÃO", 40);

        //Adicionando o aluno no vetor
        vetor.Adicionar(a);
        vetor.Adicionar(a2);

        vetor.print();
        //System.out.println(vetor.Tamanho());
        //System.out.println(vetor.Length());

 
        


        //vetor.Limpar();
        //vetor.print();
        //System.out.println(vetor.Tamanho());
        //System.out.println(vetor.Length());
        //System.out.println(vetor.vazio());
        //imprimindo os dados do aluno
        //System.out.println("Nome: " + vetor.Recuperar(0).getNome());
        //System.out.println("Idade: " + vetor.Recuperar(0).getIdade());
        //System.out.println("Nome: " + vetor.Recuperar(1).getNome());
        //System.out.println("Idade: " + vetor.Recuperar(1).getIdade());
    }

}
