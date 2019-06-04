/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

public class CorpoDAO {
    
    public boolean sucess;
    String sql;
    
    ConexaoDAO daoC = new ConexaoDAO();
     
     //Função para inserir um usuário no banco de dados
     public boolean inserirCorpo() {

        daoC.inserir("Corpo");
        return sucess;
    }
     
     public void buscarCorpo() { 
       daoC.buscarBD("Corpo");
    }
      
}
