package territorios.europa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Inglaterra extends Territorio {

    private final static Inglaterra instance;
    
    static {
        instance = new Inglaterra();
    }

    private Inglaterra() {}
    
    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Islandia.getInstance());
        lista.add(Suecia.getInstance());
        lista.add(Franca.getInstance());
        lista.add(Alemanha.getInstance());
        return Collections.unmodifiableList(lista);
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.INGLATERRA;
    }

    @Override
    public String toString() {
        return "Inglaterra";
    }
    
}
