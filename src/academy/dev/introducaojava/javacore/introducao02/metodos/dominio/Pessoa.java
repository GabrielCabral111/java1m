package academy.dev.introducaojava.javacore.introducao02.metodos.dominio;

public class Pessoa {
    private String nome;
    private   int idade;


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Erro idade invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }


    public int getIdade() {
        return this.idade;
    }
    public void Imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
