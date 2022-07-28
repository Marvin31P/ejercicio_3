
package tarea_3;

import java.util.Scanner;


public class Tarea_3 {

    public static void tablero(){
        valores valor = new valores();
        
        valor.setCuenta1(0);
        valor.setCuenta2(0);
        boolean ayuda = true;
        while (ayuda == true) {  
           System.out.println("=====================");
           System.out.println("|1.mostrar          |");
           System.out.println("|2.suma             |");
           System.out.println("|3.resta            |");
           System.out.println("|4.salir            |");
         
            Scanner sp = new Scanner(System.in);
           int respuesta = sp.nextInt();
        
        
            switch (respuesta) {
                   case 1:
                       System.out.println(valor.getCuenta1());
                       System.out.println(valor.getCuenta2());
                    
                    break;
                    
                    case 2:
                         Scanner sp1 = new Scanner(System.in);
                         System.out.println("que cuenta desea sumar 1 o 2");
                         int resp_cuenta = sp1.nextInt();
                         
                         if (resp_cuenta == 1) {
                             System.out.println("ingrese valor");
                             valor.setCuenta1(sp1.nextInt());
                            
                        } else {
                           System.out.println("ingrese valor");
                             valor.setCuenta2(sp1.nextInt());  
                        }
                    
                              
                                 
                    
                    
                    break;
                    
                    case 3:
                        System.out.println("restar");
                        Scanner sp2 = new Scanner(System.in);
                         System.out.println("que cuenta desea restar 1 o 2");
                         int resp_cuent = sp2.nextInt();
                         
                         if (resp_cuent == 1) {
                             System.out.println("ingrese valor");
                             valor.setCuenta1( valor.getCuenta1() - sp2.nextInt());
                            
                        } else {
                           System.out.println("ingrese valor");
                             valor.setCuenta2(valor.getCuenta2() - sp2.nextInt());  
                        }
                    
                    break;
                    
                    case 4:
                        
                        System.exit(0);
                    
                    break;
                default:
                    throw new AssertionError();
        
    }
        }
    }
        
        
      
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        tablero();
        
        
        
    }
    
}
