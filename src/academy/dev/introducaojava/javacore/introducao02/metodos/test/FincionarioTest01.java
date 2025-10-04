package academy.dev.introducaojava.javacore.introducao02.metodos.test;

import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.Funcionario;

public class FincionarioTest01 {
    public static void main(String[] args) {
        Funcionario vrFuncionarioDados = new Funcionario();


        vrFuncionarioDados.setNome("Gabriel");
        vrFuncionarioDados.setIdade(21);
        vrFuncionarioDados.setSalario(new double []{1500,4000,5000});

        vrFuncionarioDados.ImprimaDados();
        vrFuncionarioDados.mediaSalario();



    }
}
