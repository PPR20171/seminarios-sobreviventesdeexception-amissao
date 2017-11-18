/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.padroes.trabalho.sobreviventes.estadoplayer;

import ifba.padroes.trabalho.sobreviventes.player.Player;

/**
 *
 * @author Márlon
 */
public class EstadoVivo extends EstadoPlayer {

    @Override
    public void addRecurso(Player p) {
        System.out.println("Add 2 recursos. ");
    }

    @Override
    public void removerRecurso(Player p) {
        System.out.println("Removendo 2 recursos");
    }

}
