/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.padroes.trabalho.sobreviventes.player;

import ifba.padroes.trabalho.sobreviventes.carta.Carta;
import ifba.padroes.trabalho.sobreviventes.estadoplayer.EstadoPlayer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Márlon
 */
public class Player {

    private EstadoPlayer estado;
    private String nome;
    private List<Carta> cartasdamao = new ArrayList<>();
    private int recurso;

    public Player(String nome) {
        this.nome = nome;
        recurso = 2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addCarta(Carta carta) {
        cartasdamao.add(carta);
    }

    public void removerCarta(Carta carta) {
        int cont = 0;
        for (Carta c : cartasdamao) {
            if (c.equals(carta) && cont == 0) {
                cartasdamao.remove(c);
                cont++;
            }
        }
    }

    public List<Carta> getCartasdamao() {
        return cartasdamao;
    }
    
    public void addRecurso() {
        estado.addRecurso(this);
    }

    public void RemoverRecurso() {
        estado.removerRecurso(this);
    }

    public int getRecurso() {
        return this.recurso;
    }

    public void setEstado(EstadoPlayer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Número de recursos: " + getRecurso() + "\nJogador: " + this.getNome();
    }

    public boolean equals(Player obj) {

        return this.getNome().equals(obj.getNome());
    }
}
