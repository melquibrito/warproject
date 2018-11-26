package jogadores.estado;

import jogadores.Jogador;
import territorios.Territorios;

public class Jogando extends Estado {

    @Override
    public void atacar(Jogador jogador, Territorios de, Territorios para) {
        if(jogador != null && de != null && para != null){
            if (de.getOcupante() != null && de.vizinho(para) && jogador.equals(de.getOcupante())) {
                jogador.getAtaque().jogar(jogador, de, para);
            }
        }
    }
    
    @Override
    public void descolarTropas(Jogador jogador, Territorios de, Territorios para) {
        if(jogador != null && de != null && para != null){
            if(jogador.getEstado().getEtapa() == Estados.Jogando.DESLOCANDO_TROPAS) {
                //
            }
        }
    }
    
    @Override
    public Estados getEstado() {
        return Estados.NA_VEZ;
    }

}
