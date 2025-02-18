package br.com.thiago.exercicios.filas;

//FILA MODELO FIFO, FIRST IN FIRST OUT
public class Pilha {
	
    private int[] elementos; 
    private int topo; 

    public Pilha(int capacidade) {
        this.elementos = new int[capacidade];
        this.topo = -1; 
    }

    public void push(int valor) {
        if (topo == elementos.length - 1) {
            System.out.println("Erro: Pilha cheia!");
            return;
        }
        elementos[++topo] = valor;
    }
    
    public boolean isEmpty() {
        return topo == -1;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1; 
        }
        return elementos[topo--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        return elementos[topo];
    }

    public int size() {
        return topo + 1;
    }
}