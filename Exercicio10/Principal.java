package Exercicio10;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[]args){

        Conta conta = new Conta();
        Scanner entrada = new Scanner(System.in);
        float valor;
        int controle = 0;

        while(controle == 0){
            
            System.out.println("==================================================\n");
            System.out.println("Insira '1' para ver o nome do cliente");
            System.out.println("Insira '2' para ver o numero da conta");
            System.out.println("Insira '3' para ver o saldo");
            System.out.println("Insira '4' para fazer um deposito");
            System.out.println("Insira '5' para fazer um saque");
            System.out.println("Insira '6' para sair");
            System.out.println("");

            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(conta.getNomeCliente()); 
                    break;
                case 2:
                    System.out.println(conta.getNumeroConta());
                    break;
                case 3:
                    System.out.println(conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Insira o valor que você deseja depositar");
                    valor = entrada.nextFloat();
                    conta.depositar(valor);
                    break;
                case 5:
                    System.out.println("Insira o valor que você deseja sacar");
                    valor = entrada.nextFloat();
                    conta.sacar(valor);
                    break;
                case 6:
                    controle = 1;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }

        }

        entrada.close();

    }
}
