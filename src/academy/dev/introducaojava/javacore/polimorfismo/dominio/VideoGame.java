package academy.dev.introducaojava.javacore.polimorfismo.dominio;

public class VideoGame extends Produto {
    private static final double IMPOSTO = 0.01;
    public VideoGame(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CalculoDeTaxacao() {
        return this.valor * IMPOSTO ;
    }
}
