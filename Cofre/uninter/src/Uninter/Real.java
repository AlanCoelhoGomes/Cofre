package Uninter;

public class Real extends Moeda {

    public Real(double valorInicial){
        this.valor = valorInicial;
    }

    @Override
    public void info() {
        System.out.println("Real - " + valor);
    }

    @Override
    public double converter() {
        return this.valor;
        }

}
