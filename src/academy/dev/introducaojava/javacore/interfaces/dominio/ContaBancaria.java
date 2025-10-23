package academy.dev.introducaojava.javacore.interfaces.dominio;

public class ContaBancaria implements  Operacoes{
    private double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor);
    }
}
