package estudos.construtoresAndEncapsulamento.exerApolice;

public class Apolice {
    private String nomeSegurado;
    private int idadeSegurado;
    private double valorPremio;

    public Apolice(String nomeSegurado, int idadeSegurado, double valorPremio) {
        this.nomeSegurado = nomeSegurado;
        this.idadeSegurado = idadeSegurado;
        this.valorPremio = valorPremio;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir() {
        System.out.println("Nome do Segurado: " + nomeSegurado);
        System.out.println("Idade do Segurado: " + idadeSegurado);
        System.out.println("Valor do Prêmio do Segurado: " + valorPremio);

    }

    public void calcularPremioApolice() {
        if (idadeSegurado >= 18 && idadeSegurado <= 25) {
            valorPremio = (valorPremio * 20) / 100;
        } else if (idadeSegurado > 25 && idadeSegurado <= 36) {
            valorPremio = (valorPremio * 15) / 100;
        } else if (idadeSegurado > 36)
            valorPremio = (valorPremio * 10) / 100;
    }

    public void oferecerDeseconto (String cidade) {
        switch (cidade) {
            case "Curitiba":
                valorPremio -= (valorPremio * 20 ) / 100 ;
                break;
            case "Rio de Janeiro":
                valorPremio -= (valorPremio * 15 ) / 100 ;
                break;
            case "São Paulo":
                valorPremio -= (valorPremio * 10 ) / 100 ;
                break;
            case "Belo Horizonte":
                valorPremio -= (valorPremio * 5 ) / 100 ;
                break;
            default:
                System.out.println("Cidade não elegivel para desconto");
                break;
        }
    }
}
