# Sistema de Recomendação de Filmes Utilizando Grafos

## Descrição

Este projeto tem como objetivo implementar um sistema de recomendação de filmes baseado em similaridade.

A solução utiliza um grafo ponderado para representar relações entre filmes presentes em uma base de dados do IMDb. Cada filme é modelado como um vértice, enquanto as arestas representam o nível de similaridade entre dois filmes.

A similaridade é calculada utilizando características compartilhadas entre os filmes, como gênero, diretor e elenco.

---

## Objetivo

* Modelar uma rede de filmes utilizando grafos.
* Calcular similaridade entre filmes.
* Construir uma rede de recomendação baseada em conexões.
* Aplicar algoritmos clássicos de Teoria dos Grafos.
* Identificar os filmes mais conectados da rede.

---

## Base de Dados

O projeto utiliza o dataset "IMDb Movie Dataset: All Movies by Genre", disponível no Kaggle: https://www.kaggle.com/datasets/rajugc/imdb-movies-dataset-based-on-genre?select=scifi.csv

A base contém informações como:

* Identificador do filme
* Nome do filme
* Ano de lançamento
* Gêneros
* Diretor
* Elenco

Os arquivos CSV originais foram unificados em um único arquivo para facilitar o processamento dos dados.

---

## Modelagem do Problema

Cada filme é representado por um vértice do grafo.

Uma aresta é criada entre dois filmes quando sua pontuação de similaridade atinge um valor mínimo definido pelo sistema.

A pontuação é calculada utilizando os seguintes pesos:

```text
| Característica   | Peso |
| ---------------- | ---- |
| Gênero em comum  | 2    |
| Diretor em comum | 5    |
| Ator em comum    | 4    |
```

A pontuação final corresponde à soma dos pesos encontrados durante a comparação. Quanto maior a pontuação, maior a similaridade entre os filmes.

---

## Estrutura do Projeto

```text
src/
│
├── app/
│   └── Main.java
│
├── model/
│   ├── Filme.java
│   ├── Vertice.java
│   ├── Aresta.java
│   └── Grafo.java
│
├── utils/
│   └── LeitorCSV.java
│
├── servicos/
│   ├── CalculadoraSimilaridade.java
│   └── ConstrutorGrafo.java
│
├── algoritmos/
│   ├── BFS.java
│   ├── DFS.java
│   └── Dijkstra.java
│
└── analises/
    └── TopFilmes.java
```

---

## Algoritmos Implementados

### Busca em Largura (BFS)

Utilizada para percorrer a rede de filmes explorando os vértices por níveis de proximidade.

### Busca em Profundidade (DFS)

Utilizada para percorrer a rede explorando caminhos completos antes de retornar para outros ramos do grafo.

### Algoritmo de Dijkstra

Utilizado para calcular os caminhos mínimos entre filmes da rede, permitindo identificar relações indiretas de similaridade.

---

## Funcionalidades

* Leitura automática da base de dados CSV
* Construção do grafo de similaridade
* Cálculo de similaridade entre filmes
* Busca em largura (BFS)
* Busca em profundidade (DFS)
* Caminhos mínimos com Dijkstra
* Identificação dos filmes mais conectados da rede

---

## Como Executar

1. Importar o projeto para a IDE Eclipse.
2. Adicionar o arquivo `filmes.csv`, que é o arquivo que foi criado após unificar todos os arquivos da base de dados original, na pasta `data`.
3. Garantir que as bibliotecas externas necessárias Commons Lang e OpenCSV estejam configuradas no Classpath.
4. Executar a classe `Main.java`.

---

## Tecnologias Utilizadas

* Java
* Eclipse IDE
* OpenCSV

---

## Resultados Esperados

Ao final da execução, o sistema:

* Constrói a rede de similaridade entre filmes;
* Executa BFS, DFS e Dijkstra;
* Exibe informações da rede;
* Apresenta os 10 filmes mais conectados do grafo.

---

## Autores

Giovanni Távora Pereira Negrão
