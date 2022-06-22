/*
 Faça um programa que de 0 a 100 verifique se o número é par ou impar. Caso esse valor seja par, 
 deverá imprimir  “Número par” caso contrário, “Número ímpar”.
 */

 import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================================================\n");
        System.out.println("Digite um número entre 0 e 100:\n ");
        int numero = entrada.nextInt();
        System.out.println();

        if(numero >= 0 && numero <= 100){

            if(numero % 2 == 0){
                System.out.println("=============================================================\n");
                System.out.println("Número Par\n ");
                System.out.println("=============================================================\n");
            }else{
                System.out.println("=============================================================\n");
                System.out.println("Número Impar\n ");
                System.out.println("=============================================================\n");
            }

        }else{
            System.out.println("=============================================================\n");
                System.out.println("Número Inválido!\n ");
                System.out.println("=============================================================\n");
        }

        entrada.close();

    }
}
