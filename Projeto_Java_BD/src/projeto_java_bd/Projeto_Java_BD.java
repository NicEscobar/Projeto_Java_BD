package projeto_java_bd;

import DAO.PersonagemDAO;
import DAO.UsuarioDAO;

import View.TelaLogin;
import java.util.ArrayList;

public class Projeto_Java_BD {
    public static void main(String[] args) {
        
        //Interface
        TelaLogin t1 = new TelaLogin();
        t1.setVisible(false);
        
        //Criando um novo usuario
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        PersonagemDAO personagemDAO = new PersonagemDAO();
        
        //Inserindo usuario
        //boolean deuCerto = usuarioDAO.insert();
        //Excluindo usuario
        //boolean deuCerto = usuarioDAO.deletarUsuario();
        //Buscar usuario
         ArrayList<Usuario> lista = usuarioDAO.buscarUsuariosSemFiltro();
        
         
        
        
        
        //if(deuCerto)
            System.out.println("Inserção feita com sucesso!");
    }   
}
