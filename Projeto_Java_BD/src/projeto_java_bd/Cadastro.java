package projeto_java_bd;
public class Cadastro {
    private String nome;
    private String senha;
    private boolean sexo;
    
    //MÉTODO
    public void Info(){
        System.out.println("Nome: " +nome);
        System.out.println("Senha: "+senha);
        System.out.println("Sexo: "+sexo);
    }

    //GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
}
