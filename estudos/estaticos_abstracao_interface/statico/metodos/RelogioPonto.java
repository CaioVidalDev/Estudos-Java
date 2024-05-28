package estudos.estaticos_abstracao_interface.statico.metodos;

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

    public static int getHora() {
        return hora;
    }

    public static void setHora(int hora) {
        RelogioPonto.hora = hora;
    }

    public static int getMinuto() {
        return minuto;
    }

    public static void setMinuto(int minuto) {
        RelogioPonto.minuto = minuto;
    }

    public static int getSegundo() {
        return segundo;
    }

    public static void setSegundo(int segundo) {
        RelogioPonto.segundo = segundo;
    }

    
    
}
