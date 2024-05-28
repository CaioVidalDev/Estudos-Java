package estudos.henranca.biodiversidade;

public abstract class Animal {
    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private double velMedia;

    public Animal(String nome, float comprimento, int numPatas, String cor, double velMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.velMedia = velMedia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getComprimento() {
        return comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public int getNumPatas() {
        return numPatas;
    }
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getVelMedia() {
        return velMedia;
    }
    public void setVelMedia(float velMedia) {
        this.velMedia = velMedia;
    }

     public void dados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Número de Patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Média: " + velMedia + " m/s");
    }
}
