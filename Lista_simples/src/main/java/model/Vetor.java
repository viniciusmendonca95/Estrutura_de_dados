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
public class Vetor<T> {

    //Vetor Genérico	
    private T[] vetor;

    //Variável que controla quantidade de elementos do vetor
    private int qntElementos = 0;

    //Construtor específico da Classe Vetor
    public Vetor(int tam) {

        //Criando um novo vetor genérico
        vetor = (T[]) new Object[tam];

        //this.qntElementos = tam;
    }

    //Método que verifica se existe dado em uma posição do vetor
    public boolean existeDado(int posicao) {
        return vetor[posicao] != null;
    }

    //Método que retorna o valor de uma posição do vetor
    public T Recuperar(int posicao) {
        if ((posicao < 0 || posicao > Tamanho()) || (!existeDado(posicao))) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return vetor[posicao];
    }

    //Método que verifica se o vetor está vazio
    public boolean vazio() {
        return Tamanho() == 0;
    }

    //Método que adiciona no vetor usando o recurso de Iterador
    public void AdicionarIt(T elemento) {

        //if (Tamanho() == vetor.length) {
        //    redimensionar();
        //}
        //Passamos o vetor como parâmetro para o iterador
        Iterador it = new Iterador(vetor);

        int i = 0;
        while (it.hasNext()) { //percorrendo o vetor usando iterador

            if (it.next() == null) {
                vetor[i] = elemento;
                qntElementos++;
                break;
            }
            i++;
        }
    }

    //Método que adiciona no vetor
    public void Adicionar(T elemento) {

        redimensionar();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = elemento;
                qntElementos++;
                break;
            }
        }
    }

    //Método que adiciona no vetor
    public void Adiciona(T elemento, int posicao) {
        redimensionar();
        if ((posicao < 0 || posicao > Tamanho()) || (!existeDado(posicao))) {
            throw new IllegalArgumentException("Posição inválida");
        }
        vetor[posicao] = elemento;
        qntElementos++;
    }

    //Método que adiciona no início do vetor
    public void adicionaInicio(T elemento) {
        redimensionar();
        for (int i = vetor.length - 2; 0 < i + 1; i--) {
            vetor[i + 1] = vetor[i];
        }
        vetor[0] = elemento;
        qntElementos++;
    }

    //Método que adiciona no fim do vetor
    public void adicionaFim(T elemento) {
        redimensionar();
        vetor[vetor.length - 1] = elemento;
        qntElementos++;

    }

    //Método que remove do vetor em uma determinada posição
    public void Remover(int posicao) {
        if ((posicao < 0 || posicao > Tamanho()) || (!existeDado(posicao))) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < vetor.length - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[vetor.length - 1] = null;
        qntElementos--;
    }

    //Método que remove do início do vetor
    public void RemoverInicio() {
        if (vetor[0] == null) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = 1; i < vetor.length; i++) {
            vetor[i - 1] = vetor[i];
        }
        vetor[vetor.length - 1] = null;
        qntElementos--;
    }

    //Método que remove do fim do vetor
    public void RemoverFim() {
        if (vetor[vetor.length - 1] == null) {
            throw new IllegalArgumentException("Posição inválida");
        }
        vetor[vetor.length - 1] = null;
        qntElementos--;
    }

    //Método que retorna o tamanho atual do vetor
    public int Tamanho() {
        return qntElementos;
    }

    //Método que retorna o comprimento atual do vetor
    public int Length() {
        return vetor.length;
    }

    //Método que limpa/apaga todas as posições do vetor
    public void Limpar() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = null;
        }
        qntElementos = 0;
    }

    //Método que dobra o tamanho do vetor caso ele atinja o seu tamanho.
    public void redimensionar() {
        if (Tamanho() == vetor.length) {
            T[] novoVetor = (T[]) new Object[vetor.length * 2];
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;

        }

    }

    //Método que printa o vetor.
    public void print() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
