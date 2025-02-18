package br.com.thiago.exercicios.tests;

import br.com.thiago.exercicios.filas.Fila;
import br.com.thiago.exercicios.filas.Pilha;

public class FilasTest {
	
	public static void main(String[] args) {
		
        System.out.println("====== Testando Pilha FILO ======");

        Pilha pilha = new Pilha(5);

        System.out.println("A pilha está vazia? " + pilha.isEmpty()); 

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.top()); 
        System.out.println("Tamanho da pilha: " + pilha.size());

        System.out.println("Removendo elemento: " + pilha.pop());
        System.out.println("Novo topo da pilha: " + pilha.top()); 

        System.out.println("A pilha está vazia? " + pilha.isEmpty()); 
        
        System.out.println("====== Testando Fila FIFO ======");
        
        Fila fila = new Fila(5); 

        System.out.println("A fila está vazia? " + fila.isEmpty()); 

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Frente da fila: " + fila.front()); 
        System.out.println("Fim da fila: " + fila.rear());
        System.out.println("Tamanho da fila: " + fila.size()); 

        System.out.println("Removendo elemento: " + fila.dequeue());
        System.out.println("Nova frente da fila: " + fila.front()); 

        System.out.println("A fila está vazia? " + fila.isEmpty());
	}

}
