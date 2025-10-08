package academy.dev.introducaojava.javacore.associacao.Test;

import academy.dev.introducaojava.javacore.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador vrJogador01 =  new Jogador("pele");
        Jogador vrJogador02 =  new Jogador("Ronalinho");
        Jogador vrJogador03 =  new Jogador("Cafu");
        Jogador [] Jogadores = new Jogador []{vrJogador01 , vrJogador02 , vrJogador03};
        for (Jogador jogador : Jogadores){
            jogador.imprime();

        }
    }
}
