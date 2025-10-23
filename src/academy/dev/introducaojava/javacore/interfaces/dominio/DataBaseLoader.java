package academy.dev.introducaojava.javacore.interfaces.dominio;

public class DataBaseLoader implements DataLoader , DataREmover{
    @Override
    public void remove() {
        System.out.println("Removendo dados de um Banco de dados ");
    }

    @Override
    public void load() {
        System.out.println("Carreagndo dados de um Bancos de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chacando permissões do banco de dados ");
    }
}
