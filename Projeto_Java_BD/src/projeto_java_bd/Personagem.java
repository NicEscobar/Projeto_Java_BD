/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_java_bd;

/**
 *
 * @author Nicole Escobar
 */
public class Personagem {
      
    private String nomeP;
    private int id;
    
    public Personagem(String nomeP, int id){  
        
        this.nomeP = nomeP; 
        this.id = id; 
        
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }
    
}
