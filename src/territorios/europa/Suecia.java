package territorios.europa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Suecia extends Territorio {

    private final static Suecia instance;

    static {
        instance = new Suecia();
    }

    private Suecia() {}
    
    public static Territorio getInstance() {
        return instance;
    }
    
    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Inglaterra.getInstance());
        lista.add(Moscou.getInstance());
        return Collections.unmodifiableList(lista);
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.SUECIA;
    }
  
    @Override
    public String toString() {
        return "Suécia";
    }
    
}
