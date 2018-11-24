package territorios.europa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;
import territorios.africa.Egito;

public final class Polonia extends Territorio {

    private final static Polonia instance;
    
    static {
        instance = new Polonia();
    }

    private Polonia() {}
    
    public static Territorio getInstance() {
        return instance;
    }
    
    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Franca.getInstance());
        lista.add(Alemanha.getInstance());
        lista.add(Egito.getInstance());
        //lista.add(OrienteMedio.getInstance());
        lista.add(Moscou.getInstance());
        return Collections.unmodifiableList(lista);
    }

    @Override
    public Territorios setTag() {
        return Territorios.POLONIA;
    }

    @Override
    public String toString() {
        return "Polonia";
    }
    
}
