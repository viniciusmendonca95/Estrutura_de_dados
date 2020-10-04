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
public class ListaDuplamenteEncadeadaNoCabeca<T> {

    //Variaveis da lista duplamente encadeada com nó cabeça
    private Celula inicio, fim;
    private int tamanho;
    Celula noCabeca = new Celula(null);

    //Construtor da lista duplamente encadeada com nó cabeça
    public ListaDuplamenteEncadeadaNoCabeca() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        this.noCabeca = new Celula(null);
    }

    //Metodo que adiciona um elemento em uma posição da lista duplamente encadeada com nó cabeça
    public void adiciona(T elemento, int posicao) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Essa posição não existe na lista duplamente encadeada");
        } else {
            Celula nova = new Celula(elemento);
            if (this.tamanho == 0) {
                inicio = nova;
                inicio.setAnterior(noCabeca);
                fim = nova;
                fim.setProximo(noCabeca);
                noCabeca.setAnterior(fim);
                noCabeca.setProximo(inicio);
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
                    nova.setAnterior(noCabeca);
                    noCabeca.setProximo(nova);
                    noCabeca.setAnterior(fim);
                    nova.setProximo(inicio);
                    inicio = nova;
                    Celula proximo = inicio.getProximo();
                    proximo.setAnterior(inicio);
                    this.tamanho += 1;
                } else if (posicao == tamanho) {
                    nova.setProximo(noCabeca);
                    noCabeca.setAnterior(nova);
                    noCabeca.setProximo(inicio);
                    nova.setAnterior(fim);
                    fim.setProximo(nova);
                    fim = nova;
                    this.tamanho += 1;
                } else {
                    Celula anterior = it.getAtual();
                    Celula atual = anterior.getProximo();
                    nova.setProximo(atual);
                    nova.setAnterior(anterior);
                    anterior.setProximo(nova);
                    atual.setAnterior(nova);
                    this.tamanho += 1;
                }
            }
        }
    }

    //Método que adiciona um elemento no inicio da lista duplamente encadeada com nó cabeça
    public void adicionaInicio(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = nova;
            inicio.setAnterior(noCabeca);
            fim = nova;
            fim.setProximo(noCabeca);
            noCabeca.setAnterior(fim);
            noCabeca.setProximo(inicio);
            this.tamanho += 1;
        } else {
            nova.setAnterior(noCabeca);
            noCabeca.setProximo(nova);
            noCabeca.setAnterior(fim);
            nova.setProximo(inicio);
            inicio = nova;
            Celula proximo = inicio.getProximo();
            proximo.setAnterior(inicio);
            this.tamanho += 1;
        }
    }

    //Método que adiciona um elemento no fim da lista duplamente encadeada com nó cabeça
    public void adicionaFim(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = nova;
            inicio.setAnterior(noCabeca);
            fim = nova;
            fim.setProximo(noCabeca);
            noCabeca.setAnterior(fim);
            noCabeca.setProximo(inicio);
            this.tamanho += 1;
        } else {
            nova.setProximo(noCabeca);
            noCabeca.setAnterior(nova);
            noCabeca.setProximo(inicio);
            nova.setAnterior(fim);
            fim.setProximo(nova);
            fim = nova;
            this.tamanho += 1;
        }
    }

    //Método que recupera um elemento de determinada posicao da lista duplamente encadeada com nó cabeça
    public T Recupera(int posicao) {
        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na lista duplamente encadeada");
        } else if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Essa posição não existe na lista duplamente encadeada");
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

    //Metodo que remove um elemento em uma posição da lista duplamente encadeada com nó cabeça
    public void remove(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Essa posição não existe na lista duplamente encadeada");
        } else if (inicio == fim) {
            noCabeca.setAnterior(null);
            noCabeca.setProximo(null);
            inicio = null;
            fim = null;
            this.tamanho -= 1;
        } else if (posicao == 0) {
            Celula novoInicio = inicio.getProximo();
            noCabeca.setProximo(novoInicio);
            novoInicio.setAnterior(noCabeca);
            inicio.setAnterior(null);
            inicio.setProximo(null);
            inicio = novoInicio;
            this.tamanho -= 1;
        } else {
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao -1) {
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
                atual.setAnterior(null);
                atual.setProximo(null);
                noCabeca.setAnterior(anterior);
                anterior.setProximo(noCabeca);
                fim = anterior;
                this.tamanho -= 1;
            } else {
                atual.setAnterior(null);
                atual.setProximo(null);
                anterior.setProximo(proximo);
                proximo.setAnterior(anterior);
                this.tamanho -= 1;
            }
        }
    }

    //Método que remove um elemento do inicio da lista duplamente encadeada com nó cabeça
    public void removeInicio() {
        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na lista duplamente encadeada");
        } else if (inicio == fim) {
            noCabeca.setAnterior(null);
            noCabeca.setProximo(null);
            inicio = null;
            fim = null;
            this.tamanho -= 1;
        } else {
            Celula novoInicio = inicio.getProximo();
            noCabeca.setProximo(novoInicio);
            novoInicio.setAnterior(noCabeca);
            inicio.setAnterior(null);
            inicio.setProximo(null);
            inicio = novoInicio;
            this.tamanho -= 1;
        }
    }

    //Método que remove um elemento do fim da lista duplamente encadeada com nó cabeça
    public void removeFim() {
        if (this.tamanho == 0) {
            throw new IllegalArgumentException("Não existe dado na lista duplamente encadeada");
        } else if (inicio == fim) {
            noCabeca.setAnterior(null);
            noCabeca.setProximo(null);
            inicio = null;
            fim = null;
            this.tamanho -= 1;
        } else {
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != tamanho - 1) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            Celula atual = it.getAtual();
            Celula anterior = atual.getAnterior();
            atual.setAnterior(null);
            atual.setProximo(null);
            noCabeca.setAnterior(anterior);
            anterior.setProximo(noCabeca);
            fim = anterior;
            this.tamanho -= 1;
        }
    }

    //Método que retorna se existe dado na lista duplamente encadeada com nó cabeça
    public boolean existeDado() {
        return this.inicio != null && this.fim != null;
    }

    //Método que retorna o tamanho da lista duplamente encadeada com nó cabeça
    public int tamanho() {
        return tamanho;
    }

    //Método que limpa a lista duplamente encadeada com nó cabeça
    public void limpa() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    //Métodos Getters and Setters para o controle do nó cabeça, início e fim
    public Celula getInicio() {
        return inicio;
    }

    public void setInicio(Celula inicio) {
        this.inicio = inicio;
    }

    public Celula getFim() {
        return fim;
    }

    public void setFim(Celula fim) {
        this.fim = fim;
    }

    public Celula getNoCabeca() {
        return noCabeca;
    }

    public void setNoCabeca(Celula noCabeca) {
        this.noCabeca = noCabeca;
    }
}
