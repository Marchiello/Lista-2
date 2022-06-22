package Exercicio8;

/*Criar uma classe Contador que encapsule um valor usado para a contagem de itens ou eventos. 
A classe deve conter métodos que devem:
Zerar o contador;
Incrementar o contador em uma unidade;
Retornar o valor do contador;
O programa deve instanciar objetos da classe Contador e utilizar seus métodos.

*/

public class Contador{

    public int contagem = 0;

    public void aumentar(){
        contagem += 1;
    }

    public void diminuir(){
        contagem -=1;
    }

    public void zerar(){
        contagem = 0;
    }

    public Contador(int contagem) {
        this.contagem = contagem;
    }

    public int getContagem() {
        return contagem;
    }

    @Override
    public String toString() {
        return "Contador [contagem=" + contagem + "]";
    }

}
