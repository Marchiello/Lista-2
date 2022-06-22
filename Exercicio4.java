// Faça um programa que calcule os 20 primeiros múltiplos de um valor informado via  teclado. 

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================================================\n");
        System.out.println("Insira um número para calcular seus multiplos");
        int numero = entrada.nextInt();
        System.out.println("");

        int controle = 20;

        while(controle != 0){
            System.out.println(controle + "X" + numero + "=" + controle * numero);
            controle = controle - 1;
        }

        entrada.close();

    }

}
