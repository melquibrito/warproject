package partida;

public enum Estados {
    AGUARDANDO_A_VEZ(Jogando.FALSO),
    NA_VEZ(Jogando.DISTRIBUINDO_TROPAS),
    DEFENDENDO(Jogando.FALSO),
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
    
    public void mudarFase(Jogando fase) {
        if(this == Estados.NA_VEZ) {
            switch(fase){
                case ATACANDO:
                    if(this.fase == Jogando.DISTRIBUINDO_TROPAS) {
                        this.fase = Jogando.ATACANDO;
                    }
                    break;
                case MOVENDO_TROPAS:
                    if(this.fase == Jogando.ATACANDO) {
                        this.fase = Jogando.MOVENDO_TROPAS;
                    }
            }
        }
    }
    
    
    
    
}
