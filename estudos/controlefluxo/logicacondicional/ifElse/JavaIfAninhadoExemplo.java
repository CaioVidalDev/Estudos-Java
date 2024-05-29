package estudos.controlefluxo.logicacondicional.ifElse;

public class JavaIfAninhadoExemplo {  
    public static void main(String[] args) {  
       //criando duas variáveis para idade e peso  
       int idade = 18;  
       int peso = 51;  
       //aplicando condições na idade e peso  
       if(idade >= 18) {  
          if(peso > 50) {  
             System.out.println("Você pode ser um doador de sangue");  
          } else {  
             System.out.println("Você não pode ser um doador de sangue");  
          }  
       } else {  
            System.out.println("Idade menor que 18");  
       }  
    }  
 }  
