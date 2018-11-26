package jogadores.estado;

import jogadores.Jogador;
import territorios.Territorios;

public class Jogando extends Estado {

    @Override
    public void atacar(Jogador jogador, Territorios de, Territorios para) {
        if (de.getOcupante() != null && de.vizinho(para) && jogador.equals(de.getOcupante())) {
            de.getOcupante().getDado().jogar(jogador, de, para);
        }
    }

    @Override
    public Estados getEstado() {
        return Estados.NA_VEZ;
    }

}
