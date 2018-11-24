package batalha;

import java.util.ArrayList;
import java.util.Random;

public class AtaqueAereo implements Ataque {

    @Override
    public ArrayList<ArrayList<Integer>> getDados(int dadosOfensivos, int dadosDefensivos) {
        if((dadosOfensivos < 1 || dadosOfensivos > 3) || (dadosDefensivos < 1 || dadosDefensivos > 3)){
            return null;
        }else {
            Random rand = new Random();
            ArrayList<Integer> ofensivos = new ArrayList();
            ArrayList<Integer> defensivos = new ArrayList();
            
            int r = rand.nextInt(6) + 1;
            if(r < 4){
                ofensivos.add(r);
            }else {
                ofensivos.add(0);
            }
            
            r = rand.nextInt(6) + 1;
            if(r < 4){
                ofensivos.add(r);
            }else {
                ofensivos.add(0);
            }
            
            ArrayList<ArrayList<Integer>> lista = new ArrayList();
            lista.add(ofensivos);
            lista.add(defensivos);
            return lista;
        }
        
    }
    
}
