/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.padroes.trabalho.sobreviventes.adaptee;

import ifba.padroes.trabalho.sobreviventes.acao.Acao;
import ifba.padroes.trabalho.sobreviventes.carta.Capitao;
import ifba.padroes.trabalho.sobreviventes.carta.Carta;
import ifba.padroes.trabalho.sobreviventes.carta.Detetive;
import ifba.padroes.trabalho.sobreviventes.carta.Madame;
import ifba.padroes.trabalho.sobreviventes.carta.Psicopata;
import ifba.padroes.trabalho.sobreviventes.carta.Ricaço;
import ifba.padroes.trabalho.sobreviventes.player.Player;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Márlon
 */
public class Greenfoot {

    private List<Carta> baralho;
    private List<Carta> cemiterio;
    private List<Player> jogadores;
    private Player pc1, pc2, pc3, pc4;
    private Acao acao;

    public Greenfoot(Player jogador) {
        baralho = new ArrayList<>();
        cemiterio = new ArrayList<>();
        jogadores = new ArrayList<>();

        pc1 = new Player("Carlos");
        pc2 = new Player("JoJo");
        pc3 = new Player("Freddy");
        pc4 = new Player("Scamander");

        jogadores.add(pc1);
        jogadores.add(pc2);
        jogadores.add(pc3);
        jogadores.add(pc4);
        jogadores.add(jogador);

    }

    public void act() {
        System.out.println("Novo metodo");
    }
    
    public void arrumarBaralho(List<Player> jogadores) {
        for (int i = 0; i < 3; i++) {

            baralho.add(new Capitao());

            baralho.add(new Detetive());

            baralho.add(new Madame());

            baralho.add(new Psicopata());

            baralho.add(new Ricaço());
        }

        Collections.shuffle(baralho);

        for (Player p : jogadores) {

            p.addCarta(baralho.get(0));
            baralho.remove(0);
            p.addCarta(baralho.get(0));
            baralho.remove(0);
        }
    }
}
