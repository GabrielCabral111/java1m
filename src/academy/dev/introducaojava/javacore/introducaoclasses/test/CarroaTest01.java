package academy.dev.introducaojava.javacore.introducaoclasses.test;

import academy.dev.introducaojava.javacore.introducaoclasses.dominio.CarroEx;

public class CarroaTest01 {
    public static void main(String[] args) {
        CarroEx carro01 = new CarroEx();
        CarroEx carro02 = new CarroEx();

        carro01.nome = "Ford" ;
        carro01.modelo = "Mustang";
        carro01.ano = 2021;

        carro02.nome = "Ferrari ";
        carro02.modelo = "puro Sangue";
        carro02.ano = 2025;

        System.out.println("Marca " + carro01.nome +" Modelo "+ carro01.modelo + " Ano " + carro01.ano);
        System.out.println("Marca " + carro02.nome +"Modelo "+ carro02.modelo + " Ano "  + carro02.ano);
    }
}
