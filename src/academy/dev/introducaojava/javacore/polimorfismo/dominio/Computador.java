package academy.dev.introducaojava.javacore.polimorfismo.dominio;

public class Computador extends Produto{
    protected static final double IMPOSTO = 0.61;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalculoDeTaxacao() {
        System.out.println("Calculando o imposto do Computador");
        return this.valor * IMPOSTO;
    }
}
