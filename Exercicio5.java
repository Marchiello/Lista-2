/*
Faça um programa que simule o menu de uma agenda eletrônica. Agenda deve possuir opções tais 

como: (só precisa criar o menu)
Adicionar contato;
buscar contato;
remover contato;
editar contato;
sair
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int controle = 1;

        while(controle == 1){

            System.out.println("============================[ MEUN ]=========================\n");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato");
            System.out.println("3 - Remover Contato");
            System.out.println("4 - Editar Contato");
            System.out.println("5 - Sair\n");
            System.out.println("=============================================================\n");
            System.out.println("Insira uma opção:");
            int opcao = entrada.nextInt();
            System.out.println("\n\n");

            switch (opcao) {
                case 1:
                    System.out.println("Opcao Selecionada:\n\n");
                    System.out.println("1 - Adicionar Contato\n");
                    break;
                case 2:
                    System.out.println("Opcao Selecionada:\n\n");
                    System.out.println("2 - Buscar Contato\n");
                    break;
                case 3:
                    System.out.println("Opcao Selecionada:\n\n");
                    System.out.println("3 - Remover Contato\n");
                    break;
                case 4:
                    System.out.println("Opcao Selecionada:\n\n");
                    System.out.println("4 - Editar Contato\n");
                    break;
                case 5:
                    System.out.println("Opcao Selecionada:\n\n");
                    System.out.println("5 - Sair\n");
                    controle = 0;
                    break;
                default:
                    System.out.println("A Opcao Selecionada é Inválida!\n\n");
                    break;
            }

        }
        
        entrada.close();


    }
}
