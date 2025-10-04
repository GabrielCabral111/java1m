package academy.dev.introducaojava.javacore.introducao02.metodos.test;

import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora vrLinkCalculadora = new Calculadora();


       double resultado = vrLinkCalculadora.dividirDoisNumeors(10, 0);
        System.out.println(resultado);
        System.out.println("------------------------------------------");

        vrLinkCalculadora.imprimirDuasDivisoes(10,0);
    }
}
