package br.com.thiago.exercicios.filas;

//FILA MODELO FIFO, FIRST IN FIRST OUT
public class Fila {
	 private int[] elementos; 
	    private int frente;
	    private int fim;
	    private int tamanho; 
	    private int capacidade;

	    public Fila(int capacidade) {
	        this.capacidade = capacidade;
	        this.elementos = new int[capacidade];
	        this.frente = 0;
	        this.fim = -1;
	        this.tamanho = 0;
	    }

	    public void enqueue(int valor) {
	        if (tamanho == capacidade) {
	            System.out.println("Erro: Fila cheia!");
	            return;
	        }
	        fim = (fim + 1) % capacidade; 
	        elementos[fim] = valor;
	        tamanho++;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Erro: Fila vazia!");
	            return -1;
	        }
	        int valorRemovido = elementos[frente];
	        frente = (frente + 1) % capacidade; 
	        tamanho--;
	        return valorRemovido;
	    }

	    public int front() {
	        if (isEmpty()) {
	            System.out.println("Erro: Fila vazia!");
	            return -1;
	        }
	        return elementos[frente];
	    }

	    public int rear() {
	        if (isEmpty()) {
	            System.out.println("Erro: Fila vazia!");
	            return -1;
	        }
	        return elementos[fim];
	    }

	    public boolean isEmpty() {
	        return tamanho == 0;
	    }

	    public int size() {
	        return tamanho;
	    }
	}

