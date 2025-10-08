package academy.dev.introducaojava.javacore.associacao.exercicio.test;

import academy.dev.introducaojava.javacore.associacao.exercicio.domen.Aluno;
import academy.dev.introducaojava.javacore.associacao.exercicio.domen.Local;
import academy.dev.introducaojava.javacore.associacao.exercicio.domen.Professor;
import academy.dev.introducaojava.javacore.associacao.exercicio.domen.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Ibirapuera");
        Aluno aluno = new Aluno("Gabriel", 22);

        Professor professor = new Professor("Kakashi", "Genjutsu");
        Aluno [] alunosParaSeminario = {aluno};


        Seminario seminario = new Seminario("(oo) aula de poo", alunosParaSeminario,local);
        Seminario [] seminariosDisponivel = {seminario};



        professor.setSeminarios(seminariosDisponivel);


        professor.imprime();
    }
}
