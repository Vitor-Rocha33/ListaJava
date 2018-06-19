package lista01ex02;

import java.util.Scanner;

/**
 *
 * @author Vítor Rocha Morais 
 * @date   18/06/2018
 *    
 */
public class Lista01Ex02 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Escreva a distancia percorrida entre 0 e 12km: ");
        float d = input.nextFloat();
        
        if (d > 0 && d <= 12) {
         
         float metro = d * 1000;
         float tempo = metro /(20 / 3.6f) ;
         float tempoConvertido = tempo /60;
            System.out.printf("O tempo que a onda levou a chegar a %.2f km/h foi de "
                    + "%.2f \n",d ,tempoConvertido);
                   
                    
         }    

       
        
    }

}
