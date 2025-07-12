# Calculadora de Estatísticas de Pessoas em Java

Este projeto consiste em um programa Java simples que lê o nome, idade e altura de um número especificado de pessoas. O programa então calcula e exibe a altura média de todas as pessoas, o percentual de pessoas com menos de 16 anos e a lista dos nomes dessas pessoas.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, armazenar os dados das pessoas, calcular as estatísticas e exibir os resultados.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite a quantidade de pessoas a serem digitadas. Insira o número desejado e pressione Enter.
    * Em seguida, para cada pessoa, o programa pedirá que você digite o nome, a idade e a altura, nesta ordem, pressionando Enter após cada entrada. O programa indicará o número da pessoa que está sendo digitada (iniciando do número 0).

5.  **Resultado:** Após inserir os dados de todas as pessoas, o programa exibirá:
    * A altura média de todas as pessoas, formatada com duas casas decimais.
    * O percentual de pessoas com menos de 16 anos, formatado com uma casa decimal.
    * Uma lista contendo o nome de cada pessoa com menos de 16 anos.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de pessoas e armazena esse valor na variável inteira `n`. As variáveis `nmenores`, `percentualMenores` e `mediaAltura` são declaradas para uso posterior.
    3.  Cria três arrays:
        * `nome`: Um array de Strings para armazenar o nome de cada pessoa.
        * `idade`: Um array de doubles para armazenar a idade de cada pessoa.
        * `altura`: Um array de doubles para armazenar a altura de cada pessoa.
        O tamanho de cada array é definido pela quantidade de pessoas informada pelo usuário (`n`).
    4.  Utiliza um loop `for` para iterar `n` vezes (para cada pessoa). Em cada iteração:
        * Solicita ao usuário que digite o nome da pessoa (indicando o número da pessoa).
        * Lê o nome inserido pelo usuário e armazena no array `nome`.
        * Solicita ao usuário que digite a idade da pessoa.
        * Lê a idade inserida pelo usuário (um número decimal) e armazena no array `idade`.
        * Solicita ao usuário que digite a altura da pessoa.
        * Lê a altura inserida pelo usuário (um número decimal) e armazena no array `altura`.
    5.  Inicializa a variável `nmenores` com 0 para contar o número de pessoas com menos de 16 anos.
    6.  Inicializa a variável `mediaAltura` com 0.0 para acumular a soma das alturas.
    7.  Utiliza outro loop `for` para percorrer os arrays com os dados das pessoas. Em cada iteração:
        * Verifica se a idade da pessoa (`idade[i]`) é menor que 16. Se for, incrementa o contador `nmenores`.
        * Adiciona a altura da pessoa (`altura[i]`) à variável `mediaAltura`.
    8.  Calcula o percentual de pessoas com menos de 16 anos. Primeiro, realiza um cast de `nmenores` para `double` para garantir que a divisão seja feita com números de ponto flutuante. Multiplica o resultado por 100.0 para obter o percentual.
    9.  Utiliza o método `printf` para exibir a altura média, formatada com duas casas decimais.
    10. Utiliza o método `printf` para exibir o percentual de pessoas com menos de 16 anos, formatado com uma casa decimal.
    11. Utiliza outro loop `for` para percorrer o array de idades novamente. Em cada iteração:
        * Verifica se a idade da pessoa (`idade[i]`) é menor que 16. Se for, imprime o nome dessa pessoa (`nome[i]`).
    12. Não há necessidade de fechar o `Scanner` neste caso específico, pois o programa termina logo após a exibição dos resultados. No entanto, em programas mais complexos, é uma boa prática fechar o `Scanner` quando não for mais necessário para liberar recursos.
