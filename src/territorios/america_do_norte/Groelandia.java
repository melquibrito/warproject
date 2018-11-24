package territorios.america_do_norte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Groelandia extends Territorio {

    private final static Groelandia instance;
    
    static {
        instance = new Groelandia();
    }

    private Groelandia() {}

    public static Groelandia getInstance() {
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
        return Territorios.GROELANDIA;
    }
    
    @Override
    public String toString() {
        return "Groelância";
    }
    
}
