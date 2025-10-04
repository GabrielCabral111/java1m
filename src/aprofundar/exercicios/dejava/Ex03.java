package aprofundar.exercicios.dejava;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("-----------  calculo de area de um triangulo ----------");
        System.out.println("-------------------------------------------------------");

        System.out.println("Digite a base ");
        double base = scanner.nextDouble();
        System.out.println("digite a altura");
        double alt = scanner.nextDouble();

        double area = (base * alt)/2;

        System.out.println("A area do triangulo e " + area);
    }
}
