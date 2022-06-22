package Exercicio10;

/*

Exercício Conta
Criar uma classe Conta que contenha o nome do cliente, o número da conta e o saldo. Estes valores deverão ser informados no construtor da classe;
Criar um método depositar e um método sacar para realizar o depósito e o saque de valores da conta;
Criar métodos getters para cada atributo da classe.
O programa deve instanciar objetos da classe Conta e utilizar seus métodos.

*/

public class Conta {
    
    private String nomeCliente = "Marcello";
    private int numeroConta = 1000000000;
    private float saldo = 0f;


    public void depositar(float deposito){
        this.saldo = this.saldo + deposito;
    }

    public void sacar(float saque){
        if(this.saldo > 0 && this.saldo - saque >= 0){
        
            this.saldo = this.saldo - saque;

        }else{
            System.out.println("Saldo Insuficiente");
        }
        
        

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta [nomeCliente=" + nomeCliente + ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
    }

    

}
