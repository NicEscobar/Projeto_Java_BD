package projeto_java_bd;

import View.MusicThread;
import View.TelaLogin;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Criar um Usuario primeiro.
  Criar um Corpo antes de criar o personagem.
*/

public class Projeto_Java_BD {
    public static void main(String[] args) {
        //musica
        MusicThread m1 = new MusicThread();
        m1.start();
        //Interface
        TelaLogin t1 = new TelaLogin();
        t1.setVisible(true);
        
        boolean deuCerto = false;
        }
        /*
        //Criando um novo usuario
        Scanner teclado = new Scanner(System.in);
        String nomeU = teclado.nextLine();
        String senhaU = teclado.nextLine();
        String emailU = teclado.nextLine();
        
        
        
        Usuario usuario = new Usuario();
        
        usuario.setNome(nomeU);
        usuario.setSenha(senhaU);
        usuario.setEmail(emailU);
        
        
        
        
         //usuarioDAO.buscarUsuario();
         //ArrayList<Usuario> lista = usuarioDAO.buscarUsuariosSemFiltro();
        
        if(deuCerto)
            System.out.println("Inserção feita com sucesso!");*/
    }   
