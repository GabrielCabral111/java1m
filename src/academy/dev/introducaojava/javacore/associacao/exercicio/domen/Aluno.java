package academy.dev.introducaojava.javacore.associacao.exercicio.domen;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminaro;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public Seminario getSeminaro() {
        return seminaro;
    }
    public void setSeminaro(Seminario seminaro) {
        this.seminaro = seminaro;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
