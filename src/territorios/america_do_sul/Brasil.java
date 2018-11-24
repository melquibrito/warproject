package territorios.america_do_sul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Brasil extends Territorio {
    
    private final static Brasil instance;
    
    static {
        instance = new Brasil();
    }
    
    private Brasil() {}
    
    public static Brasil getInstance() {
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
        return Territorios.BRASIL;
    }

    @Override
    public String toString() {
        return "Brasil";
    }
    
}
