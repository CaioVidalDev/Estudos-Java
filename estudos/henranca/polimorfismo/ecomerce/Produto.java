package estudos.henranca.polimorfismo.ecomerce;

public class Produto {
    private String nomeloja;
    private double preco;
    protected String descricao;


    public Produto(String nomeloja, double preco) {
        this.nomeloja = nomeloja;
        this.preco = preco;
    }


    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public String getDescricao() {
        return "Produto de informática";
    }

    public String toString() {
        return "Nome da Loja: " + nomeloja + ", Preço: " + preco + ", Descrição: " + getDescricao();
    }
}

