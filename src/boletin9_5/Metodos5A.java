
package boletin9_5;

import java.util.Scanner;


public class Metodos5A {
    public void calcularSerieA(){
     Scanner sc=new Scanner(System.in);
        int cant;
        int cont;
        int num=0;
        System.out.println("Dame el numero de elementos: ");
        cant=sc.nextInt();
        for(cont=1;cont<=cant;cont++){
            num+=2;
            System.out.println(num);
        }
    }
}
