package academy.dev.introducaojava.javacore.polimorfismo.services;

import academy.dev.introducaojava.javacore.polimorfismo.dominio.Frutas;
import academy.dev.introducaojava.javacore.polimorfismo.dominio.Produto;

public class CalculandoImposto {
    public static void calculandoImposto(Produto produto){
        System.out.println("Relatorio de Imposto Dos Produtod");
        double imposto = produto.CalculoDeTaxacao();
        System.out.println("Imposto do Produto " + produto.getNome());
        System.out.println("Valor " + produto.getValor()  );
        System.out.println("Imposto a ser pago " + imposto);
        if (produto instanceof  Frutas){
        Frutas frutas = (Frutas) produto;
        System.out.println("Data de validade " + ((Frutas) produto).getDataValidade());
        }



    }
}
