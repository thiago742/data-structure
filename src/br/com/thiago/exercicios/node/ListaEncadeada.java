package br.com.thiago.exercicios.node;

public class ListaEncadeada {
	
    private Node head;
    private int tamanho;
    
    public ListaEncadeada() {
    	this.head = null;
    	this.tamanho = 0;
    }
    
    public void push(Node node) {
    	if (head == null) {
    		head = node;
    	} else {
    		Node atual = head;
    		while (atual.proximo != null) {
    			atual = atual.proximo;
    		}
    		atual.proximo = node;
    	}
    	tamanho ++;
    }
    
    public Node pop() {
    	if (head == null) {
    		return null;
    	}
    	if (head.proximo == null) {
    		Node removido = head;
    		head = null;
    		return removido;
    	}
    	Node atual = head;
    	Node anterior = null;
    	
    	while (atual.proximo != null) {
    		anterior = atual;
    		atual = atual.proximo;
    	}
        anterior.proximo = null;
        tamanho--;
    	return atual;
    }
    
    public void insert(int index, Node node) {
    	if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
    	}
    	
    	if (index == 0) {
    		node.proximo = head;
    		head = node;
    	} else {
    		Node atual = head;
    		for (int i = 0; i > index - 1; i++) {
    			atual = atual.proximo;
    		}
    		node.proximo = atual.proximo;
    		atual.proximo = node;
    	}
    	tamanho ++;
    }
    
    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            head = head.proximo;
        } else {
            Node atual = head;
            Node anterior = null;

            for (int i = 0; i < index; i++) {
                anterior = atual;
                atual = atual.proximo;
            }

            anterior.proximo = atual.proximo;
        }
        tamanho--;
    }
    
    public Node elementAt(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        Node atual = head;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }

        return atual;
    }
    
    public int size() {
        return tamanho;
    }

    public void printList() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
