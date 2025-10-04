package academy.dev.introducaojava.javacore.introducao02.metodos.test;

import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora vrCalculadora = new Calculadora();

        int [] novalista = {1,2,3,4,5};

        vrCalculadora.somaArray(novalista);

        vrCalculadora.somaVarArgs(1,2,3,4,5,6,7,8);
    }
}
