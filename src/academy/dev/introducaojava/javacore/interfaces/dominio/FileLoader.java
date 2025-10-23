package academy.dev.introducaojava.javacore.interfaces.dominio;

public class FileLoader implements DataLoader , DataREmover{
    @Override
    public void remove() {
        System.out.println("Deletando dados de um Arquivo");
    }

    @Override
    public void load() {
        System.out.println("Carrega um dado de um Arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chacando permissões no Arquivo ");
    }
}
