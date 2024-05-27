package estudos.construtoresAndEncapsulamento.exerLamp;

public class Lampada {
    private boolean acesa;
    private int potencia;

    public Lampada(boolean acesa) {
        this.acesa = acesa;
        this.potencia = 0; 
    }

    public Lampada(boolean acesa, int potencia) {
        this.acesa = acesa;
        this.potencia = potencia;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void informarSituacao() {
        System.out.println("\nLâmpada está " + (acesa ? "acesa" : "apagada"));
    }

    public void informarPotencia() {
        System.out.println("Potência da lâmpada: " + potencia + " watts");
    }
}

