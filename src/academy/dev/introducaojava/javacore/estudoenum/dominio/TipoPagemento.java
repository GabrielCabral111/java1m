package academy.dev.introducaojava.javacore.estudoenum.dominio;

public enum TipoPagemento {
    DEBITO {
        @Override
        public Double calcularDesconto(double valor) {
            return valor = valor - valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public Double calcularDesconto(double valor) {
            return valor = valor - valor * 0.05;
        }
    };

    public abstract Double calcularDesconto (double valor);

}
