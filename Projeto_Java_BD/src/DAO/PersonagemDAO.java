/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

public class PersonagemDAO {
    
    public boolean sucess;
    String sql;
    
    ConexaoDAO daoC = new ConexaoDAO();
     
     //Função para inserir um usuário no banco de dados
     public boolean insertPersonagem() {
    
        daoC.inserir("Personagem");  
        return sucess;
    }
     
     public boolean deletarPersonagem(int id) {

        daoC.deletar("Personagem", id);
        return sucess;
    }
     
     public void buscarPersonagemo() {
        
         daoC.buscarBD("Personagem");
        
    }    
}
