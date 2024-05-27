package estudos.construtoresAndEncapsulamento.comConstrutores;
public class Dancarino {
    
    private String nome;
    private int idade;

    public Dancarino(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
