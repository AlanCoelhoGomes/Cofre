package Uninter;

public class Euro extends Moeda {

    public Euro(double valorInicial){
        this.valor = valorInicial;
    }

    @Override
    public void info() {
        System.out.println("Euro - " + valor);
    }

    @Override
    public double converter() {
        return this.valor * 4.5;
    }

}
