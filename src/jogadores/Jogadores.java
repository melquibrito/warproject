package jogadores;

public enum Jogadores {
    AMARELO     (Amarelo.getInstance()),
    AZUL        (Azul.getInstance()),
    PRETO       (Preto.getInstance()),
    ROXO        (Roxo.getInstance()),
    VERDE       (Verde.getInstance()),
    VERMELHO    (Vermelho.getInstance());
    
    private final Jogador jogador;
    
    private Jogadores(Jogador jogador) {
        this.jogador = jogador;
    }
    
    public Jogador getJogador() {
        return jogador;
    }
    
    @Override
    public String toString() {
        return this.getJogador().getNick();
    }
    
}
