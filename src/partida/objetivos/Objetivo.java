package partida.objetivos;

import java.util.ArrayList;
import java.util.Arrays;
import jogadores.Jogador;
import territorios.Territorios;
import territorios.Territorios.Continente;
import jogadores.Jogadores;
import jogadores.estado.Morto;

public enum Objetivo {
    AMERICA_DO_NORTE_E_OCEANIA,
    AMERICA_DO_NORTE_E_AFRICA,
    ASIA_E_AMERICA_DO_SUL,
    AMERICA_DO_SUL_EUROPA_E_MAIS_UM,
    AFRICA_E_ASIA,
    EUROPA_OCEANIA_E_MAIS_UM,
    DESTRUIR_AMARELO(Jogadores.AMARELO),
    DESTRUIR_AZUL(Jogadores.AZUL),
    DESTRUIR_PRETO(Jogadores.PRETO),
    DESTRUIR_ROXO(Jogadores.ROXO),
    DESTRUIR_VERDE(Jogadores.VERDE),
    DESTRUIR_VERMELHO(Jogadores.VERMELHO),
    CONQUISTAR_24_TERRITORIOS,
    CONQUISTAR_18_2_EM_CADA;

    private Jogadores inimigo = null;
    
    private Objetivo(Jogadores jogador) {
        this.inimigo = jogador;
    }
    
    private Objetivo() {
        
    }
    
    public Jogadores getInimigo() {
        return inimigo;
    }
    
    public static ArrayList<Objetivo> getObjetivosDeDestruirOponentes () {
        ArrayList<Objetivo> lista = new ArrayList();
        lista.add(DESTRUIR_AMARELO);
        lista.add(DESTRUIR_AZUL);
        lista.add(DESTRUIR_PRETO);
        lista.add(DESTRUIR_ROXO);
        lista.add(DESTRUIR_VERDE);
        lista.add(DESTRUIR_VERMELHO);
        return lista;
    }
    
    public static ArrayList<Objetivo> getTodosExcetoOsDeDestruir () {
        ArrayList<Objetivo> lista = new ArrayList();
        lista.add(AMERICA_DO_NORTE_E_OCEANIA);
        lista.add(AMERICA_DO_NORTE_E_AFRICA);
        lista.add(ASIA_E_AMERICA_DO_SUL);
        lista.add(AMERICA_DO_SUL_EUROPA_E_MAIS_UM);
        lista.add(AFRICA_E_ASIA);
        lista.add(EUROPA_OCEANIA_E_MAIS_UM);
        lista.add(CONQUISTAR_24_TERRITORIOS);
        lista.add(CONQUISTAR_18_2_EM_CADA);
        return lista;
    }
    
    public static boolean checar(Jogador jogador) {
        switch (jogador.getObjetivo()) {
            case AMERICA_DO_NORTE_E_OCEANIA:
                return checarDoisContinentes(jogador, Territorios.Continente.AMERICA_DO_NORTE, Territorios.Continente.OCEANIA);
            case AMERICA_DO_NORTE_E_AFRICA:
                return checarDoisContinentes(jogador, Territorios.Continente.AMERICA_DO_NORTE, Territorios.Continente.AFRICA);
            case ASIA_E_AMERICA_DO_SUL:
                return checarDoisContinentes(jogador, Territorios.Continente.ASIA, Territorios.Continente.AMERICA_DO_SUL);
            case AMERICA_DO_SUL_EUROPA_E_MAIS_UM:
                return checarTresContinentes(jogador, Territorios.Continente.AMERICA_DO_SUL, Territorios.Continente.EUROPA);
            case AFRICA_E_ASIA:
                return checarDoisContinentes(jogador, Territorios.Continente.AFRICA, Territorios.Continente.ASIA);
            case EUROPA_OCEANIA_E_MAIS_UM:
                return checarTresContinentes(jogador, Territorios.Continente.EUROPA, Territorios.Continente.OCEANIA);
            case DESTRUIR_AMARELO:
                return checarCreditos(jogador, Jogadores.AMARELO);
            case DESTRUIR_AZUL:
                return checarCreditos(jogador, Jogadores.AZUL);
            case DESTRUIR_PRETO:
                return checarCreditos(jogador, Jogadores.PRETO);
            case DESTRUIR_ROXO:
                return checarCreditos(jogador, Jogadores.ROXO);
            case DESTRUIR_VERDE:
                return checarCreditos(jogador, Jogadores.VERDE);
            case DESTRUIR_VERMELHO:
                return checarCreditos(jogador, Jogadores.VERMELHO);
            case CONQUISTAR_24_TERRITORIOS:
                return (Territorios.ocupando(jogador) >= 24);
            case CONQUISTAR_18_2_EM_CADA:
                return (Territorios.ocupandoComMaisDeUmaTropa(jogador) >= 18);
            default:
                return false;
        }
    }

    public static boolean checarDoisContinentes(Jogador jogador, Territorios.Continente c1, Territorios.Continente c2) {
        return Territorios.totalidade(jogador, c1) && (Territorios.totalidade(jogador, c2));
    }

    public static boolean checarTresContinentes(Jogador jogador, Territorios.Continente c1, Territorios.Continente c2) {
        ArrayList<Continente> continentes = new ArrayList();
        continentes.addAll(Arrays.asList(Continente.values()));
        continentes.remove(c1);
        continentes.remove(c2);
        
        if (Territorios.totalidade(jogador, c1)) {
            if (Territorios.totalidade(jogador, c2)) {
                if (Territorios.totalidade(jogador, continentes.get(0))
                        || Territorios.totalidade(jogador, continentes.get(1))
                        || Territorios.totalidade(jogador, continentes.get(2))
                        || Territorios.totalidade(jogador, continentes.get(3))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checarCreditos(Jogador jogador, Jogadores cor) {
        if(cor.getJogador().getEstado() instanceof Morto){
            return jogador.equals(cor.getJogador().getEstado().getCreditos());
        }
        return false;
    }
}
