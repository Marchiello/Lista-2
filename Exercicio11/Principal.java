package Exercicio11;

import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Elevador elevador = new Elevador(10, 12);
        Scanner entrada = new Scanner(System.in);

        int controle = 1;

        while(controle == 1){
            System.out.println("==================================================\n");
            System.out.println("Pessoas no elevador: " + elevador.getPessoas() + "\n");
            System.out.println("Andar: "+ elevador.getAndarAtual() + "\n");
            System.out.println("Insira '1' para adicionar uma pessoa \nno elevador");
            System.out.println("Insira '2' para descer uma pessoa do elevador");
            System.out.println("Insira '3' para subir o elevador de andar");
            System.out.println("Insira '4' para descer o elevador de andar");
            System.out.println("");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    elevador.entrar();
                    break;
                case 2:
                    elevador.sair();
                    break;
                case 3:
                    elevador.subir();
                    break;
                case 4:
                    elevador.descer();
                    break;
                default:
                    System.out.println("Comando Inválido!");
                    break;
            }

        }
        
        entrada.close();

    }
    
}
