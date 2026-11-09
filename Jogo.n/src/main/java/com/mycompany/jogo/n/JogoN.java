/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogo.n;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JogoN {
    
    public static void main(String[] args) {
//        GerenciamentoJogador.getInstancia(10);
        TelaInicial login = new TelaInicial();
        login.setVisible(true);
        
        
//        GerenciamentoJogador genJog = new GerenciamentoJogador(10);
//        
//        var op = -1;
//        while(op != 0){
//            while(op == -1){
//                try {
//                    op = Integer.parseInt( JOptionPane.showInputDialog("Gerenciamento Jogador\n"
//                    + "1 - adicionar jogador\n"
//                    + "2 - listar jogadores\n"
//                    + "3 - buscar jogador\n"
//                    + "4 - atualizar jogador\n"
//                    + "5 - remover jogador\n"
//                    + "0 - sair\n"
//                    + "Escolha uma das opções acima!\n"));
//                } catch (Exception e) {
//                    System.out.println("Erro, opção inválida");
//                }
//            }
//            switch (op) {
//                case 1:
//                    
//                    var nome  = JOptionPane.showInputDialog("Informe o Nome do jogador\n");
//                    var login = JOptionPane.showInputDialog("Informe o TelaInicial do jogador\n");
//                    var senha = JOptionPane.showInputDialog("Informe a senha do jogador\n");
//                    
//                    genJog.adicionarJogador(nome, login, senha);
//                    
//                    JOptionPane.showMessageDialog(null, "Sucesso ao adicionar!");
//                    op = -1;
//                    break;
//                case 2:
//                    JOptionPane.showMessageDialog(null, genJog.listarJogadores());
//                    op = -1;
//                    break;
//                default:
//                    op = -1;
//                    break;
//                    //throw new AssertionError();
//            }
//            
//        
//        }
//        
//        genJog.adicionarJogador( "João", "JJ_", "aaa3");
//        
//        var jogador = genJog.buscarJogador(502);
//        if (jogador != null)
//        	System.out.println(jogador.getNome());
//        else
//        	System.out.println("INEXISTENTE!");
//        System.out.println("remover 2 ");
//        System.out.println("Lista antes");
//        System.out.println("============================================");
//        System.out.println(genJog.listarJogadores());
//        System.out.println("============================================");
//        System.out.println("removeu " +  genJog.removerJogador(502));
//        System.out.println("Lista depois");
//        System.out.println("============================================");
//        System.out.println(genJog.listarJogadores());
//        System.out.println("============================================");
//        
//        System.out.println("Buscar 2");
//        var jd = genJog.buscarJogador(502);
//        if (jd != null)
//        	System.out.println(jogador.getNome());
//        else
//        	System.out.println("INEXISTENTE!");
//        
//        System.out.println(genJog.listarJogadores());
    }

}
