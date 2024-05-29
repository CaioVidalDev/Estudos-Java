package estudos.controlefluxo.controleDeFluxo.switchCase;

public class SwitchMonthExample {    
    public static void main(String[] args) {    
         
        int mes=7;    
        String mesString="";  
        
        switch(mes){    
          
        case 1: mesString="1 - January";  
        break;    
        case 2: mesString="2 - February";  
        break;    
        case 3: mesString="3 - March";  
        break;    
        case 4: mesString="4 - April";  
        break;    
        case 5: mesString="5 - May";  
        break;    
        case 6: mesString="6 - June";  
        break;    
        case 7: mesString="7 - July";  
        break;    
        case 8: mesString="8 - August";  
        break;    
        case 9: mesString="9 - September";  
        break;    
        case 10: mesString="10 - October";  
        break;    
        case 11: mesString="11 - November";  
        break;    
        case 12: mesString="12 - December";  
        break;    
        default:System.out.println("Invalid Month!");    
        }    
        
        System.out.println(mesString);  
    }    
    }   