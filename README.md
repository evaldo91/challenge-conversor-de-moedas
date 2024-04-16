
#   Conversor de Moeda - Desafio ONE - Java - Backend (Java 21)

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

O Conversor de Moeda é um programa em Java que permite aos usuários converter entre diferentes moedas utilizando a API ExchangeRate-API. Este programa foi desenvolvido como parte do Desafio ONE da turma 6.

## Funcionalidades

-   Conversão entre 14 moedas diferentes com a cotação atualizada:
    -   Real Brasileiro (BRL)
    -   Dólar Americano (USD)
    -   Euro (EUR)
    -   Libra Esterlina (GBP)
    -   Iene (JPY)
    -   Dólar Australiano (AUD)
    -   Franco Suíço (CHF)
    -   Dólar Canadense (CAD)
    -   Renminbi (Yuan) (CNY)
    -   Peso Argentino (ARS)
    -   Lira Turca (TRY)
    -   Boliviano Boliviano (BOB)
    -   Peso Chileno (CLP)
    -   Peso Colombiano (COP)

## Funcionalidades Extra

-   **Histórico de Conversões**: Adiciona a capacidade de rastrear e exibir o histórico das últimas conversões realizadas, oferecendo aos usuários uma visão completa de suas atividades. _**(Desenvolvimento ainda não iniciado)**_
-   ~~**Suporte para Mais Moedas**: Expande a lista de moedas disponíveis para escolha, permitindo que os usuários convertam entre uma variedade ainda maior de opções monetárias.~~
-   **Registros de Logs**: Utiliza as funções da biblioteca java.time para criar registros que registrem as conversões realizadas, incluindo informações sobre quais moedas foram convertidas e em que momento. _**(Desenvolvimento ainda não iniciado)**_

## Utilização

### Obtendo e configurando Apikey:

1.  Entre no site [ExchangeRate-API](https://www.exchangerate-api.com/).
2.  Faça o cadastro e obtenha sua Apikey.
3.  Copie a Apikey.

### Executando o programa:

#### Baixando ou clonando o repositório:

1.  Baixe/clone o repositório do GitHub.
2.  No caso de download, extraia o arquivo ZIP.
3.  Cole a Apikey no arquivo `api.txt`:
    -   Se baixou o ZIP compilado, cole a Apikey no arquivo `api.txt` que está na raiz do projeto.
    -   Se clonou o repositório, cole a Apikey no arquivo `api.txt` que está no diretório `/src/br/com/evaldo91/conversor/`.
4.  Abra um terminal (Mac e Linux) ou prompt de comando (Windows) na pasta onde está o arquivo `conversor.jar` ou na raiz do projeto (caso tenha clonado o repositório).
5.  Execute o comando `java -jar conversor.jar`.

#### Executando diretamente da IDE:

1.  Abra o projeto em sua IDE Java preferida.
2.  Cole a Apikey no arquivo `api.txt` conforme descrito anteriormente.
3.  Execute o programa.
4.  Escolha a moeda de origem e a moeda de destino.
5.  Insira o valor a ser convertido.
6.  O programa fornecerá o valor convertido com base na taxa de câmbio atual.

## Contribuição

Se desejar contribuir para o projeto, siga estas diretrizes:

-   Faça um fork do repositório.
-   Crie uma nova branch para sua contribuição.
-   Faça suas alterações e commit.
-   Envie um pull request com uma descrição detalhada das suas alterações.

## Licença

Este projeto está licenciado sob a Licença MIT.
