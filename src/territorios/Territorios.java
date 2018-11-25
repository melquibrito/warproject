package territorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jogadores.Jogador;

public enum Territorios {
    
    //America do Norte
    ALASKA          (Continente.AMERICA_DO_NORTE), 
    MACKENZIE       (Continente.AMERICA_DO_NORTE), 
    GROELANDIA      (Continente.AMERICA_DO_NORTE), 
    VANCOUVER       (Continente.AMERICA_DO_NORTE), 
    OTTAWA          (Continente.AMERICA_DO_NORTE), 
    LABRADOR        (Continente.AMERICA_DO_NORTE), 
    CALIFORNIA      (Continente.AMERICA_DO_NORTE), 
    NOVA_YORK       (Continente.AMERICA_DO_NORTE), 
    MEXICO          (Continente.AMERICA_DO_NORTE),
    
    //America do Sul
    VENEZUELA       (Continente.AMERICA_DO_SUL), 
    BRASIL          (Continente.AMERICA_DO_SUL), 
    PERU            (Continente.AMERICA_DO_SUL), 
    ARGENTINA       (Continente.AMERICA_DO_SUL),
    
    //Europa
    ISLANDIA        (Continente.EUROPA), 
    INGLATERRA      (Continente.EUROPA), 
    SUECIA          (Continente.EUROPA), 
    MOSCOU          (Continente.EUROPA), 
    FRANCA          (Continente.EUROPA), 
    ALEMANHA        (Continente.EUROPA), 
    POLONIA         (Continente.EUROPA),
    
    //Africa
    ARGELIA         (Continente.AFRICA), 
    EGITO           (Continente.AFRICA), 
    CONGO           (Continente.AFRICA), 
    SUDAO           (Continente.AFRICA), 
    AFRICA_DO_SUL   (Continente.AFRICA), 
    MADAGASCAR      (Continente.AFRICA),
    
    //Asia
    OMSK            (Continente.ASIA), 
    DUDINKA         (Continente.ASIA),
    MONGOLIA        (Continente.ASIA),
    TCHITA          (Continente.ASIA), 
    SIBERIA         (Continente.ASIA), 
    VLADVOSTOK      (Continente.ASIA), 
    ORIENTE_MEDIO   (Continente.ASIA), 
    ARAL            (Continente.ASIA), 
    INDIA           (Continente.ASIA), 
    CHINA           (Continente.ASIA), 
    VIETNAM         (Continente.ASIA), 
    JAPAO           (Continente.ASIA),
    
