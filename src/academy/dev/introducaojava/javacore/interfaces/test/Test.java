package academy.dev.introducaojava.javacore.interfaces.test;

import academy.dev.introducaojava.javacore.interfaces.dominio.ContaBancaria;
import academy.dev.introducaojava.javacore.interfaces.dominio.Operacoes;

public class Test {
    public static void main(String[] args) {
            Operacoes conta = new ContaBancaria();
            conta.depositar(100);
            conta.sacar(40);
    }


}
