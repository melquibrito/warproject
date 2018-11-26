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
        if(this.getJogador().getNick() == null) {
            return this.getJogador().toString();
        }else {
            return this.getJogador().toString() + "(" + this.getJogador().getNick() + ")";
        }
    }

    public void setPartida(Partida partida) {
        this.getJogador().setPartida(partida);
    }

}
