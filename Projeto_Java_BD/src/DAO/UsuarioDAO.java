/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

import projeto_java_bd.Usuario;

public class UsuarioDAO {
     
    public boolean sucess;
    
     ConexaoDAO daoC = new ConexaoDAO();
     
     //Função para inserir um usuário no banco de dados
     public boolean inserirUsuario(Usuario a) {
         
         sucess = daoC.inserir(a);
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
