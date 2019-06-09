/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_java_bd;

import DAO.PersonagemDAO;
import java.math.BigDecimal;

/**
 *
 * @author Nicole Escobar
 */
public class Personagem {
      
    private String nomeP, idade;
    private int idUsuario_Per,idPers_corpo;
    
    PersonagemDAO daoP = new PersonagemDAO();
    
    public Corpo corpo = new Corpo();
    public Objeto obj = new Objeto();
    
    
    public Personagem(){  
        
       corpo = new Corpo();
       obj = new Objeto();
    
    }

    public int getIdUsuario_Per() {
        return idUsuario_Per;
    }

    public void setIdUsuario_Per(int idUsuario_Per) {
        this.idUsuario_Per = idUsuario_Per;
    }

    
    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    
    public int getIdPers_corpo() {
        return idPers_corpo;
    }

    public void setIdPers_corpo(int idPers_corpo) {
        this.idPers_corpo = idPers_corpo;
    }
    
    public boolean inserirPersonagem(Personagem p){
        
        return daoP.inserirPersonagem(p);
        
    };
    
    public void deletarPersonagem(int id){
        
        daoP.deletarPersonagem(id);
        
    };
    
    public int buscarPersonagem(Personagem p){
        
        return daoP.buscarPersonagem(p);
        
    };
    
}
