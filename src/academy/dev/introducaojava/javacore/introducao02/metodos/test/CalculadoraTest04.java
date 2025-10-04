package academy.dev.introducaojava.javacore.introducao02.metodos.test;

import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculadora vrLinkCalculadora = new Calculadora();
        vrLinkCalculadora.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
