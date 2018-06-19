package lista01ex08;

import java.util.Scanner;

/**
 *
 * @author Vítor Rocha Morais 
 * @date   19/06/2018
 *    
 */
public class Lista01Ex08 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = input.nextInt();
        System.out.print("Digite mais um numero: ");
        int n3 = input.nextInt();
        
        System.out.println("A media é: "+ ((n1 + n2 + n3)/3));
        System.out.println("A soma é: "+ (n1 + n2 + n3));
        System.out.println("O produto é: "+ (n1*n2*n3)); 
        
        if (n1>n2 && n1>n3){
            System.out.println("O maior numero é: "+ n1);
            
        }else if (n2>n1 && n2>n3){
            System.out.println("O maior numero é: "+ n2);
            
        }else{
            System.out.println("O maior numero é: "+ n3);
        }
    }

}
