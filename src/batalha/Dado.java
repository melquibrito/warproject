package batalha;

import jogadores.Jogador;
import territorios.Territorios;

public interface Dado {
    public abstract void jogar(Jogador jogador, Territorios de, Territorios para);
}
