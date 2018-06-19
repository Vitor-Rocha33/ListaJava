package lista01ex06;

import java.util.Scanner;

/**
 *
 * @author Vítor Rocha Morais 
 * @date   19/06/2018
 *    
 */
public class Lista01Ex06 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Escreva um numero: ");
        int n1 = input.nextInt();
        System.out.println("Escreva outro numero: ");
        int n2 = input.nextInt();
        
        System.out.println("A soma é: "+ (n1 + n2));
        System.out.println("O produto é: "+ (n1*n2));
        System.out.println("A diferença é: "+ (n1 - n2));
        System.out.println("A divisão é: "+ (n1/n2));
    }
    

}
