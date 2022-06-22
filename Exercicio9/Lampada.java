
/*Criar uma classe Lâmpada que pode ser ligada e desligada. Também deve ser possível observar o estado 
da lâmpada. 
O programa deve instanciar objetos da classe Lampada e utilizar seus métodos.
*/

package Exercicio9;

public class Lampada {
    
    public String estado;

    public void ligar(){
        estado = "Ligada";
    }

    public void desligar(){
        estado = "Desligada";
    }

    public Lampada(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Lampada [estado=" + estado + "]";
    }

    

}
