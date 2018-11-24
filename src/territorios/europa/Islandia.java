package territorios.europa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;
import territorios.america_do_norte.Groelandia;

public final class Islandia extends Territorio {
    
    private final static Islandia instance;
    
    static {
        instance = new Islandia();
    }

    private Islandia() {}
    
    public static Territorio getInstance() {
        return instance;
    }
    
    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Groelandia.getInstance());
        lista.add(Inglaterra.getInstance());
        return Collections.unmodifiableList(lista);
    }

    @Override
    public Territorios setTag() {
        return Territorios.ISLANDIA;
    }
    
    @Override
    public String toString() {
        return "Islândia";
    }
    
}
