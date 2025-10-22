package academy.dev.introducaojava.javacore.classesabstratas.test;

import academy.dev.introducaojava.javacore.classesabstratas.dominio.Desencolvedor;
import academy.dev.introducaojava.javacore.classesabstratas.dominio.Funcionario;
import academy.dev.introducaojava.javacore.classesabstratas.dominio.Gerente;

public class Funcionario01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Namiu", 150000);
        Desencolvedor desencolvedor = new Desencolvedor("Gab+303021", 2500);
        System.out.println(gerente);
    }
}
