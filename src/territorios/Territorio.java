package territorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import jogadores.Jogador;

//Todas as classes que herdam desta classe são Singletons
public abstract class Territorio {
    private static final HashSet<Territorio> territorios = new HashSet();
    
    private Jogador ocupante;
    private int exercitos;

    public Territorio() {
        this.exercitos = 1;
        add(this.getTerritorio());
    }
    
    public abstract Territorio[] getVizinhos();
    public abstract Territorio getTerritorio();
    
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
        return exercitos;
    }

    public void setExercitos(int exercitos) {
        this.exercitos = exercitos;
    }
    
    public static void add(Territorio territorio) {
        if(!territorios.isEmpty()) {
            if(territorios.stream().noneMatch((x) -> (x == territorio))) {
                territorios.add(territorio);
            }
        }else{
            territorios.add(territorio);
        }
    }
    
    public static ArrayList<Territorio> getTerritorios() {
        ArrayList<Territorio> lista;
        lista = new ArrayList(Arrays.asList(territorios));
        lista.sort(Comparator.comparing(Territorio::toString));
        return lista;
    }
    
}
