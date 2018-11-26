package jogadores.estado;

import jogadores.Jogador;
import territorios.Territorios;

public abstract class Estado {
    
    public void atacar(Jogador jogador, Territorios de, Territorios para) {
        System.out.println("Aguarde a sua vez para atacar!");
    }
    
    public void descolarTropas(Jogador jogador, Territorios de, Territorios para) {
        System.out.println("Deslocamento proibido!");
    }
    
    public void abandonarPartida(Jogador jogador) {
        jogador.atualizarEstado(Estados.DESCONECTADO, null);
        finalizarEtapa(jogador);
    }
    
    
    public void finalizarEtapa(Jogador jogador) {
        Estados.proximaFase(jogador);
    }
    
    public abstract Estados getEstado();
    
    public Estados.Jogando getEtapa() {
        return getEstado().getEtapa();
    }
    
    public Jogador getCreditos() {return null;}
    
}
