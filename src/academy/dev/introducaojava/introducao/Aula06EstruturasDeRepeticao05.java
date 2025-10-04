package academy.dev.introducaojava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        int valorTotalCarro = 50000;
        for (int parcela = (int)valorTotalCarro; parcela >=1  ; parcela--) {
            double valorParcela = valorTotalCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcela +" R$ " + valorParcela);

        }

    }
}
