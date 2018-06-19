package lista01ex09;

import java.util.Scanner;

/**
 *
 * @author Vítor Rocha Morais 
 * @date   19/06/2018
 *    
 */
public class Lista01Ex09 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite um valor: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro valor: ");
        int n2 = input.nextInt();
        
        if (n1 % n2 == 0){
            System.out.printf ("O numero %d é multiplo de %d\n", n1,n2);
            
        }else{
            System.out.printf("O numero %d nao é multiplo de %d\n" ,n1,n2);
        }
        
        
    }

}
