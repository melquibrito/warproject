package jogadores.estado;

public enum Estados {
    MORTO(Jogando.FALSO, "Fora da partida"),
    AGUARDANDO_A_VEZ(Jogando.FALSO, "Aguardando a vez"),
    NA_VEZ(Jogando.DISTRIBUINDO_TROPAS, "Jogando"),
    DESCONECTADO(Jogando.FALSO, "Desconectado");
    
    public enum Jogando {
        FALSO("Aguardando a vez ou desconectado"),
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
    
    public static void proximaFase(Estados estado) {
        if(estado == Estados.NA_VEZ) {
            switch(estado.getEtapa()){
                case DISTRIBUINDO_TROPAS:
                    estado.etapa = Jogando.ATACANDO;
                    break;
                case ATACANDO:
                    estado.etapa = Jogando.DESLOCANDO_TROPAS;
                    break;
                default:
                     estado.etapa = Jogando.FALSO;
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
