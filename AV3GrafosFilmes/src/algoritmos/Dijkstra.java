package algoritmos;

import model.Aresta;
import model.Vertice;

import java.util.*;

public class Dijkstra {

    public static void calcularMenorCaminho(Vertice origem) {

        Map<Vertice, Integer> distancias = new HashMap<>();

        PriorityQueue<Vertice> fila = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        distancias.put(origem, 0);

        fila.add(origem);

        while (!fila.isEmpty()) {

            Vertice atual = fila.poll();

            for (Aresta aresta : atual.getAdjacentes()) {

                Vertice vizinho = aresta.getDestino();

                int custo = 100 - aresta.getPeso();

                int novaDistancia = distancias.get(atual) + custo;

                if (!distancias.containsKey(vizinho) || novaDistancia < distancias.get(vizinho)) {

                    distancias.put(vizinho, novaDistancia);

                    fila.add(vizinho);
                }
            }
        }

        System.out.println();

        System.out.println("Menores caminhos a partir de: " + origem.getFilme().getNome());

        for (Map.Entry<Vertice, Integer> entrada : distancias.entrySet()) {

            System.out.println(entrada.getKey().getFilme().getNome() + " -> Distancia: " + entrada.getValue()
            );
        }
    }
}