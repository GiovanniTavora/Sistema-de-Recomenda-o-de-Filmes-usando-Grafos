package algoritmos;

import model.Aresta;
import model.Vertice;

import java.util.*;

public class BFS {

    public static void buscaEmLargura(Vertice origem) {

        Queue<Vertice> fila = new LinkedList<>();

        Set<Vertice> visitados = new HashSet<>();

        fila.add(origem);

        visitados.add(origem);

        System.out.println("BFS iniciando em: " + origem.getFilme().getNome());

        while (!fila.isEmpty()) {

            Vertice atual = fila.poll();

            System.out.println(atual.getFilme().getNome());

            for (Aresta aresta : atual.getAdjacentes()) {

                Vertice vizinho = aresta.getDestino();

                if (!visitados.contains(vizinho)) {

                    visitados.add(vizinho);

                    fila.add(vizinho);
                }
            }
        }
    }
}