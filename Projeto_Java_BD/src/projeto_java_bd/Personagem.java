/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_java_bd;

import DAO.PersonagemDAO;

/**
 *
 * @author Nicole Escobar
 */
public class Personagem {
      
    private String nomeP, idade;
    private int idUsuario_Per;
  
    
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
    
    public boolean inserirPersonagem(Personagem p){
        
        return daoP.inserirPersonagem(p);
        
    };
    
    public void deletarPersonagem(int id){
        
        daoP.deletarPersonagem(id);
        
    };
    
    public boolean buscarPersonagem(String usuario, String senha){
        
        return daoP.buscarPersonagem(usuario,senha);
        
    };
}
