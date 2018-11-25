package batalha;

import java.util.Random;

public class AtaqueAereo implements Dado {

    @Override
    public int[] calcularPerdas(int dadosOfensivos, int dadosDefensivos) {
        Random rand = new Random();
        
        int r = rand.nextInt(6) + 1;
        if (r < 4) {
            dadosOfensivos = r;
        } else {
            dadosOfensivos = 0;
        }

        r = rand.nextInt(6) + 1;
        if (r < 4) {
            dadosDefensivos = r;
        } else {
            dadosDefensivos = 0;
        }
        
        //...
        return null;

    }

}
