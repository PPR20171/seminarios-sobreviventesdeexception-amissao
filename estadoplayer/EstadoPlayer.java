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
public abstract class EstadoPlayer {
    public abstract void addRecurso(Player p); 

    public abstract void removerRecurso(Player p); 
}
