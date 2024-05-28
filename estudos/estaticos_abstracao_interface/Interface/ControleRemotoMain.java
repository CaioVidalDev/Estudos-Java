package estudos.estaticos_abstracao_interface.Interface;

public class ControleRemotoMain {
    public static void main(String[] args) {
        
        Robo robo = new Robo();
        Trator trator = new Trator();

        ControleRemoto controle = new ControleRemoto();

        // Testando Controle Remoto com o ROBO
        controle.moverObjetoParaFrente(robo);
        controle.moverObjetoParaTras(robo);
        controle.dobrarADireita(robo);
        controle.dobrarAEsquerda(robo);
        robo.moveBracoDireito();
        robo.moveBracoEsquerdo();

        // Testando Controle Remoto com o TRATOR
        controle.moverObjetoParaFrente(trator);
        controle.moverObjetoParaTras(trator);
        controle.dobrarADireita(trator);
        controle.dobrarAEsquerda(trator);
        trator.erqueEscavadeira();
        
    }
}
