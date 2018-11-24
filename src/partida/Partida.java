package partida;

import java.util.ArrayList;
import java.util.List;
import jogadores.Jogador;
import territorios.ListaTerritorios;
import territorios.Territorio;

public final class Partida {
    List<Territorio> territorios;
    List<Jogador> jogadores;

    public Partida() {
        territorios = ListaTerritorios.getLista();
        
        jogadores = new ArrayList();
    }
    
    
    
}
