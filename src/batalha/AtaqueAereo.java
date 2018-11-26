package batalha;

import java.util.Random;
import jogadores.Jogador;
import territorios.Territorios;

public final class AtaqueAereo implements Dado {

    @Override
    public void jogar(Jogador jogador, Territorios de, Territorios para) {
        if (!para.getOcupante().equals(jogador) && jogador.getAvioes() > 0) {
            int[] perdas = calcularPerdas();

        }
    }

    public int[] calcularPerdas() {
        Random rand = new Random();
        int[] perdas = {0, 0};

        int dado;

        for (int i = 0; i < perdas.length; i++) {
            dado = rand.nextInt(6) + 1;
            if (dado < 4) {
                perdas[i] = dado;
            } else {
                perdas[i] = 0;
            }
        }

        return perdas;
    }

}
