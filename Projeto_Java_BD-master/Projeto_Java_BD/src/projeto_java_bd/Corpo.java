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
public class Corpo {
    
    private String cor;
    private boolean sexo;

    
    public Corpo(String cor){
        
        this.cor = cor;
        //this.sexo = sexo;
        
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
}
