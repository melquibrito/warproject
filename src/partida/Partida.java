package partida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jogadores.Jogador;

public final class Partida {
    private final List<Jogador> jogadores;

    public Partida(Jogador[] listaDeJogadores) {
        jogadores = setJogadores(listaDeJogadores);
    }
    
    private List<Jogador> setJogadores(Jogador[] listaDeJogadores) {
        Set<Jogador> lista = new HashSet();
        if(listaDeJogadores != null) {
            for(Jogador x : listaDeJogadores) {
                lista.add(x);
            }
        }
        if(!lista.isEmpty()){
            ArrayList<Jogador> listaFinal = new ArrayList();
            for(Jogador x : lista){
                listaFinal.add(x);
            }
            Collections.shuffle(listaFinal);
            return Collections.unmodifiableList(listaFinal);
        }
        return null;
    }
    
}
