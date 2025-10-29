package academy.dev.introducaojava.javacore.polimorfismo.test;

import academy.dev.introducaojava.javacore.polimorfismo.dominio.Computador;
import academy.dev.introducaojava.javacore.polimorfismo.dominio.Frutas;
import academy.dev.introducaojava.javacore.polimorfismo.dominio.Produto;
import academy.dev.introducaojava.javacore.polimorfismo.dominio.VideoGame;
import academy.dev.introducaojava.javacore.polimorfismo.services.CalculandoImposto;

public class LogaProduto {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Ryzem 5" , 12000);
        Produto produto02 = new Frutas("tomate" , 12);
        Produto produto03 = new VideoGame("Playstation 5 " , 5000);

        Frutas frutas = new Frutas("Banana " , 12);
        frutas.setDataValidade("11/11/2025 ");


        CalculandoImposto.calculandoImposto(produto01);
        System.out.println("--------------------------");
        CalculandoImposto.calculandoImposto(produto02);
        System.out.println("--------------------------");
        CalculandoImposto.calculandoImposto(produto03);
        System.out.println("--------------------------");
        CalculandoImposto.calculandoImposto(frutas);
    }
}
