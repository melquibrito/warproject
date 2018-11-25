package partida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jogadores.Jogador;
import jogadores.Jogadores;

public final class Partida {
    private static Partida partida;
    public List<Jogadores> jogadores;
    private Jogador jogador;

    private Partida() {}
    
    public synchronized static void criar(Jogadores[] jogadores) {
        if(partida == null  && jogadores.length > 1 && jogadores.length < 7) {
            partida = new Partida();
            List<Jogadores> lista = new ArrayList();
            for(Jogadores x : jogadores) {
                lista.add(x);
                x.setPartida(partida);
            }
            Collections.shuffle(lista);
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
    
    public void proximo() {
        
    }

    public synchronized static Partida getPartida() {
        if(partida != null) {
            return partida;
        }else {
            return new Partida();
        }
    }
    
}
