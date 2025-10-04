package academy.dev.introducaojava.introducao;

public class Aula04Operadore {
    public static void main(String[] args) {
        int numero1 = 10;
        double numeor2 = 20;
        double soma = numero1 + numeor2;
        double subtracao = numero1-numeor2;
        double divisao = numero1 / numeor2;
        double multiplicacao = numero1 * numeor2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);

        // operadores logicos esse is na frente e como se fosse o é
         boolean isDesmaiorQueVinte = 10 > 20 ;
         boolean isVintmeMiorDez = 20 > 10 ;
         boolean isVinteigualDez = 20 == 10 ;
         boolean isDezigualDez = 10 == 10 ;
         boolean isDezDiferenteDez = 10 != 10 ;
        System.out.println("isDesmaiorQueVinte "+isDesmaiorQueVinte);
        System.out.println("isVintmaiorDez "+ isVintmeMiorDez);
        System.out.println("isVinteigualDez "+ isVinteigualDez);
        System.out.println("isDezigualDez "+ isDezigualDez);
        System.out.println("isDezDiferenteDez "+ isDezDiferenteDez);
        // (AND) &&  É (or) !

        // (AND) &&
        int idade = 18;
        float salario = 1500F;
        boolean isRicoNovo = idade >= 18 && salario > 2000;
        boolean isMlkNormal = idade >= 18 && salario > 1000;
        System.out.println("isRicoNovo " + isRicoNovo);
        System.out.println("isMlkNormal " + isMlkNormal);

        // (or) ||  bom para automatizar
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupansa = 10000;
        float valorPlayStatipon = 5000;

        boolean isPlasTationCompravel = valorTotalContaCorrente > valorPlayStatipon || valorTotalContaPoupansa > valorPlayStatipon ;
        System.out.println("isPlasTationCompravel" + isPlasTationCompravel);

        // operadores de atribuiçao = += -= *= /= %=
         double bonus = 1800;
        // bonus = bonus + 100; e a mesma coisa que a linha de baixo
        bonus += 100;
        bonus -= 100;
        bonus *= 100;
        bonus /= 100;
        bonus %= 100;



    }



}

