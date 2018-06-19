package lista01ex10;

import java.lang.Math;
import java.util.Scanner;

public class Lista01Ex10 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Entre com o raio: ");
        int r = input.nextInt();
        
        System.out.println("O diametro é: "+ (r * 2));
        
        System.out.println("A circunferencia é: "+ (Math.PI * (r * 2)));
        
        System.out.println("A area é: "+ (Math.PI * (Math.pow(r, 2))));
        
    }

}
