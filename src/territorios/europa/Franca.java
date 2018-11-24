package territorios.europa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;
import territorios.africa.*;

public final class Franca extends Territorio {
    
    private final static Franca instance;
    
    static {
        instance = new Franca();
    }

    private Franca() {}
    
    public static Territorio getInstance() {
        return Franca.instance;
    }

    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Inglaterra.getInstance());
        lista.add(Alemanha.getInstance());
        lista.add(Polonia.getInstance());
        lista.add(Argelia.getInstance());
        lista.add(Egito.getInstance());
        return Collections.unmodifiableList(lista);
    }

    @Override
    public Territorios setTag() {
        return Territorios.FRANCA;
    }
    
    @Override
    public String toString() {
        return "França";
    }
}
