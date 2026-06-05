package algoritmos;

import model.Aresta;
import model.Vertice;

import java.util.HashSet;
import java.util.Set;

public class DFS {

    public static void buscaEmProfundidade(Vertice origem) {

        Set<Vertice> visitados = new HashSet<>();

        System.out.println("DFS iniciando em: " + origem.getFilme().getNome());

        dfs(origem, visitados);
    }

    private static void dfs(
            Vertice atual,
            Set<Vertice> visitados) {

        visitados.add(atual);

        System.out.println(atual.getFilme().getNome());

        for (Aresta aresta : atual.getAdjacentes()) {

            Vertice vizinho = aresta.getDestino();

            if (!visitados.contains(vizinho)) {

                dfs(vizinho, visitados);
            }
        }
    }
}