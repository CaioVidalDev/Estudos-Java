package estudos.construtoresAndEncapsulamento.exerLamp;

public class TestarLampada {
    public static void main(String[] args) {

        Lampada lampadaLab1 = new Lampada(false);
        Lampada lampadaLab2 = new Lampada(true, 20);

        lampadaLab1.informarSituacao();
        lampadaLab1.informarPotencia();

        lampadaLab2.informarSituacao();
        lampadaLab2.informarPotencia();

        
    }
}
