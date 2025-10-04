package academy.dev.introducaojava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        int valorTotalCarro = 50000;
        for (int parcela = 1; parcela <= valorTotalCarro ; parcela++) {
            double valorParcela = valorTotalCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("parcela " + parcela +" R$ " + valorParcela);

        }

    }
}
