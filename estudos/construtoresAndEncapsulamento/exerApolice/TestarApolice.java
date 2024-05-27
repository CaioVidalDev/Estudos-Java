package estudos.construtoresAndEncapsulamento.exerApolice;

public class TestarApolice {
    public static void main(String[] args) {
        
        Apolice apolice = new Apolice("Caio Vidal", 18, 1000.0);
        apolice.imprimir();

        apolice.calcularPremioApolice();
        System.out.println("\nApos calcular premio da Apolice: ");
        apolice.imprimir();

        apolice.oferecerDeseconto("Rio de Janeiro");
        System.out.println("\nApos aplicar desconto para Rio de Janeiro: ");
        apolice.imprimir();
    }
}
