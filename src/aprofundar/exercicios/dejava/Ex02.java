package aprofundar.exercicios.dejava;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("------ calculo de area e perimetro de circulo ---------");
        System.out.println("-------------------------------------------------------");
        System.out.println("digite o raio do circulo");
        double raio = scanner.nextDouble();
        double area = 3.14*(Math.pow(raio , 2));
        double perimetro = 2 *3.12 * area;
        System.out.printf("A área do círculo é: %.2f%n", area);
        System.out.printf("O perímetro do círculo é: %.2f%n", perimetro);


    }
}
