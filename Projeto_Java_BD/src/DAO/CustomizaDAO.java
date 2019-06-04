/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

public class CustomizaDAO {
    
    boolean sucess;
    String sql;
    
     ConexaoDAO daoC = new ConexaoDAO();
     
     //Função para inserir um usuário no banco de dados
     public boolean inserirCustomizacao() {

        daoC.inserir("Customizacao");
        return sucess;
    }
     
     public boolean deletarCustomizacao(int id) {
         
        daoC.deletar("Customizacao", id);
        return sucess;
    }
     
     public void buscarCustomizacao() {
        daoC.buscarBD("Customizacao");
    }
    
}
