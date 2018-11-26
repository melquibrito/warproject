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
        switch(jogador.getObjetivo()) {
            
        }
        return false;
    }

}
