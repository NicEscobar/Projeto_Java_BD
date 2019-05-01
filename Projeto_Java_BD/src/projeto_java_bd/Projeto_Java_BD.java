package projeto_java_bd;
public class Projeto_Java_BD {
    public static void main(String[] args) {
        int estado = 0;
        Cadastro c1 = new Cadastro();
        c1.setNome("Nicole");
        c1.setSenha("123");
        c1.setSexo(true);
        
        switch (estado) {
            case 0:
                c1.Info();
                break;
            case 1:
                
            default:
                throw new AssertionError();
        }
            
    }
    
}
