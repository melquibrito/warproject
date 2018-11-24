package territorios;

import jogadores.Jogador;

//Todas as classes que herdam desta classe são Singletons
public abstract class Territorio {
    
    private Tag tag;
    private Jogador ocupante;
    private int tropas;

    public Territorio() {
        this.tropas = 1;
        this.setTag();
    }
    
    public abstract Territorio[] getVizinhos();
    public abstract Territorio getTerritorio();
    public abstract Tag setTag();
    
    @Override
    public abstract String toString();
    
    public boolean territorioVizinho(Territorio territorio) {
        for(Territorio x : this.getVizinhos()) {
            if(x.equals(territorio)) {
               return true; 
            }
        }
        return false;
    }
    
    public void mudarOcupante(Jogador jogador) {
        if(getExercitos() == 0 && ocupante != jogador) {
            ocupante = jogador;
        }
    }
    
    public int getExercitos() {
        return tropas;
    }

    public void diminuirExercitos(Jogador jogador, int quantidade) {
        int resultado = this.tropas - quantidade;
        if(resultado > 0) {
            this.tropas -= quantidade;
        }else {
            this.tropas = 0;
        }
        mudarOcupante(jogador);
    }
    
    public void addExercitos(Jogador jogador, int quantidade) {
        if(jogador.getTerritoriosOcupados().stream().anyMatch((x) -> (x.equals(this)))){
            this.tropas += quantidade;
        }
    }

    public Tag getTag() {
        return tag;
    }

    public Jogador getOcupante() {
        return ocupante;
    }
    
}
