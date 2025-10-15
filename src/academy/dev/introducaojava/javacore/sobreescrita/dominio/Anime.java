package academy.dev.introducaojava.javacore.sobreescrita.dominio;

public class Anime {
    private String name;


    @Override
    public String toString(){
        return "Anime " + name;
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
