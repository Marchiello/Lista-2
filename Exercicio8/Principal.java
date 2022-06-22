package Exercicio8;

import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        Contador contador = new Contador(0);
        int controle = 0;

        while(controle == 0){

            System.out.println("==================================================\n");
            System.out.println("Contador: "+ contador.contagem);
            System.out.println("");
            System.out.println("Insira '+' para Aumentar a Contagem");
            System.out.println("Insira '-' para Diminuir a Contagem");
            System.out.println("Insira 'x' para Zerar a Contagem");
            System.out.println("Insira 's' para Sair");
            System.out.println("");
            char opcao = entrada.next().charAt(0);

            switch (opcao) {
                case '+':
                    contador.aumentar();
                    break;
                case '-':
                    contador.diminuir();
                    break;
                case 'X' | 'x':
                    contador.zerar();
                    break;
                case 'S' | 's':
                    controle = 1;
                    break;
                default:
                    System.out.println("Comando Inválido!");
                    break;
            }

        }
        

        entrada.close();

    }
}
