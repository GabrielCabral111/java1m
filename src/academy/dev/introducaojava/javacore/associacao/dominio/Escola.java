package academy.dev.introducaojava.javacore.associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] vrProfessores;



    public Escola(String nome, Professor[] vrProfessores) {
        this.nome = nome;
        this.vrProfessores = vrProfessores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(vrProfessores == null){
            return;
        }
        for (Professor professor : vrProfessores){
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public Professor[] getVrProfessores() {
        return vrProfessores;
    }
    public void setVrProfessores(Professor[] vrProfessores) {
        this.vrProfessores = vrProfessores;
    }
}

