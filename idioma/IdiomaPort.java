/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.padroes.trabalho.sobreviventes.idioma;

/**
 *
 * @author Márlon
 */
public class IdiomaPort implements Idioma{
    @Override
    public void escolher() {
        System.out.println("Entrando no jogo em Português.");
    }
    
}
