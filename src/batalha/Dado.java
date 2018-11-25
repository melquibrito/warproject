package batalha;

import territorios.Territorios;

public interface Dado {
    public abstract void jogar(Territorios de, Territorios para);
    public int[] calcularPerdas(int dadosOfensivos, int dadosDefensivos);
}
