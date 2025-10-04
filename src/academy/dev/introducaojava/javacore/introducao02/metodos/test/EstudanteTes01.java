package academy.dev.introducaojava.javacore.introducao02.metodos.test;

import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.Estudante;
import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.ImprimeEstudante;

public class EstudanteTes01 {
    public static void main(String[] args) {
        Estudante vrLinkestudante01 = new Estudante();
        Estudante vrLinkestudante02 = new Estudante();
        ImprimeEstudante imprime = new ImprimeEstudante();

        vrLinkestudante01.nome = "Gab";
        vrLinkestudante01.idade = 21;
        vrLinkestudante01.sexo = 'M';

        vrLinkestudante02.nome = "Maria";
        vrLinkestudante02.idade = 21;
        vrLinkestudante02.sexo = 'F';

        imprime.impreime(vrLinkestudante01);
        imprime.impreime(vrLinkestudante02);




    }





}
