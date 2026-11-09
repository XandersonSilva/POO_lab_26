package com.mycompany.jogo.n;

public class Jogador {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private int pontuacao;
    private int vida;

    public Jogador( String nome, String login, String senha) {
        this.id = GerenciamentoJogador.contador++;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.pontuacao = 0;
        this.vida = 100;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String imprimirJogador() {
        return "id: " + this.id +
                "\nNome: " + this.nome +
                "\nLogin: " + this.login +
                "\nPontuação: " + this.pontuacao +
                "\nVidas: " + this.vida + "\n";
    }
}
