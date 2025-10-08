package academy.dev.introducaojava.javacore.associacao.Test;

import academy.dev.introducaojava.javacore.associacao.dominio.Jogador;
import academy.dev.introducaojava.javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("cafu");
        Jogador jogador2 = new Jogador("pele");
        Time time = new Time("brasil");
        Jogador [] jogadores ={jogador1 , jogador2};


        time.setJogadores(jogadores);

        jogador1.setTime(time);
        jogador2.setTime(time);


        System.out.println("--- jogador ------");

        jogador1.imprime();

        System.out.println("--- time ------");

        time.imprime();
    }
}
