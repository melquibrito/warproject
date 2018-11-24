package territorios.america_do_norte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Alaska extends Territorio {
    
    private final static Alaska instance;
    
    static {
        instance = new Alaska();
    }

    private Alaska() {}
    
    public static Alaska getInstance() {
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
        return Territorios.ALASKA;
    }

    @Override
    public String toString() {
        return "Alaska";
    }
    
}
