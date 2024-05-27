package estudos.henranca.polimorfismo.bonificacao;

public class TestarHeranca {
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Adail", 99999999, 300);
        System.out.println("Nome Funcionario : " + f.getNome());

        Gerente g = new Gerente("Joao Batista", 888888, 450, 123);
        System.out.println("Nome Gerente: " + g.getNome());

        Funcionario fg = new Gerente("Mario", 89989898, 450, 444 );
        System.out.println("Nome Gerente: " + fg.getNome());
    }
}
