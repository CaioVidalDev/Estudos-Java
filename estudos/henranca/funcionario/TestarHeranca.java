package estudos.henranca.funcionario;

public class TestarHeranca {
    public static void main(String[] args) {

        Gerente  gBanco = new Gerente();
        gBanco.setNome("Caio Vidal");
        gBanco.setCpf("999999999");
        gBanco.setSalario(1000.00);
        gBanco.setSenha(123456);

        Funcionario fBanco = new Funcionario();
        fBanco.setNome("Edgard");
        fBanco.setCpf("88888888888888");
        fBanco.setSalario(500.00);
        

        System.out.println("Nome:" + gBanco.getNome());
        System.out.println("Senha:" + gBanco.getSenha());
    }
}
