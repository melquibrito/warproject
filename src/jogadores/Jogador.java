package jogadores;

import java.util.ArrayList;
import java.util.Arrays;
import territorios.Territorio;

public final class Jogador {
    
    public enum Estados {
        AGUARDANDO_A_VEZ,
        NA_VEZ,
        DESCONECTADO;
        
    }
    
    private Estado estado;
    private String nome;
    private int exercitos;
    private int avioes;
    private final ArrayList<Territorio> territoriosOcupados = new ArrayList();
    
    public void sairDaPartida() {
        Estado.desconectar(this);
    }
    
    protected void mudarEstado(Estados estado) {
        switch(estado){
            case NA_VEZ:
                this.estado = NaVez.getInstance();
                break;
            case AGUARDANDO_A_VEZ:
                this.estado = AguardandoAVez.getInstance();
                break;
            default:
        }
        
    }

    public Estado getEstado() {
        return estado;
    }

    public ArrayList<Territorio> getTerritoriosOcupados() {
        return new ArrayList(Arrays.asList(territoriosOcupados));
    }
    
}
