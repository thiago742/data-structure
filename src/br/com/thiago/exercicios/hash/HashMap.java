package br.com.thiago.exercicios.hash;

public class HashMap {
	
	 	private static final int TAMANHO = 10;
	    private int[] chaves;
	    private int[] valores;
	    private boolean[] ocupado;

	    public HashMap() {
	        this.chaves = new int[TAMANHO];
	        this.valores = new int[TAMANHO];
	        this.ocupado = new boolean[TAMANHO];
	    }
	    
	 // Função hash que calcula o índice armazenando a chave no intervalo 0 a (TAMANHO - 1)
	 // Se a chave for maior que TAMANHO, ela pode colidir com outra chave já existente.
	    private int funcaoHash(int key) {
	        return key % TAMANHO;
	    }

	    public void put(int key, int value) {
	        int indice = funcaoHash(key);

	        while (ocupado[indice] && chaves[indice] != key) {
	            indice = (indice + 1) % TAMANHO;
	        }

	        chaves[indice] = key;
	        valores[indice] = value;
	        ocupado[indice] = true;
	    }

	    public int get(int key) {
	        int indice = funcaoHash(key);

	        while (ocupado[indice]) {
	            if (chaves[indice] == key) {
	                return valores[indice];
	            }
	            indice = (indice + 1) % TAMANHO;
	        }

	        throw new RuntimeException("Chave não encontrada");
	    }

	    public void delete(int key) {
	        int indice = funcaoHash(key);

	        while (ocupado[indice]) {
	            if (chaves[indice] == key) {
	                ocupado[indice] = false;
	                return;
	            }
	            indice = (indice + 1) % TAMANHO;
	        }

	        throw new RuntimeException("Chave não encontrada");
	    }

	    public void clear() {
	        for (int i = 0; i < TAMANHO; i++) {
	            ocupado[i] = false;
	        }
	    }

	    public void printMap() {
	        for (int i = 0; i < TAMANHO; i++) {
	            if (ocupado[i]) {
	                System.out.println("Chave: " + chaves[i] + " | Valor: " + valores[i]);
	            }
	        }
	    }
}