package academy.dev.introducaojava.javacore.estudoenum.dominio;

public enum TipoCliente {
    Pessoa_Fisica(1, "Pessoa Fisica"),
    Pessoa_juridica(2 , "Pessoa Juridica");

    private   int valor;
    private String nomeRelatorio;

    TipoCliente(int valor , String nomRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRElatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente ;
            }
            
        }
        return null  ;

    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
