package academy.dev.introducaojava.javacore.associacao.exercicio.domen;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("==============================");
        System.out.println("Nome do Professor " + this.nome);
        if (this.seminarios == null)return;
        System.out.println(" ## Seminarios cadastrados ## ");
        for (Seminario seminario : this.seminarios) {
            if (seminario.getTitulo() == null) return;
            System.out.println(seminario.getTitulo());
            if (seminario.getLocal().getEndereco() == null )return;
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0)continue;
            System.out.println(" *** Aluno *** ");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno cadastrado " + aluno.getNome() + " Idade do aluno " + aluno.getIdade());

                
            }


        }

    }







    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public  String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
