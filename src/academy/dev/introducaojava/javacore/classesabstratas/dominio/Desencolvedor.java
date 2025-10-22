package academy.dev.introducaojava.javacore.classesabstratas.dominio;

public class Desencolvedor extends Funcionario{
    public Desencolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desencolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void  calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }
}
