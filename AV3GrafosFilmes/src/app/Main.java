package app;

import algoritmos.BFS;
import algoritmos.DFS;
import algoritmos.Dijkstra;
import analises.TopFilmes;
import java.util.List;
import model.Filme;
import model.Grafo;
import servicos.ConstrutorGrafo;
import utils.LeitorCSV;

public class Main {

    public static void main(String[] args) {

        String caminho = "data/filmes.csv";

        List<Filme> filmes = LeitorCSV.lerFilmes(caminho);

        System.out.println("Filmes carregados: "+ filmes.size());

        Grafo grafo = ConstrutorGrafo.construirGrafo(filmes);

        System.out.println("Vertices no grafo: " + grafo.getVertices().size());
        
        System.out.println();
        
        BFS.buscaEmLargura(grafo.getVertices().get(0));
       
        System.out.println();
        
        DFS.buscaEmProfundidade(grafo.getVertices().get(0));
        
        System.out.println();

        Dijkstra.calcularMenorCaminho(grafo.getVertices().get(0));
        
        System.out.println();

        TopFilmes.mostrarTop10(grafo);
    }
}