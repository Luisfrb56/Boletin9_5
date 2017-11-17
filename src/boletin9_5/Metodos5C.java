
package boletin9_5;

import java.util.Scanner;

public class Metodos5C {
    public void calcularSerieC(){
        Scanner sc=new Scanner(System.in);
        int cont;
        int cant,num1=0,num2=1,num3;
        System.out.println("Dame el numero de elementos: ");
        cant=sc.nextInt();
        System.out.println(num1+","+num2);
        for(cont=1;cont<=cant;cont++){
        num3=num1+num2;
        num1=num2;
        num2=num3;
            System.out.println(num1+","+num2);
        }
    }
}
