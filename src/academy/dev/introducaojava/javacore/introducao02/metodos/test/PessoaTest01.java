package academy.dev.introducaojava.javacore.introducao02.metodos.test;

import academy.dev.introducaojava.javacore.introducao02.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa vrPessoa = new Pessoa();
//        vrPessoa.nome = "Gabriel";
//        vrPessoa.idade = 21;

        vrPessoa.setNome("Gabriel");
        vrPessoa.setIdade(21 );

//        vrPessoa.Imprime();

        System.out.println(vrPessoa.getNome());
        System.out.println(vrPessoa.getIdade());
    }
}
