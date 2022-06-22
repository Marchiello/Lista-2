import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================================================\n");
        System.out.println("Insira um número a seguir para calcular seu fatorial:");
        int numero = entrada.nextInt();
        System.out.println("\n");

        int fatorial = numero;

        while(numero > 1){
            fatorial = fatorial * (numero - 1);
            numero = numero - 1;
        }
        System.out.println(fatorial);

        entrada.close();

    }
}
