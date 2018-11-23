package jogadores;

import java.util.ArrayList;
import territorios.Territorio;

public final class Jogador {
    
    public enum estado {
        AGUARDANDO_A_VEZ,
        NA_VEZ,
        DESCONECTADO;
        
    }
    
    private Estado jogo;
    private String nome;
    private int exercitos;
    private int avioes;
    private final ArrayList<Territorio> territoriosOcupados = new ArrayList();
    
    public void sairDaPartida() {
        Estado.desconectar(this);
    }
    
    protected void mudarEstado(estado estado) {
        switch(estado){
            case NA_VEZ:
                jogo = NaVez.getInstance();
                break;
            case AGUARDANDO_A_VEZ:
                jogo = AguardandoAVez.getInstance();
                break;
            default:
        }
        
    }

    public Estado getEstado() {
        return jogo;
    }
    
    
}
