/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.padroes.trabalho.sobreviventes.carta;

import java.awt.Image;

/**
 *
 * @author Márlon
 */
public class Ricaço extends Carta {

    public Ricaço() {

    }

    public void desenhar() {
        System.out.println("Desenhando Ricaço");
    }

    public boolean mouseclicado() {
        System.out.println("mouse sendo clicado");
        return true;
    }

    public void setImage(Image img) {
        this.imagem_objeto = img;
    }

    public String getNome() {
        return "Ricaço";
    }

    public void efeito(Carta carta) {
        System.out.println("Aplicando do ricaço efeito na carta passada");
    }

    public boolean equals(Carta carta) {
        return this.getNome().equals(carta.getNome());
    }
}
