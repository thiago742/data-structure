package br.com.thiago.exercicios.tests;

import br.com.thiago.exercicios.hash.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		 HashMap mapa = new HashMap();
		 	
		 	//inserir chaves acima de 9 (tamanho -1) gera colisões como citado na class hashmap
	        mapa.put(1, 100);
	        mapa.put(2, 200);
	        mapa.put(12, 1200); 

	        
	        System.out.println("Valor da chave 1: " + mapa.get(1)); 
	        System.out.println("Valor da chave 2: " + mapa.get(2));
	        System.out.println("Valor da chave 12: " + mapa.get(12));
	        
	        System.out.println("\nMapa atual:");
	        mapa.printMap();

	        mapa.delete(2);
	        System.out.println("\nChave 2 removida.");

	        try {
	            System.out.println("Valor da chave 2: " + mapa.get(2));
	        } catch (RuntimeException e) {
	            System.out.println("Erro ao buscar chave 2: " + e.getMessage());
	        }

	        System.out.println("\nMapa atual:");
	        mapa.printMap();

	        mapa.clear();
	        System.out.println("\nMapa após limpar:");
	        mapa.printMap();
	    }
}
