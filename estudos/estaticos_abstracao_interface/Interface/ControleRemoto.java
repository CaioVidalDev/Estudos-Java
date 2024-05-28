package estudos.estaticos_abstracao_interface.Interface;

public class ControleRemoto{
    private int graus = 90;
	public void moverObjetoParaFrente(Mobilidade mobilidade){
		mobilidade.andarFrente();
	}
	public void moverObjetoParaTras(Mobilidade mobilidade){
		mobilidade.andarTras();
	}
	public void dobrarADireita(Mobilidade mobilidade){
		mobilidade.virarDireita(graus);
	}
	public void dobrarAEsquerda(Mobilidade mobilidade){
		mobilidade.virarEsquerda(graus);
	}
}
