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
public class Aluno {

    //Variaveis de Aluno
    private String nome;
    private int idade;

    //Construtor vazio de Aluno
    public Aluno() {
        this.nome = " ";
        this.idade = 0;
    }

    //Construtor de Aluno
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getters and Setters de Aluno
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

}
