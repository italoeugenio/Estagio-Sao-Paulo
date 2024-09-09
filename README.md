# Estágio São Paulo

Este projeto contém várias atividades desenvolvidas como parte do estágio. As atividades estão organizadas na pasta `tecnica`, que contém o código-fonte em Java.

## Estrutura do Projeto

1. **Atividade 1**: Cálculo da soma dos números de 1 até um índice definido.
2. **Atividade 2**: Verificação de um número na sequência de Fibonacci.
3. **Atividade 3**: Cálculo de estatísticas de faturamento diário.
    - **Observação**: Para executar a atividade 3, é necessário ter o Maven instalado. Certifique-se de construir o projeto usando o Maven para gerar a classe `Main`.
4. **Atividade 4**: Cálculo do percentual de representação de faturamento por estado.
5. **Atividade 5**: Inversão dos caracteres de uma string.

## Instruções de Execução

1. **Acessando o Projeto**

   Navegue até a pasta `tecnica`, onde você encontrará o diretório `src` com o código-fonte das atividades. A estrutura do diretório é a seguinte:

2. **Executando a Atividade 3**

   Para executar a atividade 3, siga os passos abaixo:

    - Certifique-se de que o Maven está instalado em sua máquina.
    - Navegue até o diretório `tecnica` no terminal.
    - Construa o projeto usando o Maven com o comando:

      ```bash
      mvn clean install
      ```

    - Após a construção bem-sucedida, você pode executar a classe `Main` para testar a atividade 3.

3. **Configurando o Caminho do Arquivo JSON**

   A atividade 3 utiliza um arquivo JSON localizado na pasta `atividades/ex03/dados`. Se você encontrar problemas com o caminho relativo, siga as instruções abaixo para ajustar o caminho:

    - **Caminho Relativo:** O caminho usado no código é `atividades/ex03/dados/dados.json`. Este caminho é relativo ao diretório onde o código é executado.

    - **Caminho Absoluto:** Se o caminho relativo não funcionar, você pode precisar usar um caminho absoluto. Por exemplo:

      ```java
      String caminhoArquivoJson = "C:/Users/usuario/Documentos/Estagio-Sao-Paulo/tecnica/src/atividades/ex03/dados/dados.json";
      ```

    - **Atualize o Código:** Caso precise ajustar o caminho, modifique a linha no arquivo `Main.java` que define o caminho do arquivo JSON:

      ```java
      String caminhoArquivoJson = "caminho/para/seu/arquivo/dados.json";
      ```

4. **Testando as Outras Atividades**

   As demais atividades podem ser testadas individualmente. Navegue até a pasta `Estagio-Sao-Paulo/tecnica/src/atividades` e execute o código conforme necessário para testar cada uma das atividades.

## Observações

- Certifique-se de que todas as dependências necessárias estão instaladas e que o projeto está corretamente configurado.
- Se houver algum problema com a execução ou com o caminho dos arquivos, verifique a configuração do seu ambiente de desenvolvimento e os caminhos dos arquivos.
