package projeto_java_bd;

import DAO.CorpoDAO;
import DAO.PersonagemDAO;
import DAO.UsuarioDAO;

import View.TelaLogin;
import java.util.ArrayList;
import java.util.Scanner;

/*Criar um Usuario primeiro.
  Criar um Corpo antes de criar o personagem.
*/

public class Projeto_Java_BD {
    public static void main(String[] args) {
        
        //Interface
        TelaLogin t1 = new TelaLogin();
        t1.setVisible(true);
        
        boolean deuCerto = false;
        
        //Criando um novo usuario
        Scanner teclado = new Scanner(System.in);
        String nomeU = teclado.next();
        int senhaU = teclado.nextInt();
        String emailU = teclado.next();
        
        
        
        Usuario usuario = new Usuario();
        
        usuario.setNome(nomeU);
        usuario.setSenha(senhaU);
        usuario.setEmail(emailU);
        
        
        
        
         //usuarioDAO.buscarUsuario();
         //ArrayList<Usuario> lista = usuarioDAO.buscarUsuariosSemFiltro();
        
        if(deuCerto)
            System.out.println("Inserção feita com sucesso!");
    }   
}
