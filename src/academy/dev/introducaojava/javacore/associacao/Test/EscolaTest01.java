package academy.dev.introducaojava.javacore.associacao.Test;

import academy.dev.introducaojava.javacore.associacao.dominio.Escola;
import academy.dev.introducaojava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor vrProfessor01 = new Professor("Jiraia");
        Professor vrProfessor02 = new Professor("Kakashu");
        Professor [] Professores = {vrProfessor01,vrProfessor02};
        Escola vcEscola = new Escola("Konoa" , Professores);

        vcEscola.imprime();
    }
}
