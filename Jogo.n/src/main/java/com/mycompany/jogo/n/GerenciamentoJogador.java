package com.mycompany.jogo.n;

public class GerenciamentoJogador {
    private static int maxQtdJogadores = 20;
    private static Jogador jogadores[] = new Jogador[maxQtdJogadores];
    private static int id = 0;
    public  static int contador = 500;
    private static GerenciamentoJogador instancia = null;

    private GerenciamentoJogador(int qtdJogadores) {
        GerenciamentoJogador.maxQtdJogadores = qtdJogadores;
        jogadores = new Jogador[maxQtdJogadores];
    }

    public void adicionarJogador( String nome, String login, String senha) {
        if (GerenciamentoJogador.id < GerenciamentoJogador.maxQtdJogadores) {
            GerenciamentoJogador.jogadores[GerenciamentoJogador.id] = new Jogador(nome, login, senha);
            ++GerenciamentoJogador.id;
        } else {
            System.out.println("Sem espaço.");
        }
    }
    
    //BUSCAR JOGADOR
    public Jogador buscarJogador(int id) {
    	int i;
    	for(i = 0; i < id; i++) {
    		if(jogadores[i].getId() == id)
    			return jogadores[i];
    	}
    	
    	return null;
    }
    //BUSCAR JOGADOR
    public Jogador verificarLoginValido(String login) {
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
    	if(busca == GerenciamentoJogador.jogadores[GerenciamentoJogador.id-1].getId()) {
    		GerenciamentoJogador.jogadores[busca] = null;
    		--GerenciamentoJogador.id;
    		return true;
    	}
    	
    	for(i = 0; i < GerenciamentoJogador.id -1; i++) {
    		if(GerenciamentoJogador.jogadores[i].getId() == busca) {
	    		for(int j = i; j < GerenciamentoJogador.id; j++) {
	    	    	GerenciamentoJogador.jogadores[j] = GerenciamentoJogador.jogadores[j+1];
	    		}
	    		--GerenciamentoJogador.id;
    			return true;
    		}
    	}
    	
    	return false;
    }

    public String listarJogadores() {
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
        GerenciamentoJogador.jogadores[id_jogador].setNome(nome);
        GerenciamentoJogador.jogadores[id_jogador].setLogin(login);
        GerenciamentoJogador.jogadores[id_jogador].setSenha(senha);
        GerenciamentoJogador.jogadores[id_jogador].setPontuacao(pontuacao);
        GerenciamentoJogador.jogadores[id_jogador].setVida(vida);
        
        
        
        
        
        
    }
    
    public void atualizarJogadorSimples(
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

    public static GerenciamentoJogador getInstancia(int tam) {
        if(instancia == null){
            instancia = new GerenciamentoJogador(tam);
        }
        
        return instancia;
    }
    public static GerenciamentoJogador getInstancia() {
            return instancia;
    }
}
