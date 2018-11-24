package batalha;

import java.util.ArrayList;

public final class AtaqueTerrestre implements Ataque {
    
    private final static AtaqueTerrestre instance;
    
    static {
        instance = new AtaqueTerrestre();
    }
    
    private AtaqueTerrestre() {}
    
    public static AtaqueTerrestre getInstance() {
        return instance;
    }
    
    //Retornar duas listas aqui, uma com os dados do atacando e a outra com os do defensor
    @Override
    public ArrayList<Integer>[] getDados(int dadosOfensivos, int dadosDefensivos) { 
        return null;
    }
    
}
