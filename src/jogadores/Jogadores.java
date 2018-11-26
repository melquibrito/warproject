package jogadores;

import partida.Partida;

public enum Jogadores {
    AMARELO(Amarelo.getInstance()),
    AZUL(Azul.getInstance()),
    PRETO(Preto.getInstance()),
    ROXO(Roxo.getInstance()),
    VERDE(Verde.getInstance()),
    VERMELHO(Vermelho.getInstance());

    private final Jogador jogador;

    private Jogadores(Jogador jogador) {
        this.jogador = jogador;
    }

    public Jogador getJogador() {
        return jogador;
    }
    
    @Override
    public String toString() {
        if(this.jogador.getNick() != null) {
            return this.jogador.getNick() + "(" + this.jogador + ")";
        }
        return this.jogador.toString();
    }
    
    public void setPartida(Partida partida) {
        this.getJogador().setPartida(partida);
    }

}
