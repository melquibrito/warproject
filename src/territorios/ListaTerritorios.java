package territorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import territorios.africa.*;
import territorios.america_do_norte.*;
import territorios.america_do_sul.*;
import territorios.europa.*;
import territorios.oceania.*;

public abstract class ListaTerritorios {
    private static final HashSet<Territorio> territorios;
    
    static {
        territorios = new HashSet();
        build();
    }
    
    private static void build() {
        territorios.add(Alemanha.getInstance());
        territorios.add(Franca.getInstance());
        territorios.add(Inglaterra.getInstance());
        territorios.add(Islandia.getInstance());
        territorios.add(Moscou.getInstance());
        territorios.add(Polonia.getInstance());
        territorios.add(Suecia.getInstance());
        territorios.add(Australia.getInstance());
        territorios.add(Borneo.getInstance());
        territorios.add(NovaGuine.getInstance());
        territorios.add(Sumatra.getInstance());
        territorios.add(Alaska.getInstance());
        territorios.add(Groelandia.getInstance());
        territorios.add(Labrador.getInstance());
        territorios.add(Mexico.getInstance());
        territorios.add(Argelia.getInstance());
        territorios.add(Egito.getInstance());
        territorios.add(Brasil.getInstance());
        territorios.add(Argentina.getInstance());
        territorios.add(Peru.getInstance());
        territorios.add(Venezuela.getInstance());
    }
    
    public static List<Territorio> getLista() {
        List<Territorio> lista = new ArrayList();
        for(Territorio x : territorios) {
            lista.add(x);
        }
        lista.sort(Comparator.comparing(Territorio::toString));
        return Collections.unmodifiableList(lista);
    }
}
