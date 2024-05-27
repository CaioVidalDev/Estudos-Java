package estudos.construtoresAndEncapsulamento.semConstrutores;
public class Principal {

    public static void main(String[] args) {
        
        Dancarino pessoa = new Dancarino();

        pessoa.setNome("Caio");
        pessoa.setIdade(9);

        System.out.println("nome: " + pessoa.getNome());
        System.out.println("nome: " + pessoa.getIdade());
    }

    
}