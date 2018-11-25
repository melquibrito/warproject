package jogadores.estado;

import jogadores.Jogador;

public enum Estados {
    MORTO(Jogando.FALSO, "Fora da partida"),
    AGUARDANDO_A_VEZ(Jogando.FALSO, "Aguardando a vez"),
    NA_VEZ(Jogando.DISTRIBUINDO_TROPAS, "Jogando"),
    DESCONECTADO(Jogando.FALSO, "Desconectado");
    
    public enum Jogando {
        FALSO(""),
        DISTRIBUINDO_TROPAS("Distribuindo tropas"),
        ATACANDO("Atacando"),
        DESLOCANDO_TROPAS("Deslocando tropas");
        
        private final String etapa;
        
        private Jogando(String etapa) {
            this.etapa = etapa;
        }
        
        @Override
        public String toString() {
            return etapa;
        }
    }
    
    private final String estado;
    private Jogando etapa;
    
    private Estados(Jogando etapa, String estado) {
        this.etapa = etapa;
        this.estado = estado;
    }
    
    protected static void proximaFase(Jogador jogador) {
        if(jogador.getEstado().getEstado() == Estados.NA_VEZ) {
            switch(jogador.getEstado().getEstado().getEtapa()){
                case DISTRIBUINDO_TROPAS:
                    jogador.getEstado().getEstado().etapa = Jogando.ATACANDO;
                    break;
                case ATACANDO:
                    jogador.getEstado().getEstado().etapa = Jogando.DESLOCANDO_TROPAS;
                    break;
                default:
                    jogador.getEstado().getEstado().etapa = Jogando.FALSO;
            }
        }
    }
    
    public Jogando getEtapa() {
        return etapa;
    }
    
    @Override
    public String toString() {
        return estado;
    }
    
}
