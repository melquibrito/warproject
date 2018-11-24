package territorios.europa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;


public final class Alemanha extends Territorio {
    
    private final static Alemanha instance;
    
    static {
        instance = new Alemanha();
    }

    private Alemanha() {}
    
    public static Territorio getInstance() {
        return Alemanha.instance;
    }

    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Inglaterra.getInstance());
        lista.add(Franca.getInstance());
        lista.add(Polonia.getInstance());
        return Collections.unmodifiableList(lista);
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.ALEMANHA;
    }
    
    @Override
    public String toString() {
        return "Alemanha";
    }
    
}
