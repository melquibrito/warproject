package batalha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public final class AtaqueTerrestre implements Dado {
    
    @Override
    public int[] calcularPerdas(int dadosOfensivos, int dadosDefensivos) {
        if((dadosOfensivos < 1 || dadosOfensivos > 3) || (dadosDefensivos < 1 || dadosDefensivos > 3)){
            return null;
        }else {
            Random rand = new Random();
            ArrayList<Integer> ofensivos = new ArrayList();
            ArrayList<Integer> defensivos = new ArrayList();
            
            for(int i = 0; i < dadosOfensivos; i++) {
                ofensivos.add(rand.nextInt(6) + 1);
            }
            
            for(int i = 0; i < dadosDefensivos; i++) {
                defensivos.add(rand.nextInt(6) + 1);
            }
            
            Collections.sort(ofensivos);
            Collections.sort(defensivos);
            Collections.reverse(ofensivos);
            Collections.reverse(defensivos);
            
            ArrayList<ArrayList<Integer>> lista = new ArrayList();
            lista.add(ofensivos);
            lista.add(defensivos);
            
            //...
            return null;
        }
    }
    
}
