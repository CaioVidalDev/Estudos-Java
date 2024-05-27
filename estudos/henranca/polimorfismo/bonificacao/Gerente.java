package estudos.henranca.polimorfismo.bonificacao;

public class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome, int cpf, double salario, int sg) {
        super(nome, cpf, salario);
        this.senha = sg;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    

}
