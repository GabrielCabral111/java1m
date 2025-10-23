package academy.dev.introducaojava.javacore.interfaces.dominio;

public interface DataLoader {

    void load();

    default void checkPermission(){
        System.out.println("Faendo checagem de permiçoes ");
    }
}
