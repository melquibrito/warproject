package partida.objetivos;

import java.util.List;
import jogadores.Jogador;

public abstract class Objetivo {
    
    public static List<Objetivo> objetivos;
    
    static {
        
    }
    
    public boolean checar(Jogador jogador) {
        
        return false;
    }
    
}
