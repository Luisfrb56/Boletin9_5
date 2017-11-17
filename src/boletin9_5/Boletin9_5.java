
package boletin9_5;

import java.util.Scanner;


public class Boletin9_5 {

    
    public static void main(String[] args) {
        String opciones;
        Scanner sc=new Scanner(System.in);
       Metodos5A obj1=new Metodos5A();
       Metodos5B obj2=new Metodos5B();
       Metodos5C obj3=new Metodos5C();
        System.out.println("*** Menú *** \n a.2+4+6+8+10... \n b.-1+2-3+4... \n c.0+1+1+2+3+5+8... \n Elige una opcion: ");
        opciones=sc.next();
        
        switch (opciones){
            case "a":
            obj1.calcularSerieA();
            break;
            case "b":
            obj2.calcularSerieB();
            break;
            case "c":
            obj3.calcularSerieC();
            break;
        
        }
    }
    
}
