package jogadores.estado;

import jogadores.Jogador;
import territorios.Territorios;

public abstract class Estado {

    public void atacar(Territorios inimigo) {
        
    }
    
    public void atacar(Territorios de, Territorios para) {
        
    }
    
    public void desconnectar() {
        
    }
    
    public void finalizarEtapa(Jogador jogador) {
        if(jogador.getEstado() instanceof Jogando) {
            /*switch(jogador.getEstado().getEtapa()){
                case DISTRIBUINDO_TROPAS:
                    Estados.proximaFase(jogador.getEstado().getEstado());
                    break;
                case ATACANDO:
                    break;
                case DESLOCANDO_TROPAS:
                    
            }*/
        }
    }
    
    public abstract Estados getEstado();
    
    public Estados.Jogando getEtapa() {
        return getEstado().getEtapa();
    }

    public void setEstado(Estados estado) {
        
    }
    
}