    //Oceania
    SUMATRA         (Continente.OCEANIA), 
    BORNEO          (Continente.OCEANIA), 
    NOVA_GUINE      (Continente.OCEANIA), 
    AUSTRALIA       (Continente.OCEANIA);
    
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
                vizinhos.add(Territorios.VLADVOSTOK);
                vizinhos.add(Territorios.MACKENZIE);
                vizinhos.add(Territorios.VANCOUVER);
                break;
            case MACKENZIE:
                vizinhos.add(Territorios.ALASKA);
                vizinhos.add(Territorios.VANCOUVER);
                vizinhos.add(Territorios.OTTAWA);
                vizinhos.add(Territorios.GROELANDIA);
                break;
            case GROELANDIA:
                vizinhos.add(Territorios.MACKENZIE);
                vizinhos.add(Territorios.LABRADOR);
                vizinhos.add(Territorios.ISLANDIA);
                break;
            case VANCOUVER:
                vizinhos.add(Territorios.ALASKA);
                vizinhos.add(Territorios.MACKENZIE);
                vizinhos.add(Territorios.OTTAWA);
                vizinhos.add(Territorios.CALIFORNIA);
                break;
            case OTTAWA:
                vizinhos.add(Territorios.MACKENZIE);
                vizinhos.add(Territorios.VANCOUVER);
                vizinhos.add(Territorios.CALIFORNIA);
                vizinhos.add(Territorios.NOVA_YORK);
                vizinhos.add(Territorios.LABRADOR);
                break;
            case LABRADOR:
                vizinhos.add(Territorios.GROELANDIA);
                vizinhos.add(Territorios.OTTAWA);
                vizinhos.add(Territorios.NOVA_YORK);
                break;
            case CALIFORNIA:
                vizinhos.add(Territorios.VANCOUVER);
                vizinhos.add(Territorios.OTTAWA);
                vizinhos.add(Territorios.NOVA_YORK);
                vizinhos.add(Territorios.MEXICO);
                break;
            case NOVA_YORK:
                vizinhos.add(Territorios.LABRADOR);
                vizinhos.add(Territorios.OTTAWA);
                vizinhos.add(Territorios.CALIFORNIA);
                vizinhos.add(Territorios.MEXICO);
                break;
            case MEXICO:
                vizinhos.add(Territorios.CALIFORNIA);
                vizinhos.add(Territorios.NOVA_YORK);
                vizinhos.add(Territorios.VENEZUELA);
                break;
            case VENEZUELA:
                vizinhos.add(Territorios.MEXICO);
                vizinhos.add(Territorios.PERU);
                vizinhos.add(Territorios.BRASIL);
                break;
            case BRASIL:
                vizinhos.add(Territorios.VENEZUELA);
                vizinhos.add(Territorios.PERU);
                vizinhos.add(Territorios.ARGENTINA);
                vizinhos.add(Territorios.ARGELIA);
                break;
            case PERU:
                vizinhos.add(Territorios.VENEZUELA);
                vizinhos.add(Territorios.BRASIL);
                vizinhos.add(Territorios.ARGENTINA);
                break;
            case ARGENTINA:
                vizinhos.add(Territorios.PERU);
                vizinhos.add(Territorios.BRASIL);
                break;
            case ISLANDIA:
                vizinhos.add(Territorios.GROELANDIA);
                vizinhos.add(Territorios.INGLATERRA);
                break;
            case INGLATERRA:
                vizinhos.add(Territorios.ISLANDIA);
                vizinhos.add(Territorios.SUECIA);
                vizinhos.add(Territorios.ALEMANHA);
                vizinhos.add(Territorios.FRANCA);
                break;
            case SUECIA:
                vizinhos.add(Territorios.INGLATERRA);
                vizinhos.add(Territorios.MOSCOU);
                break;
            case MOSCOU:
                vizinhos.add(Territorios.SUECIA);
                vizinhos.add(Territorios.POLONIA);
                vizinhos.add(Territorios.ORIENTE_MEDIO);
                vizinhos.add(Territorios.ARAL);
                vizinhos.add(Territorios.OMSK);
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
                vizinhos.add(Territorios.ALEMANHA);
                vizinhos.add(Territorios.FRANCA);
                vizinhos.add(Territorios.EGITO);
                vizinhos.add(Territorios.ORIENTE_MEDIO);
                vizinhos.add(Territorios.MOSCOU);
                break;
            case ARGELIA:
                vizinhos.add(Territorios.FRANCA);
                vizinhos.add(Territorios.BRASIL);
                vizinhos.add(Territorios.CONGO);
                vizinhos.add(Territorios.SUDAO);
                vizinhos.add(Territorios.EGITO);
                break;
            case EGITO:
                vizinhos.add(Territorios.POLONIA);
                vizinhos.add(Territorios.FRANCA);
                vizinhos.add(Territorios.ARGELIA);
                vizinhos.add(Territorios.SUDAO);
                vizinhos.add(Territorios.ORIENTE_MEDIO);
                break;
            case CONGO:
                vizinhos.add(Territorios.ARGELIA);
                vizinhos.add(Territorios.AFRICA_DO_SUL);
                vizinhos.add(Territorios.SUDAO);
                break;
            case SUDAO:
                vizinhos.add(Territorios.EGITO);
                vizinhos.add(Territorios.ARGELIA);
                vizinhos.add(Territorios.CONGO);
                vizinhos.add(Territorios.AFRICA_DO_SUL);
                vizinhos.add(Territorios.MADAGASCAR);
                break;
            case AFRICA_DO_SUL:
                vizinhos.add(Territorios.CONGO);
                vizinhos.add(Territorios.SUDAO);
                vizinhos.add(Territorios.MADAGASCAR);
                break;
            case MADAGASCAR:
                vizinhos.add(Territorios.AFRICA_DO_SUL);
                vizinhos.add(Territorios.SUDAO);
                break;
            case OMSK:
                vizinhos.add(Territorios.MOSCOU);
                vizinhos.add(Territorios.ARAL);
                vizinhos.add(Territorios.CHINA);
                vizinhos.add(Territorios.MONGOLIA);
                vizinhos.add(Territorios.DUDINKA);
                break;
            case DUDINKA:
                vizinhos.add(Territorios.OMSK);
                vizinhos.add(Territorios.MONGOLIA);
                vizinhos.add(Territorios.TCHITA);
                vizinhos.add(Territorios.SIBERIA);
                break;
            case MONGOLIA:
                vizinhos.add(Territorios.DUDINKA);
                vizinhos.add(Territorios.OMSK);
                vizinhos.add(Territorios.CHINA);
                vizinhos.add(Territorios.TCHITA);
                break;
            case TCHITA:
                vizinhos.add(Territorios.SIBERIA);
                vizinhos.add(Territorios.DUDINKA);
                vizinhos.add(Territorios.MONGOLIA);
                vizinhos.add(Territorios.CHINA);
                vizinhos.add(Territorios.VLADVOSTOK);
                break;
            case SIBERIA:
                vizinhos.add(Territorios.DUDINKA);
                vizinhos.add(Territorios.TCHITA);
                vizinhos.add(Territorios.VLADVOSTOK);
                break;
            case VLADVOSTOK:
                vizinhos.add(Territorios.SIBERIA);
                vizinhos.add(Territorios.TCHITA);
                vizinhos.add(Territorios.CHINA);
                vizinhos.add(Territorios.JAPAO);
                vizinhos.add(Territorios.ALASKA);
                break;
            case ORIENTE_MEDIO:
                vizinhos.add(Territorios.MOSCOU);
                vizinhos.add(Territorios.POLONIA);
                vizinhos.add(Territorios.EGITO);
                vizinhos.add(Territorios.INDIA);
                vizinhos.add(Territorios.ARAL);
                break;
            case ARAL:
                vizinhos.add(Territorios.OMSK);
                vizinhos.add(Territorios.MOSCOU);
                vizinhos.add(Territorios.ORIENTE_MEDIO);
                vizinhos.add(Territorios.INDIA);
                vizinhos.add(Territorios.CHINA);
                break;
            case INDIA:
                vizinhos.add(Territorios.ARAL);
                vizinhos.add(Territorios.ORIENTE_MEDIO);
                vizinhos.add(Territorios.SUMATRA);
                vizinhos.add(Territorios.VIETNAM);
                vizinhos.add(Territorios.CHINA);
                break;
            case CHINA:
                vizinhos.add(Territorios.MONGOLIA);
                vizinhos.add(Territorios.OMSK);
                vizinhos.add(Territorios.ARAL);
                vizinhos.add(Territorios.INDIA);
                vizinhos.add(Territorios.VIETNAM);
                vizinhos.add(Territorios.JAPAO);
                vizinhos.add(Territorios.VLADVOSTOK);
                vizinhos.add(Territorios.TCHITA);
                break;
            case VIETNAM:
                vizinhos.add(Territorios.CHINA);
                vizinhos.add(Territorios.INDIA);
                vizinhos.add(Territorios.BORNEO);
                break;
            case JAPAO:
                vizinhos.add(Territorios.CHINA);
                vizinhos.add(Territorios.VLADVOSTOK);
                break;
            case SUMATRA:
                vizinhos.add(Territorios.INDIA);
                vizinhos.add(Territorios.AUSTRALIA);
                break;
            case BORNEO:
                vizinhos.add(Territorios.VIETNAM);
                vizinhos.add(Territorios.AUSTRALIA);
                vizinhos.add(Territorios.NOVA_GUINE);
                break;
            case NOVA_GUINE:
                vizinhos.add(Territorios.BORNEO);
                vizinhos.add(Territorios.AUSTRALIA);
                break;
            case AUSTRALIA:
                vizinhos.add(Territorios.SUMATRA);
                vizinhos.add(Territorios.BORNEO);
                vizinhos.add(Territorios.NOVA_GUINE);
                
        }
        
        return Collections.unmodifiableList(vizinhos);
    }
    
}
