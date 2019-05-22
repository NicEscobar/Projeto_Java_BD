package projeto_java_bd;

import DAO.UsuarioDAO;

public class Projeto_Java_BD {
    public static void main(String[] args) {
        
        UsuarioDAO cf = new UsuarioDAO();
        
        boolean deuCerto = cf.insert();
        
        if(deuCerto)
            System.out.println("Inserção feita com sucesso!");
    }   
}
