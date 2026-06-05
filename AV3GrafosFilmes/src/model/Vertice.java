package model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private Filme filme;
    private List<Aresta> adjacentes;

    public Vertice(Filme filme) {
        this.filme = filme;
        this.adjacentes = new ArrayList<>();
    }

    public Filme getFilme() {
        return filme;
    }

    public List<Aresta> getAdjacentes() {
        return adjacentes;
    }

    public void adicionarAresta(Aresta aresta) {
        adjacentes.add(aresta);
    }
}