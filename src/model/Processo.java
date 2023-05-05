package model;

public class Processo {
    private String nome;
    private int tempoRestante;

    public Processo(String nome, int tempoRestante) {
        this.nome = nome;
        this.tempoRestante = tempoRestante;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoRestante() {
        return tempoRestante;
    }

    public void decrementaTempoRestante() {
        tempoRestante--;
    }

    public boolean temTempoRestante() {
        return tempoRestante > 0;
    }
}