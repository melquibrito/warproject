package territorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class ListaTerritorios {
    private static final HashSet<Territorio> territorios = new HashSet();
    
    public static void add(Territorio territorio) {
        if(!territorios.isEmpty()) {
            if(territorios.stream().noneMatch((x) -> (x == territorio))) {
                territorios.add(territorio);
            }
        }else{
            territorios.add(territorio);
        }
    }
    
    public static ArrayList<Territorio> getTerritoriosAsArrayList() {
        ArrayList<Territorio> lista;
        lista = new ArrayList(Arrays.asList(territorios));
        lista.sort(Comparator.comparing(Territorio::toString));
        return lista;
    }
}
