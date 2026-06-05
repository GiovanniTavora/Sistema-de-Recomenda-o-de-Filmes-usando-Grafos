package utils;

import com.opencsv.CSVReader;

import model.Filme;

import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {

    public static List<Filme> lerFilmes(String caminho) {

        List<Filme> filmes = new ArrayList<>();
        
        int limite = 15000;

        try {

            CSVReader reader = new CSVReader(new FileReader(caminho));

            String[] linha;

            reader.readNext();

            while ((linha = reader.readNext()) != null) {

                if (linha.length < 11) {
                    continue;
                }

                String id = linha[0];

                String nome = linha[1];

                int ano = converterInteiro(linha[2]);

                List<String> generos = limparLista(linha[5]);

                String diretor = linha[8].trim();

                List<String> atores = limparLista(linha[10]);

                Filme filme = new Filme(id, nome, ano, generos, diretor, atores);

                filmes.add(filme);
                
                if (filmes.size() >= limite) {
                    break;
                }
            }

            reader.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return filmes;
    }

    private static int converterInteiro(String texto) {

        try {

            return Integer.parseInt(texto.trim());

        } catch (Exception e) {

            return 0;
        }
    }

    private static List<String> limparLista(String texto) {

        List<String> lista = new ArrayList<>();

        if (texto == null || texto.isBlank()) {
            return lista;
        }

        String[] partes = texto.split(",");

        for (String parte : partes) {

            String item = parte.trim();

            if (!item.isEmpty()) {

                lista.add(item);
            }
        }

        return lista;
    }
}