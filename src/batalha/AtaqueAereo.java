package batalha;

import java.util.ArrayList;

public class AtaqueAereo implements Ataque {

    private final static AtaqueAereo instance;
    
    static {
        instance = new AtaqueAereo();
    }
    
    private AtaqueAereo() {}
    
    public static AtaqueAereo getInstance() {
        return instance;
    }
    
    //Retornar duas listas aqui, uma com os dados ofensivos e a outra com os defensivos
    @Override
    public ArrayList<Integer>[] getDados(int dadosOfensivos, int dadosDefensivos) {
        return null;
    }
    
}
