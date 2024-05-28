package estudos.estaticos_abstracao_interface.Interface;

public class Robo implements Mobilidade{
	public void andarFrente(){
		System.out.println("[robô]: andando para frente...");
	}
	public void andarTras(){
		System.out.println("[robô]: andando para trás...");
	}
	public void parar(){
		System.out.println("[robô]: parado");
	}
	public void virarDireita(int graus){
		System.out.println("[robô]: virando para direita " + graus + " graus");
	}
	public void virarEsquerda(int graus){
		System.out.println("[robô]: virando para esquerda " + graus + " graus");
	}


    
	public void moveBracoDireito(){
		System.out.println("[robô]: movendo braço direito");
	}
	public void moveBracoEsquerdo(){
		System.out.println("[robô]: movendo braço esquerdo");
	}
}