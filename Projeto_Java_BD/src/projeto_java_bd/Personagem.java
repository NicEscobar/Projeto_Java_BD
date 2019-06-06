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
      
    private String nomeP;
    private int id;
    
    PersonagemDAO daoP = new PersonagemDAO();
    
    public Personagem(String nomeP, int id){  
        
        
    }

    public Personagem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void inserirUsuario(Personagem p){
        
        daoP.inserirPersonagem(p);
        
    };
    
    public void deletarUsuario(int id){
        
        daoP.deletarPersonagem(id);
        
    };
    
    public boolean buscarPersonagem(String usuario, String senha){
        
        return daoP.buscarPersonagem(usuario,senha);
        
    };
}
