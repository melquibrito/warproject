package batalha;

import java.util.Random;
import jogadores.Jogador;
import territorios.Territorios;

public final class AtaqueAereo implements Ataque {

    @Override
    public void jogar(Jogador jogador, Territorios de, Territorios para) {
        if (!para.getOcupante().equals(jogador) && jogador.getAvioes() > 0) {
            int[] perdas = calcularPerdas();
            
            jogador.diminuirAvioes(perdas[0]);
            if(perdas[0] < 3) {
                int resultado = para.getTropas() - perdas[1];
                if(resultado > 0) {
                    para.diminuirTropas(jogador, resultado);
                }else {
                    if(para.getTropas() > 1){
                        do{
                            para.diminuirTropas(jogador, 1);
                        }while(para.getTropas() != 1);
                    }
                }
            }
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
