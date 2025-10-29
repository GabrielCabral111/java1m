package academy.dev.introducaojava.javacore.polimorfismo.dominio;

public class Frutas extends Produto {
    protected static final double IMPOSTO = 0.06;

    public Frutas(String nome, double valor) {
        super(nome, valor);
    }
    private String dataValidade;

    @Override
    public double CalculoDeTaxacao() {
        System.out.println("Calculando o imposto das Frutas");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
