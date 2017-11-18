/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.padroes.trabalho.sobreviventes.adapter;

import ifba.padroes.trabalho.sobreviventes.adaptee.Greenfoot;
import ifba.padroes.trabalho.sobreviventes.jogo.Jogo;
import ifba.padroes.trabalho.sobreviventes.player.Player;

/**
 *
 * @author Márlon
 */
public class TabuleiroAdapter extends Greenfoot implements Jogo{

    
    public TabuleiroAdapter(Player jogador) {
        super(jogador);
    }
 
   @Override
   public void rodar(){
       System.out.println("rodando novo tabuleiro");
       this.act();
   }
}
