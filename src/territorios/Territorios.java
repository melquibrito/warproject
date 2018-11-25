package territorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jogadores.Jogador;

public enum Territorios {
    
    //America do Norte
    ALASKA(Continente.AMERICA_DO_NORTE), 
    MACKENZIE(Continente.AMERICA_DO_NORTE), 
    GROELANDIA(Continente.AMERICA_DO_NORTE), 
    VANCOUVER(Continente.AMERICA_DO_NORTE), 
    OTTAWA(Continente.AMERICA_DO_NORTE), 
    LABRADOR(Continente.AMERICA_DO_NORTE), 
    CALIFORNIA(Continente.AMERICA_DO_NORTE), 
    NOVA_YORK(Continente.AMERICA_DO_NORTE), 
    MEXICO(Continente.AMERICA_DO_NORTE),
    
    //America do Sul
    VENEZUELA(Continente.AMERICA_DO_SUL), 
    BRASIL(Continente.AMERICA_DO_SUL), 
    PERU(Continente.AMERICA_DO_SUL), 
    ARGENTINA(Continente.AMERICA_DO_SUL),
    
    //Europa
    ISLANDIA(Continente.EUROPA), 
    INGLATERRA(Continente.EUROPA), 
    SUECIA(Continente.EUROPA), 
    MOSCOU(Continente.EUROPA), 
    FRANCA(Continente.EUROPA), 
    ALEMANHA(Continente.EUROPA), 
    POLONIA(Continente.EUROPA),
    
    //Africa
    ARGELIA(Continente.AFRICA), 
    EGITO(Continente.AFRICA), 
    CONGO(Continente.AFRICA), 
    SUDAO(Continente.AFRICA), 
    AFRICA_DO_SUL(Continente.AFRICA), 
    MADAGASCAR(Continente.AFRICA),
    
    //Asia
    ONSK(Continente.ASIA), 
    DUDINKA(Continente.ASIA), 
    TCHITA(Continente.ASIA), 
    SIBERIA(Continente.ASIA), 
    VLADVOSTOK(Continente.ASIA), 
    ORIENTE_MEDIO(Continente.ASIA), 
    ARAL(Continente.ASIA), 
    INDIA(Continente.ASIA), 
    CHINA(Continente.ASIA), 
    VIETNAM(Continente.ASIA), 
    JAPAO(Continente.ASIA),
    
    //Oceania
    SUMATRA(Continente.OCEANIA), 
    BORNEO(Continente.OCEANIA), 
    NOVA_GUINE(Continente.OCEANIA), 
    AUSTRALIA(Continente.OCEANIA);
    
    public enum Continente {
        AFRICA, 
        AMERICA_DO_NORTE, 
        AMERICA_DO_SUL, 
        ASIA, 
        EUROPA, 
        OCEANIA;
        
        public List<Territorios> getTerritorios() {
            ArrayList<Territorios> totalidade = new ArrayList();
            for(Territorios x : Territorios.values()) {
                if(x.getContinente() == this) {
                    totalidade.add(x);
                }
            }
            return Collections.unmodifiableList(totalidade);
        }
        
    }
    
    private Jogador ocupante;
    private int tropas;
    private final Continente continente;
    
    private Territorios(Continente continente) {
        this.continente = continente;
        this.tropas = 1;
    }

    public Continente getContinente() {
        return continente;
    }
    
    public static boolean totalidade(Jogador jogador, Continente continente) {
        return continente.getTerritorios().stream().allMatch((x) -> (x.getOcupante() == jogador));
    }
    
    public boolean territorioVizinho(Territorios territorio) {
        return this.getVizinhos().stream().anyMatch((x) -> (x.equals(territorio)));
    }

    public Jogador getOcupante() {
        return ocupante;
    }
    
    public void mudarOcupante(Jogador jogador) {
        if(getTropas() == 0 && ocupante != jogador) {
            ocupante = jogador;
        }
    }
    
    public void diminuirTropas(Jogador jogador, int quantidade) {
        int resultado = this.tropas - quantidade;
        if(resultado > 0) {
            this.tropas -= quantidade;
        }else {
            this.tropas = 0;
        }
        mudarOcupante(jogador);
    }
    
    public void addTropas(int quantidade) {
        tropas += quantidade;
        /*if(jogador.getTerritoriosOcupados().stream().anyMatch((x) -> (x.equals(this)))){
            this.tropas += quantidade;
        }*/
    }

    public int getTropas() {
        return tropas;
    }
    
    public List<Territorios> getVizinhos() {
        List<Territorios> vizinhos = new ArrayList();
        switch(this){
            case ALASKA:
                break;
            case MACKENZIE:
                break;
            case GROELANDIA:
                break;
            case VANCOUVER:
                break;
            case OTTAWA:
                break;
            case LABRADOR:
                break;
            case CALIFORNIA:
                break;
            case NOVA_YORK:
                break;
            case MEXICO:
                break;
            case VENEZUELA:
                break;
            case BRASIL:
                break;
            case PERU:
                break;
            case ARGENTINA:
                break;
            case ISLANDIA:
                break;
            case INGLATERRA:
                break;
            case SUECIA:
                break;
            case MOSCOU:
                break;
            case FRANCA:
                vizinhos.add(Territorios.INGLATERRA);
                vizinhos.add(Territorios.ALEMANHA);
                vizinhos.add(Territorios.POLONIA);
                vizinhos.add(Territorios.ARGELIA);
                vizinhos.add(Territorios.EGITO);
                break;
            case ALEMANHA:
                vizinhos.add(Territorios.INGLATERRA);
                vizinhos.add(Territorios.FRANCA);
                vizinhos.add(Territorios.POLONIA);
                break;
            case POLONIA:
                break;
            case ARGELIA:
                break;
            case EGITO:
                break;
            case CONGO:
                break;
            case SUDAO:
                break;
            case AFRICA_DO_SUL:
                break;
            case MADAGASCAR:
                break;
            case ONSK:
                break;
            case DUDINKA:
                break;
            case TCHITA:
                break;
            case SIBERIA:
                break;
            case VLADVOSTOK:
                break;
            case ORIENTE_MEDIO:
                break;
            case ARAL:
                break;
            case INDIA:
                break;
            case CHINA:
                break;
            case VIETNAM:
                break;
            case JAPAO:
                break;
            case SUMATRA:
                break;
            case BORNEO:
                break;
            case NOVA_GUINE:
                break;
            case AUSTRALIA:
                break;
                
        }
        
        return Collections.unmodifiableList(vizinhos);
    }
    
}
