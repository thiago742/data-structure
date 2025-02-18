package br.com.thiago.exercicios.tests;

import br.com.thiago.exercicios.node.ListaEncadeada;
import br.com.thiago.exercicios.node.*;

public class NodeTest {

	 public static void main(String[] args) {
		 
	        System.out.println("====== Testando Lista Encadeada ======");

	        ListaEncadeada lista = new ListaEncadeada();

	        lista.push(new Node(10));
	        lista.push(new Node(20));
	        lista.push(new Node(30));

	        System.out.println("Lista atual:");
	        lista.printList();

	        System.out.println("Elemento no índice 1: " + lista.elementAt(1).valor);

	        lista.insert(1, new Node(15));
	        System.out.println("Após inserir 15 na posição 1:");
	        lista.printList();

	        lista.pop();
	        System.out.println("Após remover o último elemento:");
	        lista.printList();

	        lista.remove(1);
	        System.out.println("Após remover o índice 1:");
	        lista.printList();

	        System.out.println("Tamanho da lista: " + lista.size());
	    }
}
