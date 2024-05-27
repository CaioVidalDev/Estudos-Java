package estudos.henranca.biodiversidade;

public class TestarAnimais {
    public static void main(String[] args) {
        
        Mamifero camelo = new Mamifero("Camelo",150, 4, "Amarelo", 2, "areia");
        Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinzento", 1.5, "Barbatanas e cauda");
        Mamifero ursoCanada = new Mamifero("Urso do Canadá", 180, 4, "vermelhor",0.5, "Mel");
        
        camelo.dadosMamiferos();
        tubarao.dadosPeixe();
        ursoCanada.dadosMamiferos();
    }

}
