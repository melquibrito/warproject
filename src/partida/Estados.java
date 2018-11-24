package partida;

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
    
    private Jogando fase;
    
    private Estados(Jogando fase) {
        this.fase = fase;
        
    }
    
    public void proximaFase(Estados estado) {
        if(this == Estados.NA_VEZ) {
            switch(estado.getFase()){
                case DISTRIBUINDO_TROPAS:
                    estado.fase = Jogando.ATACANDO;
                    break;
                case ATACANDO:
                    estado.fase = Jogando.MOVENDO_TROPAS;
                    break;
                default:
                     estado.fase = Jogando.FALSO;
            }
        }
    }
    
    public Jogando getFase() {
        return fase;
    }
    
    
    
    
}
