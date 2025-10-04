package academy.dev.introducaojava.javacore.introducaoclasses.test;

import academy.dev.introducaojava.javacore.introducaoclasses.dominio.Estudante01;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante01 chamadaestudante = new Estudante01();
        chamadaestudante.nome = "gabriel";
        chamadaestudante.idade = 21;
        chamadaestudante.sexo = 'm';
        System.out.println(chamadaestudante.nome);
        System.out.println(chamadaestudante.idade);
        System.out.println(chamadaestudante.sexo);
    }
}
