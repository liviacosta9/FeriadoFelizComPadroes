package model;

import visitor.Visitor;

public class Album {

    private String nome;
    private String artista;

    public Album(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}