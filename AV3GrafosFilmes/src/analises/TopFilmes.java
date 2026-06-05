package analises;

import model.Grafo;
import model.Vertice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TopFilmes {

    public static void mostrarTop10(Grafo grafo) {

        List<Vertice> vertices = new ArrayList<>(grafo.getVertices());

        vertices.sort(Comparator.comparingInt((Vertice v) -> v.getAdjacentes().size()).reversed());

        System.out.println();

        System.out.println("TOP 10 FILMES MAIS CONECTADOS");

        System.out.println("-----------------------------------");

        int limite = Math.min(10, vertices.size());

        for (int i = 0; i < limite; i++) {

            Vertice vertice = vertices.get(i);

            System.out.println((i + 1) + ". " + vertice.getFilme().getNome() + " | Conexoes: " + vertice.getAdjacentes().size());
        }
    }
}