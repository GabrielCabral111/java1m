package academy.dev.introducaojava.javacore.interfaces.test;

import academy.dev.introducaojava.javacore.interfaces.dominio.DataBaseLoader;
import academy.dev.introducaojava.javacore.interfaces.dominio.FileLoader;

import java.nio.file.attribute.FileAttribute;

public class DataLoaderTesta01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        System.out.println("");

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

    }
}
