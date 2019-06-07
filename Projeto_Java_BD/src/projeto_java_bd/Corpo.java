/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_java_bd;

import DAO.CorpoDAO;

/**
 *
 * @author Nicole Escobar
 */
public class Corpo {
    
    private String id;
    private int numeroO;
    
     CorpoDAO daoC = new CorpoDAO();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumeroO() {
        return numeroO;
    }

    public void setNumeroO(int numeroO) {
        this.numeroO = numeroO;
    }
    
    public void inserirCorpo(int numOrdem){
        
        daoC.inserirCorpo(numOrdem);
        
    };
    
    public void deletarPersonagem(int id){
        
        //daoC.deletarPersonagem(id);
        
    };
    
    //public boolean buscarPersonagem(String usuario, String senha){
        
     //   return daoC.buscarCorpo();
        
   // };
    
}
