package jogadores;

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
    
    public void sairDaPartida() {
        
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
