/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.padroes.trabalho.sobreviventes.acao;

import ifba.padroes.trabalho.sobreviventes.carta.Detetive;
import ifba.padroes.trabalho.sobreviventes.carta.Carta;
/**
 *
 * @author Márlon
 */
public class AcaoTrocar implements Acao{
            
    @Override
    public void acao(Carta carta1, Carta carta2) {
        if (carta1.equals(new Detetive())){
            carta1.efeito(carta2);
        }
    }
    
}
