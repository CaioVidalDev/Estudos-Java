package estudos.estaticos_abstracao_interface.statico.metodos;

public class RelogioPontoMain {
    public static void main(String[] args) {
        RelogioPonto filialA = new RelogioPonto(1, "Centro");
        RelogioPonto filialB = new RelogioPonto(2, "Alecrim");
        RelogioPonto filialC = new RelogioPonto(3, "Rocas");

        RelogioPonto.setHora(7);
        RelogioPonto.setMinuto(45);
        RelogioPonto.setSegundo(30);

        System.out.println(
                "Todas Filiais: " + RelogioPonto.getHora() + ":" + RelogioPonto.getMinuto()+ ":" + RelogioPonto.getSegundo());
    }
}
