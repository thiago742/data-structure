resposta: 

pilha = 0(1)
fila = 0(1)
lista encadeada = o(n)

justificativa:

Exercício 1 (Pilha - FILO), a complexidade de tempo das operações push e pop é O(1). Isso acontece porque 
a pilha foi implementada usando um array e um ponteiro topo. O push simplesmente adiciona um elemento na posição topo + 1, e o pop remove 
o elemento da posição topo. Nenhuma dessas operações exige percorrer ou realocar elementos, garantindo tempo constante.

Exercício 2 (Fila - FIFO), todas as operações (enqueue, dequeue, rear e front) também possuem complexidade O(1). A implementação usa um
array circular (fim = (fim + 1) % capacidade;), o que evita deslocamentos ao adicionar ou remover elementos. O enqueue insere um elemento
na posição fim, atualizando o índice circularmente, e o dequeue remove da frente, também ajustando o índice.
como rear e front apenas acessam elementos diretamente, todas as operações são eficientes.

Exercício 3 (Lista Encadeada), as operações push, pop, insert, remove e elementAt têm complexidade O(n).
Isso ocorre porque a lista foi implementada sem um ponteiro direto para o último nó, então, para adicionar, remover ou acessar
um elemento em qualquer posição, é necessário percorrer a lista. Como cada busca pode levar até n passos no pior caso, essas operações são lineares.
