package model;

import observer.Observer;

public class Usuario implements Observer {

    private String nome;
    private boolean premium;

    public Usuario(String nome, boolean premium) {
        this.nome = nome;
        this.premium = premium;
    }

    public String getNome() {
        return nome;
    }

    public boolean isPremium() {
        return premium;
    }

    @Override
    public void atualizar(String msg) {
        System.out.println(nome + " recebeu: " + msg);
    }
}