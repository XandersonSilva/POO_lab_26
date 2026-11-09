package com.mycompany.jogo.n;

import java.util.List;
import java.util.ArrayList;

public class GerenciamentoJogador {
    private static int maxQtdJogadores = 20;
    private static Jogador jogadores[] = new Jogador[maxQtdJogadores];
    private static int id = 0;
    public  static int contador = 500;

    public GerenciamentoJogador(int qtdJogadores) {
        this.maxQtdJogadores = qtdJogadores;
        jogadores = new Jogador[maxQtdJogadores];
    }

    public static void adicionarJogador( String nome, String login, String senha) {
        if (GerenciamentoJogador.id < GerenciamentoJogador.maxQtdJogadores) {
            GerenciamentoJogador.jogadores[GerenciamentoJogador.id] = new Jogador(nome, login, senha);
            ++GerenciamentoJogador.id;
        } else {
            System.out.println("Sem espaço.");
        }
    }
    
    //BUSCAR JOGADOR
    public static Jogador buscarJogador(int id) {
    	int i;
    	for(i = 0; i < id; i++) {
    		if(jogadores[i].getId() == id)
    			return jogadores[i];
    	}
    	
    	return null;
    }
    //BUSCAR JOGADOR
    public static Jogador verificarLoginValido(String login) {
    	int i;
    	for(i = 0; i < id; i++) {
    		if(jogadores[i].getLogin().equals(login))
    			return jogadores[i];
    	}
    	
    	return null;
        
    }
    
  //REMOVER JOGADOR
    public Boolean removerJogador(int busca) {
    	int i;
    	if(busca == this.jogadores[this.id-1].getId()) {
    		this.jogadores[busca] = null;
    		--this.id;
    		return true;
    	}
    	
    	for(i = 0; i < this.id -1; i++) {
    		if(this.jogadores[i].getId() == busca) {
	    		for(int j = i; j < this.id; j++) {
	    	    	this.jogadores[j] = this.jogadores[j+1];
	    		}
	    		--this.id;
    			return true;
    		}
    	}
    	
    	return false;
    }

    public static String listarJogadores() {
        String res = "";
        for (int i=0;i < id;++i) {
            res += jogadores[i].imprimirJogador();
        }
        return res;
    }
    
    
    public void atualizarJogador(
            int busca,
            String nome,
            String login,
            String senha,
            int pontuacao,
            int vida
    ){
        var jogador = buscarJogador(busca);
        if(jogador == null) {
            System.out.println("Erro, o jogador não foi encontrado!");
            return;
        }
        
        var id_jogador = jogador.getId();
        this.jogadores[id_jogador].setNome(nome);
        this.jogadores[id_jogador].setLogin(login);
        this.jogadores[id_jogador].setSenha(senha);
        this.jogadores[id_jogador].setPontuacao(pontuacao);
        this.jogadores[id_jogador].setVida(vida);
        
        
        
        
        
        
    }
    
    public static void atualizarJogadorSimples(
            int busca,
            String nome,
            String login,
            String senha
    ){
        Jogador jogador = buscarJogador(busca);
        if(jogador == null) {
            System.out.println("Erro, o jogador não foi encontrado!");
            return;
        }
        
        var id_jogador = jogador.getId();
        jogadores[id_jogador].setNome(nome);
        jogadores[id_jogador].setLogin(login);
        jogadores[id_jogador].setSenha(senha);
    }
}
