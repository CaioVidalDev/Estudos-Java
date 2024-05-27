package estudos.henranca.polimorfismo.ecomerce;


public class Mouse extends Produto {
    private String tipo;

   
    public Mouse(String nomeloja, double preco, String descricao, String tipo) {
        super(nomeloja, preco);
        this.descricao = descricao;
        this.tipo = tipo;
    }


    public String getDescricao() {
        return descricao + ", Tipo: " + tipo;
    }


    public String toString() {
        return "Nome da Loja: " + getNomeloja() + ", Preço: " + getPreco() + ", Descrição: " + getDescricao();
    }

    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
