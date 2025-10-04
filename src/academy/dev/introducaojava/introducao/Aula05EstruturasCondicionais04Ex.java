package academy.dev.introducaojava.introducao;

public class Aula05EstruturasCondicionais04Ex {
    public static void main(String[] args) {
        double salrioAnual = 70000;
        double primeiraFaixa = 9.7 /100;
        double segundaFaixa = 37.35 /100;
        double terceiraFaixa = 49.5 /100;
        double valorImposto ;
        if (salrioAnual <= 34712){
            //salrioAnual = salrioanual * primeiraFaixa
            salrioAnual *= primeiraFaixa;
        } else if (salrioAnual >= 34713 && salrioAnual <= 68507) {
            salrioAnual *= segundaFaixa;

        }else {
            salrioAnual *= terceiraFaixa;
        }

        System.out.println(salrioAnual);
    }
}
