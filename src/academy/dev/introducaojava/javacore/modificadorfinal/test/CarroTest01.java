package academy.dev.introducaojava.javacore.modificadorfinal.test;

import academy.dev.introducaojava.javacore.modificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome(" Ferrari ");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR );
        carro.COMPRADOR.setNome("gabriel");
        System.out.println(carro.COMPRADOR );
    }
}
