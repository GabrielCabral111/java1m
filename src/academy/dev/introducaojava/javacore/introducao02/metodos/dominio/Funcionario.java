package academy.dev.introducaojava.javacore.introducao02.metodos.dominio;

public class Funcionario {
    private String nome;
    private   int idade;
    private   double [] salario;
    private double media  ;

    public void ImprimaDados(){
        System.out.println("nome " + this.nome);
        System.out.println("idade " + this.idade);
        if (salario == null){
            return;
        }
        for (double salari : salario ){
            System.out.println(salari + "");
            
        };

    }

    public  void mediaSalario (){
        double media = 0;
        if (salario == null){
            return;
        }
        for (double salari : salario){
            media += salari;
        }
        media /= salario.length;
        System.out.println("a media do salrio e : " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }



    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
