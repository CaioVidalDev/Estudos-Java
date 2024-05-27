package estudos.construtoresAndEncapsulamento.exerData;

public class TestarData {
    public static void main(String[] args) {
        Data hoje = new Data(27, 05, 2024);
        Data natal = new Data(25, 12, 2024);

        hoje.escreverData();
        natal.escreverData();
    }
}
