package estudos.henranca.polimorfismo.ecomerce;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       
        ArrayList<Produto> carrinho = new ArrayList<>();

    
        Mouse mouse1 = new Mouse("Loja Tec", 50.0, "Mouse ótico, Saída USB. 1.600 dpi", "Ótico");
        Mouse mouse2 = new Mouse("Loja Tec", 75.0, "Mouse sem fio, Bluetooth. 2.400 dpi", "Sem fio");
        carrinho.add(mouse1);
        carrinho.add(mouse2);

    
        Livro livro1 = new Livro("Livraria Central", 100.0, "O Senhor dos Anéis", "Jubileu");
        Livro livro2 = new Livro("Livraria Central", 80.0, "Dom Quixote", "Asabiaguaba");
        carrinho.add(livro1);
        carrinho.add(livro2);

        for (Produto produto : carrinho) {
            System.out.println(produto.toString());
        }
    }
}
