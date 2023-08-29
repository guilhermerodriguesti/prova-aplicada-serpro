### Questao Python:

Questao [p1.py](#p1.py) Python
# Requisitos do Bubble Sort:

1. Input: O algoritmo deve receber uma lista de números como entrada.
2. Ordenação: O algoritmo deve ordenar os números na lista em ordem crescente. Ele deve comparar elementos adjacentes e trocá-los de posição se estiverem fora de ordem.
3. Iteração Externa: O algoritmo deve percorrer a lista várias vezes (no máximo, len(numeros) - 1 vezes), onde cada iteração externa coloca o maior elemento não ordenado na posição correta.
4. Iteração Interna: Para cada iteração externa, o algoritmo deve realizar uma iteração interna sobre a lista, comparando elementos adjacentes e realizando as trocas necessárias.
5. Comparação: O algoritmo deve comparar elementos adjacentes, ou seja, comparar numeros[y] e numeros[y + 1].
6. Troca: Se o elemento numeros[y] for maior do que o elemento numeros[y + 1], eles devem ser trocados de posição.
7. Temporário: Durante a troca, um valor temporário (variável temp) deve ser usado para armazenar o valor de numeros[y] temporariamente.
8. Saída: O algoritmo deve retornar a lista ordenada após todas as iterações.

### Questao Java:

Questao [p2.java](#p2.java) Java

Requisitos: Cores App

1. O programa deve ser capaz de gerenciar uma lista de cores.
2. O programa deve ser capaz de adicionar cores à lista.
3. O programa deve permitir a remoção de uma cor da lista, com base na posição.
4. O programa deve ser capaz de ordenar as cores na lista em ordem alfabética.
5. O programa deve permitir a atualização de uma cor na lista, com base na posição.
6. O programa deve imprimir a lista de cores após cada operação (adição, remoção, ordenação e atualização).

# Cenários de Uso:

1. Adicionar Cores:

* O usuário inicia o programa.
* O sistema inicializa uma lista vazia de cores.
* O sistema adiciona a cor "VERDE" à lista.
* O sistema adiciona a cor "AZUL" à lista.
* O sistema adiciona a cor "VERMELHO" à lista.
* O sistema adiciona a cor "AMARELO" à lista.
* O sistema adiciona a cor "CINZA" à lista.

2. Remover Cor:

* O usuário solicita a remoção de uma cor.
* O sistema verifica se a posição é válida.
* O sistema remove a cor na segunda posição da lista.
* O sistema imprime a lista atualizada.

3. Ordenar Cores:

* O usuário solicita a ordenação das cores.
* O sistema executa a ordenação alfabética das cores na lista.
* O sistema imprime a lista ordenada.

4. Atualizar Cor:

* O usuário solicita a atualização de uma cor.
* O sistema verifica se a posição é válida.
* O sistema atualiza a cor na terceira posição da lista para "BRANCO".
* O sistema imprime a lista atualizada.

# Restrições:

* As posições de remoção, atualização e verificação devem ser 0-indexadas.
* O sistema deve garantir que a posição fornecida pelo usuário seja válida para todas as operações.
* A lista de cores não deve conter duplicatas.

### Questao JavaScript:

Questao [p3.js](#p3.js) JavaScript 
# Requisitos Funcionais:
1. O programa deve permitir que o usuário digite um número.
2. O número digitado pelo usuário deve estar no intervalo de 0 a 100;
3. O programa deve calcular o fatorial do número digitado.
4. O programa deve exibir o resultado do cálculo do fatorial no formato: "O fatorial do número [número digitado] é [resultado do fatorial]".
5. Se o número digitado estiver fora do intervalo de 0 a 100, o programa deve exibir a mensagem de erro: "Erro. O número digitado deve ser maior ou igual a 0 e menor ou igual a 100."
