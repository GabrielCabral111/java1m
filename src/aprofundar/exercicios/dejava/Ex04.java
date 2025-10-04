package aprofundar.exercicios.dejava;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("-----------  calculo de media ponderada ----------");
        System.out.println("-------------------------------------------------------");
        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 5;

        System.out.println("digite a primeira nota de 0 a 10");
        double n1 = scanner.nextDouble();
        System.out.println("digite a segunda nota de 0 a 10");
        double n2 = scanner.nextDouble();
        System.out.println("digite a terceira nota de 0 a 10");
        double n3 = scanner.nextDouble();
        double somaNotas = (n1 * peso1) + (n2 * peso2) + (n3 * peso3);
        double somaPeso = peso1 + peso2 + peso3;

        double mediaPonderada = somaNotas / somaPeso;

        System.out.println(" A media do aluno e " + mediaPonderada);
    }
}
