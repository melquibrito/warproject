package partida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jogadores.Jogador;

public final class Partida {
    private static Partida partida;
    private List<Jogador> jogadores;

    private Partida() {}
    
    public synchronized static void criar(Jogador[] jogadores) {
        if(jogadores.length > 1 && jogadores.length < 7) {
            partida = new Partida();
            List<Jogador> lista = new ArrayList();
            for(Jogador x : jogadores) {
                lista.add(x);
            }
            partida.sortearOrdem(lista);
            partida.jogadores = Collections.unmodifiableList(lista);
        }
    }
    
    public void iniciar() {
        partida.sortearTerritorios();
        partida.sortearObjetivos();
        partida.iniciarPrimeiraRodada();
    }
    
    public void encerrar() {
        partida = null;
    }
    
    private void sortearTerritorios() {
        
    }
    
    private void sortearObjetivos() {
        
    }
    
    private void iniciarPrimeiraRodada() {
        
    }
    
    private void sortearOrdem(List<Jogador> lista) {
        Collections.shuffle(lista);
    }

    public static Partida getPartida() {
        return partida;
    }
    
}
