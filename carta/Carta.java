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
public abstract class Carta {
    
    protected Image imagem_objeto;
    
    public void desenhar(){
        System.out.println("desenhando");                
    }
    
    public  boolean mouseclicado(){
        System.out.println(""); 
        return false;
    }
    
    public  void setImage(Image img){
        System.out.println("");
    }   
     
    public String getNome(){
        return "carta";
    }
    
    public void efeito(Carta carta){
        System.out.println("");
    }
    
      public  boolean equals(Carta carta){
        System.out.println(""); 
        return false;
    }
}
