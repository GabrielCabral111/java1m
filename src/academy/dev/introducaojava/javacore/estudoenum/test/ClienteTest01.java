package academy.dev.introducaojava.javacore.estudoenum.test;

import academy.dev.introducaojava.javacore.estudoenum.dominio.Cliente;
import academy.dev.introducaojava.javacore.estudoenum.dominio.TipoCliente;
import academy.dev.introducaojava.javacore.estudoenum.dominio.TipoPagemento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Kirrito", TipoCliente.Pessoa_Fisica);
        Cliente cliente02 = new Cliente("Kirrito", TipoCliente.Pessoa_juridica);


        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagemento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagemento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("Pessoa_Fisica");
        System.out.println(tipoCliente);

    }
}
