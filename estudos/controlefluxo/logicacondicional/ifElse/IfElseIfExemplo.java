package estudos.controlefluxo.logicacondicional.ifElse;

public class IfElseIfExemplo {

    public static void main(String[]args) {  
       int marcacao = 65;  
        
       if(marcacao < 50) {  
           System.out.println("falha");  
       }  
        else if(marcacao >= 50 && marcacao < 60) {  
           System.out.println("grau D");        
        }  
         else if(marcacao >= 60 && marcacao < 70) {  
           System.out.println("grau C");        
        }  
         else if(marcacao >= 70 && marcacao < 80) {  
           System.out.println("grau B");        
        }  
         else if(marcacao >= 80 && marcacao < 90) {  
           System.out.println("grau A");        
        }  
         else if(marcacao >= 90 && marcacao < 100) {  
           System.out.println("grau A+");         
        } else {  
           System.out.println("Invalido!");  
        }  
    }  
 }  