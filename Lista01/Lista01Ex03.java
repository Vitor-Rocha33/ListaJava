package lista01ex03;

import java.util.Scanner;

/**
 *
 * @author Vítor Rocha Morais 
 * @date   18/06/2018
 *    
 */
public class Lista01Ex03 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);  
        
      
        System.out.println("Digite um numero de no minimo 3 digitos: ");
        int num = input.nextInt();
        
        if (num >= 3){
            
             
       int a = num / 100; 
       int b = (num % 100) / 10; 
       int c = (num % 100) % 10; 
       System.out.printf("%d%d%d\n ",c, b, a); 
            
        }
       
        
        
         
      
    }

}
