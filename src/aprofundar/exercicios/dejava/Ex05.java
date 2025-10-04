package aprofundar.exercicios.dejava;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de um produto :");
        double precoProduto =scanner.nextDouble();

        System.out.println("Digite a quantidade de produto :");
        double quantidadeProduto=scanner.nextInt();

        double precoTotal = precoProduto * quantidadeProduto;
        if ( quantidadeProduto >10){
            precoTotal = precoTotal * 0.10 ;
            System.out.println("O preco a pagar foi de " + precoTotal + "e teve 10% de desconto");

        }else {
            System.out.println("O preco a pagar foi de " + precoTotal + "e nao  teve  desconto");
        }

    }
}
