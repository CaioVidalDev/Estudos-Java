package estudos.estaticos_abstracao_interface.Interface;

public class Trator implements Mobilidade{
	public void andarFrente(){
		System.out.println("[trator]: andando para frente...");
	}
	public void andarTras(){
		System.out.println("[trator]: andando para trás...");
	}
	public void parar(){
		System.out.println("[trator]: parado");
	}
	public void virarDireita(int graus){
		System.out.println("[trator]: virando para direita " + graus + " graus");
	}
	public void virarEsquerda(int graus){
		System.out.println("[trator]: virando para esquerda " + graus + " graus");
	}


    
	public void erqueEscavadeira(){
		System.out.println("[trator]: ergue escavadeira");
	}
}