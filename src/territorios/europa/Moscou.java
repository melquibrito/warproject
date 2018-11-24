package territorios.europa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Moscou extends Territorio {
    
    private final static Moscou instance;
    
    static {
        instance = new Moscou();
    }

    private Moscou() {}
    
    public static Territorio getInstance() {
        return instance;
    }
    
    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Suecia.getInstance());
        lista.add(Polonia.getInstance());
        //lista.add(OrienteMedio.getInstance());
        //lista.add(Aral.getInstance());
        //lista.add(Onsk.getIsntance());
        return Collections.unmodifiableList(lista);
    }

    @Override
    public Territorios setTag() {
        return Territorios.MOSCOU;
    }
    
    @Override
    public String toString() {
        return "Moscou";
    }
    
}
