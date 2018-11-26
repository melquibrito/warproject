package partida.objetivos;

import jogadores.Jogador;

public enum Objetivo {
    AMERICA_DO_NORTE_E_OCEANIA,
    AMERICA_DO_NORTE_E_AFRICA,
    ASIA_E_AMERICA_DO_SUL,
    AMERICA_DO_SUL_EUROPA_E_MAIS_UM,
    AFRICA_E_ASIA,
    EUROPA_OCEANIA_E_MAIS_UM,
    DESTRUIR_AMARELO,
    DESTRUIR_AZUL,
    DESTRUIR_PRETO,
    DESTRUIR_ROXO,
    DESTRUIR_VERDE,
    DESTRUIR_VERMELHO,
    CONQUISTAR_24_TERRITORIOS,
    CONQUISTAR_18_2_EM_CADA;

    public boolean checar(Jogador jogador) {
        switch (jogador.getObjetivo()) {
            case AMERICA_DO_NORTE_E_OCEANIA:
                break;
            case AMERICA_DO_NORTE_E_AFRICA:
                break;
            case ASIA_E_AMERICA_DO_SUL:
                break;
            case AMERICA_DO_SUL_EUROPA_E_MAIS_UM:
                break;
            case AFRICA_E_ASIA:
                break;
            case EUROPA_OCEANIA_E_MAIS_UM:
                break;
            case DESTRUIR_AMARELO:
                break;
            case DESTRUIR_AZUL:
                break;
            case DESTRUIR_PRETO:
                break;
            case DESTRUIR_ROXO:
                break;
            case DESTRUIR_VERDE:
                break;
            case DESTRUIR_VERMELHO:
                break;
            case CONQUISTAR_24_TERRITORIOS:
                break;
            case CONQUISTAR_18_2_EM_CADA:
                break;
            default:
                return false;
        }
        return false;
    }

}
