package estudos.henranca.biodiversidade;

public class Peixe extends Animal{
    private String caract;

    public Peixe(String nome, float comprimento, int numPatas, String cor, double velMedia, String caract) {
        super(nome, comprimento, numPatas, cor, velMedia);
        this.caract = caract;
    }

    public String getCaract() {
        return caract;
    }

    public void setCaract(String caract) {
        this.caract = caract;
    }

   
   public void dadosPeixe() {
    super.dados(); 
    System.out.println("Característica: " + caract);
}
}
