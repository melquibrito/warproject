package territorios.asia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Vladvostok extends Territorio {
    
    private final static Vladvostok instance;
    
    static {
        instance = new Vladvostok();
    }

    private Vladvostok() {}
    
    public static Vladvostok getInstance() {
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
        return Territorios.VLADVOSTOK;
    }

    @Override
    public String toString() {
        return "Vladvostok";
    }
}
