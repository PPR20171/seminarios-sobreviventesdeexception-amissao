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
public class Capitao extends Carta{
   
     public Capitao(){
    }   

     @Override
    public void desenhar(){
        System.out.println("Desenhando Capitão");
    }
    
     
     @Override
    public boolean mouseclicado(){
        System.out.println("mouse sendo clicado");
        return true;
    }

     @Override
    public void setImage(Image img){
        this.imagem_objeto = img;
    }
    
     @Override
     public String getNome(){
       return "Capitão";
    }
     
     public void efeito(Carta carta){
         System.out.println("Realizando Efeito do capitao na carta passada.");
     }
          
    public boolean equals(Carta carta){
        return this.getNome().equals(carta.getNome());
    }
}
