//Criar um programa que leia 10 números positivos e imprima a raiz quadrada de cada número.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int controle = 10;

        while(controle != 0){

            
            System.out.println("=============================================================\n");
            System.out.println("Insira um número para ler sua raíz quadrada:\n");
            int numero = entrada.nextInt();
            System.out.println("\n");

            if(numero > 0){
                System.out.println("Raiz:");
                double raiz = Math.sqrt(numero);
                System.out.println(raiz);
                System.out.println("\n");
                controle = controle - 1;
            }else{
                System.out.println("É impossivel calcular a raiz de um número negativo");
                // Perguntar sobre incrementação
                controle = controle - 1;
            }

            

        }

        entrada.close();
        

    }
}
