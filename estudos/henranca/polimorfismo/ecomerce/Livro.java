package estudos.henranca.polimorfismo.ecomerce;

public class Livro extends Produto {
    private String autor;

   
    public Livro(String nomeloja, double preco, String descricao, String autor) {
        super(nomeloja, preco);
        this.descricao = descricao;
        this.autor = autor;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao + ", Autor: " + autor;
    }

    public String toString() {
        return "Nome da Loja: " + getNomeloja() + ", Preço: " + getPreco() + ", Descrição: " + getDescricao();
    }
}
