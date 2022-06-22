// Criar um programa que receba vários números inteiros e positivos e imprima a média 
// dos números múltiplos de 3.

// Achei essa questão meio confusa pra fazer, mas as outras foram tranquilas.
// Não consegui fazer, :I


import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int posicao = 0;
        int media = 0;

        System.out.println("=============================================================\n");
        System.out.println("Você deseja ler quantos numeros?");
        int controle = entrada.nextInt();
        System.out.println("\n");

        int lista[] = new int[controle - 1];
        int quantidade = 0;
        while(posicao != controle){
            
            System.out.println("Insira um número inteiro positivo:");
            lista[posicao] = entrada.nextInt();
            posicao = posicao + 1;

        }

        posicao = 0;
        while(posicao != controle){
            
            if(lista[posicao] % 3 == 0){
                quantidade = quantidade + 1;
            }else{         
            }

        }
        
        int multiplos[] = new int[quantidade];

        posicao = 0;
        int posicao1 = 0;

        while(posicao != quantidade){
            if(lista[posicao] % 3 == 0){
                multiplos[posicao] = lista[posicao1];
                posicao = posicao + 1;
                posicao1 = posicao1 + 1;
            }else{
                posicao = posicao + 1;
            }

        }

        posicao = 0;

        while(posicao != multiplos.length){
            
            media = media + multiplos[posicao];
        }

        media = media / multiplos.length;

        entrada.close();

    }
}
