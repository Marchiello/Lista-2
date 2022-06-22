/*

Exercício Elevador
Criar uma classe denominada Elevador para armazenar as informações de um elevador dentro de um 
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio 
(desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe 
deve também disponibilizar os seguintes métodos:
Construtor: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio 
(os elevadores sempre começam no térreo e vazio);
Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Subir: para subir um andar (não deve subir se já estiver no último andar);
Descer: para descer um andar (não deve descer se já estiver no térreo).

 */

package Exercicio11;

public class Elevador {
    
    private int andarAtual = 0;
    private int andares;
    private int capacidade;
    private int pessoas = 0;

    

    public Elevador() {
    }

    
    public Elevador(int andares, int capacidade) {
        this.andares = andares;
        this.capacidade = capacidade;
    }

    public void entrar(){
        if(pessoas < capacidade){
            pessoas = pessoas + 1;
        }else{
            System.out.println("Capacidade Insuficiente!");
        }
    }

    public void sair(){
        if(pessoas != 0){
            pessoas = pessoas - 1;
        }else{
            System.out.println("Elevador Vazio!");
        }
    }

    public void subir(){
        if(andarAtual < andares){
            andarAtual = andarAtual + 1;
        }else{
            System.out.println("Você ja está no ultimo andar");
            
        }
    }

    public void descer(){
        if(andarAtual > 0){
            andarAtual = andarAtual - 1;
        }else{
            System.out.println("Você ja está no térreo!");
            
        }
    }


    public int getAndarAtual() {
        return andarAtual;
    }


    public int getAndares() {
        return andares;
    }


    public int getCapacidade() {
        return capacidade;
    }


    public int getPessoas() {
        return pessoas;
    }


    @Override
    public String toString() {
        return "Elevador [andarAtual=" + andarAtual + ", andares=" + andares + ", capacidade=" + capacidade
                + ", pessoas=" + pessoas + "]";
    }
    
    

}
