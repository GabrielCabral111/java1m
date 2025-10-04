package academy.dev.introducaojava.javacore.intrducao03.test;

import academy.dev.introducaojava.javacore.intrducao03.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime vrAvime = new Anime();


        vrAvime.init("Naruto","Tv",200);
        vrAvime.init("Naruto","Tv",200,"Ação");
        vrAvime.imprime();

        //        vrAvime.setNome("Naruto");
//        vrAvime.setTipo("ação");
//        vrAvime.setEpisodio(12);

//        System.out.println(vrAvime.getTipo());
//        System.out.println(vrAvime.getEpisodio());
    }
}
