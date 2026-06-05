package servicos;

import model.Filme;
import model.Grafo;
import model.Vertice;

import java.util.ArrayList;
import java.util.List;

public class ConstrutorGrafo {

    private static final int LIMIAR = 10;

    public static Grafo construirGrafo(
            List<Filme> filmes) {

        Grafo grafo = new Grafo();

        List<Vertice> vertices =
                new ArrayList<>();

        for (Filme filme : filmes) {

            Vertice vertice =
                    new Vertice(filme);

            vertices.add(vertice);

            grafo.adicionarVertice(vertice);
        }

        for (int i = 0; i < vertices.size(); i++) {

            for (int j = i + 1;
                 j < vertices.size();
                 j++) {

                Vertice v1 = vertices.get(i);

                Vertice v2 = vertices.get(j);

                int similaridade =
                        CalculadoraSimilaridade
                                .calcularSimilaridade(
                                        v1.getFilme(),
                                        v2.getFilme()
                                );

                if (similaridade >= LIMIAR) {

                    grafo.conectarVertices(
                            v1,
                            v2,
                            similaridade
                    );
                }
            }
        }

        return grafo;
    }
}