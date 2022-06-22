/*Faça um programa que verifique os números de 0 a 500, e verifique se ele está entre o intervalo de 
100 e 200.  Se estiver dentro desta faixa, imprimir “Você digitou um número entre 100 e 200”, senão  
imprima “Você digitou um número fora da faixa”.*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================================================\n");
        System.out.println("Digite um número entre 0 e 500:\n ");
        int numero = entrada.nextInt();
        System.out.println("");

        if(numero >= 0 && numero <= 500){
            if(numero > 100 && numero <=200){

                System.out.println("=============================================================\n");
                System.out.println("Você digitou um número entre 100 e 200\n");
                System.out.println("=============================================================\n");
    
            }else{
    
                System.out.println("=============================================================\n");
                System.out.println("Você digitou um número fora da faixa\n");
                System.out.println("=============================================================\n");
    
            }
        }else{
            System.out.println("=============================================================\n");
            System.out.println("Número Inválido!\n");
            System.out.println("=============================================================\n");

        }

        entrada.close();

    }
}
