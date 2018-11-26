package batalha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import jogadores.Jogador;
import territorios.Territorios;

public final class AtaqueTerrestre implements Ataque {

    @Override
    public void jogar(Jogador jogador, Territorios de, Territorios para) {
        if(jogador != null && de != null) {
            if (de.getOcupante() != null && de.getOcupante() != para.getOcupante()) {
                if (dados(de.getTropas(), 0) != 0 && dados(para.getTropas(), 1) != 0) {
                    int[] perdas = calcularPerdas(dados(de.getTropas(), 0), dados(para.getTropas(), 1));
                    de.diminuirTropas(jogador, perdas[0]);
                    para.diminuirTropas(jogador, perdas[1]);
                    if (para.getTropas() == 0) {
                        invadir(de, para);
                    }
                }
            }
        }
    }

    private int dados(int tropas, int x) {
        if (x == 0) {
            if (tropas > 1) {
                switch (tropas) {
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        return 3;
                }
            }
        } else {
            if (tropas > 0) {
                switch (tropas) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    default:
                        return 3;
                }
            }
        }
        return 0;
    }

    //Retornar dois inteiros: Quantidade de tropas a perder para o atacante e o defensor, respectivamente.
    public int[] calcularPerdas(int dadosOfensivos, int dadosDefensivos) {
        if ((dadosOfensivos < 1 || dadosOfensivos > 3) || (dadosDefensivos < 1 || dadosDefensivos > 3)) {
            return null;
        } else {
            Random rand = new Random();
            int[] perdas = {0, 0};

            ArrayList<Integer> ofensivos = new ArrayList();
            ArrayList<Integer> defensivos = new ArrayList();

            for (int i = 0; i < dadosOfensivos; i++) {
                ofensivos.add(rand.nextInt(6) + 1);
            }

            for (int i = 0; i < dadosDefensivos; i++) {
                defensivos.add(rand.nextInt(6) + 1);
            }

            Collections.sort(ofensivos);
            Collections.sort(defensivos);
            Collections.reverse(ofensivos);
            Collections.reverse(defensivos);

            int batalhas;

            if (ofensivos.size() > defensivos.size()) {
                batalhas = defensivos.size();
            } else {
                batalhas = ofensivos.size();
            }

            for (int i = 0; i < batalhas; i++) {
                if (Objects.equals(ofensivos.get(i), defensivos.get(i))) {
                    perdas[0]++;
                } else if (ofensivos.get(i) < defensivos.get(i)) {
                    perdas[0]++;
                } else {
                    perdas[1]++;
                }
            }

            return perdas;
        }
    }

    private void invadir(Territorios de, Territorios para) {
        de.moverTropas(1, para);
    }

    public void invadirCom(int x, Territorios de, Territorios para) {
        de.moverTropas(x, para);
    }
}
