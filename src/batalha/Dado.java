package batalha;

import java.util.ArrayList;
import territorios.Territorios;

public interface Dado {
    public abstract ArrayList<ArrayList<Integer>> getDados(Territorios atacando, Territorios defendendo);
}
