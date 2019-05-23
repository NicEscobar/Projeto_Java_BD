package projeto_java_bd;

import DAO.CorpoDAO;
import DAO.PersonagemDAO;
import DAO.UsuarioDAO;

import View.TelaLogin;
import java.util.ArrayList;

/*Criar um Usuario primeiro.
  Criar um Corpo antes de criar o personagem.
*/

public class Projeto_Java_BD {
    public static void main(String[] args) {
        
        //Interface
        TelaLogin t1 = new TelaLogin();
        t1.setVisible(true);
        
        //Criando um novo usuario
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        PersonagemDAO personagemDAO = new PersonagemDAO();
        CorpoDAO corpoDAO = new CorpoDAO();
        
        //Inserindo usuario
        boolean deuCerto = usuarioDAO.inserirUsuario();
        //boolean deuCerto = personagemDAO.insertPersonagem();
        //boolean deuCerto = corpoDAO.inserirCorpo();
        //Excluindo usuario
        //boolean deuCerto = usuarioDAO.deletarUsuario();
        //Buscar usuario
        
         usuarioDAO.buscarUsuario();
         //ArrayList<Usuario> lista = usuarioDAO.buscarUsuariosSemFiltro();
        
        if(deuCerto)
            System.out.println("Inserção feita com sucesso!");
    }   
}
