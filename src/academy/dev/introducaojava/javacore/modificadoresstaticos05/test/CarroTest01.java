package academy.dev.introducaojava.javacore.modificadoresstaticos05.test;

import academy.dev.introducaojava.javacore.modificadoresstaticos05.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro vrCarro01 = new Carro("BMW", 280 );
        Carro vrCarro02 = new Carro("Mercedes" , 300);
        Carro vrCarro03 = new Carro("Audi",290);

        Carro.setVelocidadeLimite(180);

        vrCarro01.imprime();
        vrCarro02.imprime();
        vrCarro03.imprime();
    }
}
