package estudos.henranca.funcionario;

public class Gerente extends Funcionario{
    
    private int senha;

    public boolean autenticar (int testarSenha) {
        if (testarSenha == senha) {
            System.out.println("Acesso autorizado");
            return true;
        } else {
            System.out.println("Acesso negado");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
