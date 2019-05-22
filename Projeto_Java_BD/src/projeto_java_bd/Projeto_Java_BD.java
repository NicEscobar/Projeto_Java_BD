package projeto_java_bd;

import DAO.UsuarioDAO;
import View.TelaLogin;

public class Projeto_Java_BD {
    public static void main(String[] args) {
        
        TelaLogin t1 = new TelaLogin();
        t1.setVisible(false);
        
        UsuarioDAO cf = new UsuarioDAO();
        
        boolean deuCerto = cf.insert();
        
        if(deuCerto)
            System.out.println("Inserção feita com sucesso!");
    }   
}
