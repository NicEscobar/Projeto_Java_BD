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
    
    private int numeroO;
    
     CorpoDAO daoC = new CorpoDAO();

    public int getNumeroO() {
        return numeroO;
    }

    public void setNumeroO(int numeroO) {
        this.numeroO = numeroO;
    }
    
    public void inserirCorpo(int numOrdem, int chavePer){
        
        daoC.inserirCorpo(numOrdem,chavePer);
        
    };
    
    public void deletarPersonagem(int id){
        
        //daoC.deletarPersonagem(id);
        
    };
    
    //public boolean buscarPersonagem(String usuario, String senha){
        
     //   return daoC.buscarCorpo();
        
   // };
    
}
