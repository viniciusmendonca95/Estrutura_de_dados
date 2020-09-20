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
public class ListaEncadeada<T> {

    //Variaveis da lista encadeada
    private Celula inicio, fim;
    private int tamanho;

    //Construtor da lista encadeada
    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    //Metodo que adiciona um elemento em uma posição da lista encadeada
    public void adiciona(T elemento, int posicao) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Essa posição não existe na lista encadeada");
        } else {
            Celula nova = new Celula(elemento);
            if (this.tamanho == 0) {
                inicio = nova;
                fim = nova;
                this.tamanho += 1;
            } else {
                Iterador it = new Iterador(this.inicio);
                int i = 0;
                while (it.hasNext()) {
                    if (i != posicao - 1) {
                        it.next();
                        i++;
                    } else {
                        break;
                    }
                }
                if (posicao == 0) {
                    nova.setProximo(inicio);
                    inicio = nova;
                    this.tamanho += 1;
                } else if (posicao == tamanho) {
                    nova.setProximo(null);
                    fim.setProximo(nova);
                    fim = nova;
                    this.tamanho += 1;
                } else {
                    Celula anterior = it.getAtual();
                    Celula atual = anterior.getProximo();
                    nova.setProximo(atual);
                    anterior.setProximo(nova);
                    this.tamanho += 1;
                }
            }
        }
    }

    //Método que adiciona um elemento no inicio da lista encadeada
    public void adicionaInicio(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = nova;
            fim = nova;
            this.tamanho += 1;
        } else {
            nova.setProximo(inicio);
            inicio = nova;
            this.tamanho += 1;
        }
    }

    //Método que adiciona um elemento no fim da lista encadeada
    public void adicionaFim(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = nova;
            fim = nova;
            this.tamanho += 1;
        } else {
            nova.setProximo(null);
            fim.setProximo(nova);
            fim = nova;
            this.tamanho += 1;
        }
    }

    //Método que recupera um elemento de determinada posicao da lista encadeada
    public T Recupera(int posicao) {

        if (this.tamanho == 0) {

            throw new IllegalArgumentException("Não existe dado na lista encadeada");

        } else if (posicao < 0 || posicao >= this.tamanho) {

            throw new IllegalArgumentException("Essa posição não existe na lista encadeada");

        } else {

            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }

            return (T) it.getAtual().getElemento();
        }
    }

    //Metodo que remove um elemento em uma posição da lista encadeada
    public void remove(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Essa posição não existe na lista encadeada");
        } else if (inicio == fim) {
            inicio = null;
            fim = null;
            this.tamanho -= 1;
        } else if (posicao == 0) {
            Celula proximo = inicio.getProximo();
            inicio.setProximo(null);
            inicio = proximo;
            this.tamanho -= 1;
        } else {
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao - 1) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            Celula anterior = it.getAtual();
            Celula atual = anterior.getProximo();
            Celula proximo = atual.getProximo();
            if (posicao == tamanho - 1) {
                fim = anterior;
                anterior.setProximo(proximo);
                this.tamanho -= 1;
            } else {
                atual.setProximo(null);
                anterior.setProximo(proximo);
                this.tamanho -= 1;
            }
        }
    }

    //Método que remove um elemento do inicio da lista encadeada
    public void removeInicio() {

        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na lista encadeada");

        } else if (inicio == fim) {

            inicio = null;
            fim = null;
            this.tamanho -= 1;

        } else {

            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }

    //Método que remove um elemento do fim da lista encadeada
    public void removeFim() {

        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na lista encadeada");

        } else if (inicio == fim) {

            inicio = null;
            fim = null;
            this.tamanho -= 1;

        } else {
            Iterador it = new Iterador(this.inicio);
            int i = 1;
            while (it.hasNext()) {
                if (i != tamanho - 1) {
                    it.next();
                    i++;
                } else {
                    break;
                }
                fim.setElemento(it.getAtual().getElemento());
                fim.setProximo(null);
                this.tamanho -= 1;
            }
        }
    }

    //Método que retorna se existe dado na lista encadeada
    public boolean existeDado() {
        return this.inicio != null && this.fim != null;
    }

    //Método que retorna o tamanho da lista encadeada
    public int tamanho() {
        return tamanho;
    }

    //Método que limpa a lista encadeada
    public void limpa() {
        this.inicio = null;
        this.fim = null;
    }
}
