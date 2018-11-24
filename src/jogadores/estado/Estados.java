package jogadores.estado;

public enum Estados {
    AGUARDANDO_A_VEZ(Jogando.FALSO),
    NA_VEZ(Jogando.DISTRIBUINDO_TROPAS),
    DESCONECTADO(Jogando.FALSO);
    
    public enum Jogando {
        FALSO,
        DISTRIBUINDO_TROPAS,
        ATACANDO,
        MOVENDO_TROPAS;
        
    }
    
    private Jogando etapa;
    
    private Estados(Jogando etapa) {
        this.etapa = etapa;
        
    }
    
    public void proximaFase(Estados estado) {
        if(this == Estados.NA_VEZ) {
            switch(estado.getEtapa()){
                case DISTRIBUINDO_TROPAS:
                    estado.etapa = Jogando.ATACANDO;
                    break;
                case ATACANDO:
                    estado.etapa = Jogando.MOVENDO_TROPAS;
                    break;
                default:
                     estado.etapa = Jogando.FALSO;
            }
        }
    }
    
    public Jogando getEtapa() {
        return etapa;
    }
    
    
    
    
}
