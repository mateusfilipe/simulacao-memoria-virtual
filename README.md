# Simualação de uma Memória Virtual 🧠

<img width="34%" src="https://www.univercidade.net/wp-content/uploads/2015/09/7778605624_amnesie.gif">

## Resumo
Este projeto foi feito para um trabalho na disciplina de Sistemas Operacionais.
O objetivo dele é gerar como resposta um arquivo texto contendo na primeira linha o número total de cópias de páginas realizadas da memória virtual para a memória principal, e na segunda linha deverá listar em ordem crescente todas as páginas que estavam presentes na memória ao final da simulação, separadas por espaço.

## Arquivos do Projeto

- Pacote: Principal

  - <b>main.java</b>: Arquivo principal com a leitura e a chamada das funções a serem desenvolvidas.
- Pacote: Pilha
  - <b>Bloco.java</b>: Bloco que armazena os elementos de uma pilha;
  - <b>PilhaTAD.java</b>: Interfaçe para a pilha;
  - <b>Pilha.java</b>: Implementação dos métodos da pilha.
- Pacote: Fila
  - <b>Node.java</b>: Nó da fila com os dados dos elementos;
  - <b>FilaTAD.java</b>: Interface para a fila;
  - <b>Fila.java</b>: Implementação dos métodos da fila.
- <b>Teste.txt</b>: Arquivo de entrada com os testes a serem executados, onde a primeira linha contém três valores, 'm', 'n' e 'p', sendo ‘m’ o tamanho em bytes da memória virtual, ‘n’ o tamanho em bytes da memória física e ‘p’ o tamanho em bytes da página/moldura. A segunda linha conterá um valor ‘x’ que determina a quantidade de acessos que serão feitos à memória. As próximas ‘x’ linhas conterão os endereços de memória ‘e’ que serão acessados.
- <b>Saida.txt</b>: Arquivo a ser gerado a após o código executar, onde conterá na primeira linha o número total de cópias de páginas realizadas da memória virtual para a memória principal, e na segunda linha deverá listar em ordem crescente todas as páginas que estavam presentes na memória ao final da simulação, separadas por espaço.

### Exemplo de Teste

|   Entrada  |       Saída      |
|------------|------------------|
| 1024 64 16 | 7                |
| 15         | 0 1 12 63        |
| 0          |                  |
| 16         |                  |
| 1013       |                  |
| 507        |                  |
| 207        |                  |
| 1020       |                  |
| 18         |                  |
| 1          |                  |
| 362        |                  |
| 18         |                  |
| 1015       |                  |
| 192        |                  |
| 207        |                  |
| 360        |                  |
| 10         |                  |
