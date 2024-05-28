package estudos.estaticos_abstracao_interface.statico.atributos;

public class RelogioPontoMain {
    @SuppressWarnings("static-access")
public static void main(String[] args) {
        RelogioPonto filialA = new RelogioPonto(1, "Centro");
        RelogioPonto filialB = new RelogioPonto(2, "Alecrim");
        RelogioPonto filialC = new RelogioPonto(3, "Rocas");

        filialA.hora = 7;
        filialA.minuto = 45;
        filialA.segundo = 30;

        System.out.println(
                "Filial A: " + filialA.hora + ":" + filialA.minuto + ":" + filialA.segundo);
        System.out.println(
                "Filial B: " + filialB.hora + ":" + filialB.minuto + ":" + filialB.segundo);
        System.out.println(
                "Filial C: " + filialC.hora + ":" + filialC.minuto + ":" + filialC.segundo);

        RelogioPonto.hora = 7;
        RelogioPonto.minuto = 45;
        RelogioPonto.segundo = 30;

        System.out.println(
                "Todas Filiais: " + RelogioPonto.hora + ":" + RelogioPonto.minuto + ":" + RelogioPonto.segundo);
    }
}
