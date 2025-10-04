package aprofundar.exercicios.dejava;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n1 =scanner.nextInt();
        if (n1 % 2 == 0 ){
            System.out.println("esse numero e par");
        }else {
            System.out.println("esse numero e impar");
        }
    }
}
