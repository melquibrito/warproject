package jogadores.estado;

import jogadores.Jogador;

public class Morto extends Estado {

    private final Jogador creditos;

    public Morto(Jogador creditos) {
        this.creditos = creditos;
    }

    @Override
    public Estados getEstado() {
        return Estados.MORTO;
    }

    public Jogador getCreditos() {
        return creditos;
    }

}
