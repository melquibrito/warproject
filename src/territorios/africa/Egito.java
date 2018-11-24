package territorios.africa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Egito extends Territorio {
    
    private final static Egito instance;
    
    static {
        instance = new Egito();
    }

    private Egito() {}

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
    public String toString() {
        return "Egito";
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.EGITO;
    }
    
}
