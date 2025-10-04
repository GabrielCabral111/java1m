package academy.dev.introducaojava.javacore.introducao02.metodos.test;

import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.Estudante;
import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.ImprimeEstudante;

public class EstudanteTes02 {
    public static void main(String[] args) {
        Estudante vrLinkestudante01 = new Estudante();
        Estudante vrLinkestudante02 = new Estudante();

        vrLinkestudante01.nome = "Gab";
        vrLinkestudante01.idade = 21;
        vrLinkestudante01.sexo = 'M';

        vrLinkestudante02.nome = "Maria";
        vrLinkestudante02.idade = 21;
        vrLinkestudante02.sexo = 'F';

        vrLinkestudante01.imprime();

        vrLinkestudante02.imprime();

    }
}
