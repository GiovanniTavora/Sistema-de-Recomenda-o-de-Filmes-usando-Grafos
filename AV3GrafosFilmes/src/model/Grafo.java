package model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private List<Vertice> vertices;

    public Grafo() {
        vertices = new ArrayList<>();
    }

    public void adicionarVertice(Vertice vertice) {
        vertices.add(vertice);
    }

    public void conectarVertices(Vertice origem, Vertice destino, int peso) {

        origem.adicionarAresta(
            new Aresta(destino, peso)
        );

        destino.adicionarAresta(
            new Aresta(origem, peso)
        );
    }

    public List<Vertice> getVertices() {
        return vertices;
    }
}
