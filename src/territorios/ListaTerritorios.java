package territorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import territorios.africa.*;
import territorios.america_do_norte.*;
import territorios.europa.*;
import territorios.oceania.*;

public abstract class ListaTerritorios {
    private static final HashSet<Territorio> territorios = new HashSet();
    
    static {
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
        territorios.add(Alaska.getInstance());
        territorios.add(Groelandia.getInstance());
        territorios.add(Labrador.getInstance());
        territorios.add(Mexico.getInstance());
        territorios.add(Argelia.getInstance());
        territorios.add(Egito.getInstance());
    }
    
    public static List<Territorio> getLista() {
        ArrayList<Territorio> lista = new ArrayList(Arrays.asList(territorios));
        lista.sort(Comparator.comparing(Territorio::toString));
        return Collections.unmodifiableList(lista);
    }
}
