package academy.dev.introducaojava.javacore.introducaoclasses.test;

import academy.dev.introducaojava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTesr01 {
    public static void main(String[] args) {
        Professor linkprof = new Professor();
        linkprof.nome = "foda";
        linkprof.idade = 61;
        linkprof.sexo = 'F';

        System.out.println(linkprof.nome + " " + linkprof.idade +" "+ linkprof.sexo);
    }
}
