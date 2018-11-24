package partida;

import java.util.ArrayList;
import java.util.List;
import jogadores.Jogador;
import territorios.ListaTerritorios;
import territorios.Territorio;

public final class Partida {
    private final List<Territorio> territorios;
    private final List<Jogador> jogadores;

    public Partida(Jogador[] listaDeJogadores) {
        territorios = ListaTerritorios.getLista();
        jogadores = new ArrayList();
        if(listaDeJogadores != null) {
            for(Jogador x : listaDeJogadores) {
                jogadores.add(x);
            }
        }
    }
    
    
    
}
