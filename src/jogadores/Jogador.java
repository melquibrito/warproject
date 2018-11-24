package jogadores;

import java.util.ArrayList;
import partida.Estados;
import territorios.Territorio;

public final class Jogador {
    
    private Estados estado;
    private String nome;
    private int tropas;
    private int avioes;
    private final ArrayList<Territorio> territoriosOcupados = null;
    
    public void desconnectar() {
        estado = Estados.DESCONECTADO;
    }
    
    public void finalizarJogada() {
        if(estado != Estados.DESCONECTADO) {
            this.estado = Estados.AGUARDANDO_A_VEZ;
        }
    }

    public Estados getEstado() {
        return estado;
    }

    public ArrayList<Territorio> getTerritoriosOcupados() {
        return territoriosOcupados;
    }
    
}
