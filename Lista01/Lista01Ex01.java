package lista01ex01;

import java.util.Scanner;

/**
 *
 * @author Vítor Rocha Morais 
 * @date   16/06/2018
 *    
 */
public class Lista01Ex01 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);   
        float mensalidade = 550 ;
        float mensalidadeTot = mensalidade;
        int mes = 1;
       
        do {       
            if ((mes == 12) || (mes == 24) || (mes == 36) || (mes == 48)){
                
            mensalidade += mensalidade * 0.1f;
            
            
            }
           System.out.printf("A mensalidade do mes é %d $%.2f\n" ,mes ,mensalidade);
            mes++; 
            mensalidadeTot += mensalidade;
        }while (mes <= 48);   
        System.out.printf("O valor total a ser pago é $%.2f\n", mensalidadeTot);
        System.out.print("Qual sera o percentual de desconto? ");
        int porcentagemDesconto = input.nextInt();
        
        float desconto = (porcentagemDesconto * mensalidadeTot)/100 ;
        float valorfinal = mensalidadeTot - desconto;
        System.out.printf("O valor final a ser pago é: $%.2f\n " , valorfinal);
        
        
        
    }

}
