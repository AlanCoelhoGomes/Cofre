package Uninter;

public class Dolar extends Moeda {

    public Dolar(double valorInicial){
        this.valor = valorInicial;
    }

    @Override
    public void info() {
        System.out.println("Dolar - " + valor);
    }

    @Override
    public double converter() {
        return this.valor * 5.2;
    }

}
