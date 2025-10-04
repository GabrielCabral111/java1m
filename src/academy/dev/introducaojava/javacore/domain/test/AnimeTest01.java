package academy.dev.introducaojava.javacore.domain.test;


import academy.dev.introducaojava.javacore.domain.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime vrAvime = new Anime("Naruto","Tv",200,"Ação" , "es");



        vrAvime.imprime();

        //        vrAvime.setNome("Naruto");
//        vrAvime.setTipo("ação");
//        vrAvime.setEpisodio(12);

//        System.out.println(vrAvime.getTipo());
//        System.out.println(vrAvime.getEpisodio());
    }
}
