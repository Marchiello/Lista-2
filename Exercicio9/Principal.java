package Exercicio9;

import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Lampada light = new Lampada("Desligada");
        Scanner entrada = new Scanner(System.in);

        int controle = 1;

        while(controle == 1){
            System.out.println("==================================================\n");
            System.out.println("A Lâmpada está "+ light.estado);
            System.out.println("");
            System.out.println("Insira '+' para Ligar a Lampada");
            System.out.println("Insira '-' para Desligar a Lampada");
            System.out.println("Insira 'v' para ver se a lampada está ligada\nou desligada");
            System.out.println("Insira 's' para Sair de perto da lampada");
            System.out.println();
            char opcao = entrada.next().charAt(0);
            switch (opcao) {
                case '+':
                    light.ligar();
                    break;
                case '-':
                    light.desligar();
                    break;
                case 'S' | 's':
                    controle = 0;
                    break;
                default:
                    System.out.println("Opcao Inválida");
                    break;
            }
        }

        entrada.close();
    
    }
}
