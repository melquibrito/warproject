package territorios.africa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Argelia extends Territorio {
    
    private final static Argelia instance;
    
    static {
        instance = new Argelia();
    }

    private Argelia() {}

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        //lista.add();
        //lista.add();
        //lista.add();
        //lista.add();
        return Collections.unmodifiableList(lista);
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.ARGELIA;
    }
    
    @Override
    public String toString() {
        return "Argelia";
    }
    
}
