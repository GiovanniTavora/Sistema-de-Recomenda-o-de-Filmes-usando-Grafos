package model;

import java.util.List;

public class Filme {

    private String id;
    private String nome;
    private int ano;

    private List<String> generos;

    private String diretor;

    private List<String> atores;

    public Filme(String id, String nome, int ano, List<String> generos, String diretor, List<String> atores) {

        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.generos = generos;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public String getDiretor() {
        return diretor;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {

        return "Filme {" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                ", diretor='" + diretor + '\'' +
                ", generos=" + generos +
                ", atores=" + atores + '}';
    }
}