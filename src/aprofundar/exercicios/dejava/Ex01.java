package aprofundar.exercicios.dejava;


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int n1 = scanner.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = scanner.nextInt();
        int soma = n1 + n2;
        int sub = n1 - n2;
        double divi = n1 / n2;
        int mult = n1 * n2;
        System.out.println("A soma desses numero e " + soma);
        System.out.println("A subtração desses numero e " + sub);
        System.out.println("A miltiplicação desses numero e " + mult);
        System.out.println("A divisão desses numero e " + divi);



    }
}
