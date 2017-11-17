
package boletin9_5;

import java.util.Scanner;


public class Metodos5B {
    public void calcularSerieB(){
        Scanner sc=new Scanner(System.in);
        int cont;
        int inicio;
        int num=0;
        System.out.println("Dame el numero de elementos: ");
        inicio=sc.nextInt();
        for(cont=1;cont<=inicio;cont++){
            num+=1;
            if(num%2==0){
                System.out.println("+"+num);
            }else{ System.out.println("-"+num);  
            }
        }
    }
}

