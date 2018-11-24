package jogadores;

import java.util.ArrayList;
import java.util.Arrays;
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
    
    public void mudarEstado(Estados estado) {
        this.estado = estado;
    }

    public Estados getEstado() {
        return estado;
    }

    public ArrayList<Territorio> getTerritoriosOcupados() {
        return new ArrayList(Arrays.asList(territoriosOcupados));
    }
    
}
