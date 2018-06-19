package lista01ex07;

import java.util.Scanner;

/**
 *
 * @author Vítor Rocha Morais 
 * @date   19/06/2018
 *    
 */
public class Lista01Ex07 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Escreva um numero: ");
        int n1 = input.nextInt();
        System.out.print("Escreva outro numero: ");
        int n2 = input.nextInt();
        
        if (n1==n2){
            System.out.println("These numbers are equal");
        }else if (n1>n2){
            System.out.printf("%d is larger\n", n1);
        }else{
            System.out.printf("%d is larger\n", n2);
        }
        
    }

}
