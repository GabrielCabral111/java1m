package academy.dev.introducaojava.javacore.heranca.test;

import academy.dev.introducaojava.javacore.heranca.dominio.Endereco;
import academy.dev.introducaojava.javacore.heranca.dominio.Funcionario;
import academy.dev.introducaojava.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua jardum das flores");
        endereco.setCep("03223-230");

        Pessoa pessoa = new Pessoa("Kaneki");
        pessoa.setCpf("1212121");
        pessoa.getEndereco(endereco);

        Funcionario funcionario = new Funcionario("tomioka");
        funcionario.setCpf("33133232");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(500000);

        pessoa.imprime();
        System.out.println("-------------------");
        funcionario.imprime();

    }
}
