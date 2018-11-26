package jogadores.estado;

import jogadores.Jogador;
import territorios.Territorios;

public abstract class Estado {

    public void atacar(Territorios inimigo) {
        
    }
    
    public void atacar(Jogador jogador, Territorios de, Territorios para) {
        
    }
    
    public void desconnectar() {
        
    }
    
    public void finalizarEtapa(Jogador jogador) {
        Estados.proximaFase(jogador);
    }
    
    public abstract Estados getEstado();
    
    public Estados.Jogando getEtapa() {
        return getEstado().getEtapa();
    }

    public void setEstado(Estados estado) {
        
    }
    
}
