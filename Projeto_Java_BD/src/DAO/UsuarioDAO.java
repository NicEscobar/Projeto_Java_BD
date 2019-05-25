/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

public class UsuarioDAO {
     
    public boolean sucess;
    
     ConexaoDAO daoC = new ConexaoDAO();
     
     //Função para inserir um usuário no banco de dados
     public boolean inserirUsuario() {
         
         sucess = daoC.inserir("Usuario");
         return sucess;
     }    
     
     public boolean deletarUsuario(int id) {
         
       daoC.deletar("Usuario", id);
       return sucess;
    }
     
     public void buscarUsuario() {
         
        daoC.buscarBD("Usuario");
        
    }
}
