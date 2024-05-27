package estudos.henranca.biodiversidade;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, float comprimento, int numPatas, String cor, double velMedia, String alimento) {
        super(nome, comprimento, numPatas, cor, velMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamiferos(){
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}
