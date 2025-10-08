package academy.dev.introducaojava.javacore.associacao.Test;

import academy.dev.introducaojava.javacore.associacao.dominio.Jogador;
import academy.dev.introducaojava.javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador vrJogador = new Jogador("pele");
        Time vrTime = new Time("Brasil");


        vrJogador.setTime(vrTime);
        vrJogador.imprime();
    }
}
