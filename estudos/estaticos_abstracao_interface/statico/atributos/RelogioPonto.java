package estudos.estaticos_abstracao_interface.statico.atributos;

public class RelogioPonto {
    public static int hora;
    public static int minuto;
    public static int segundo;

    private int id;
    private String nomeFilial;

    public RelogioPonto(){
    }

    public RelogioPonto(int ident, String filial) {
        this.id = ident;
        this.nomeFilial = filial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    
}
