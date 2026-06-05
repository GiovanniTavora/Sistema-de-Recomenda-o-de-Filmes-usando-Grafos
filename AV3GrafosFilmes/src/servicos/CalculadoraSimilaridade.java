package servicos;

import model.Filme;

public class CalculadoraSimilaridade {

	private static final int PESO_GENERO = 2;

	private static final int PESO_DIRETOR = 5;

	private static final int PESO_ATOR = 4;

    public static int calcularSimilaridade(Filme filme1,Filme filme2) {

        int similaridade = 0;

        for (String genero1 : filme1.getGeneros()) {

            for (String genero2 : filme2.getGeneros()) {

                if (genero1.equalsIgnoreCase(genero2)) {

                    similaridade += PESO_GENERO;
                }
            }
        }

        if (!filme1.getDiretor().isBlank()
                && !filme2.getDiretor().isBlank()) {

            if (filme1.getDiretor()
                    .equalsIgnoreCase(filme2.getDiretor())) {

                similaridade += PESO_DIRETOR;
            }
        }

        for (String ator1 : filme1.getAtores()) {

            for (String ator2 : filme2.getAtores()) {

                if (ator1.equalsIgnoreCase(ator2)) {

                    similaridade += PESO_ATOR;
                }
            }
        }

        return similaridade;
    }
}