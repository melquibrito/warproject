package territorios;

import java.util.ArrayList;

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
        
    }
    
    private final Continente continente;
    
    private Territorios(Continente continente) {
        this.continente = continente;
    }

    public Continente getContinente() {
        return continente;
    }
    
    public static ArrayList<Territorios> totalidade(Continente continente) {
        ArrayList<Territorios> tags = new ArrayList();
        for(Territorios x : Territorios.values()) {
            if(x.getContinente() == continente) {
                tags.add(x);
            }
        }
        return tags;
    }
    
}
