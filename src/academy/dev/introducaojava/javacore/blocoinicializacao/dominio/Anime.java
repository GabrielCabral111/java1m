package academy.dev.introducaojava.javacore.blocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios ;

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
        for (int episodio : episodios){
            System.out.print(episodio + "");
        }
    }
}
