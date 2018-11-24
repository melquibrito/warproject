package territorios.oceania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public class Sumatra extends Territorio {

    private final static Sumatra instance;
    
    static {
        instance = new Sumatra();
    }
    
    private Sumatra() {}
    
    public static Sumatra getInstance() {
        return instance;
    }
    
    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        return Collections.unmodifiableList(lista);
    }

    @Override
    public Territorios setTag() {
        return Territorios.AUSTRALIA;
    }

    @Override
    public String toString() {
        return "Sumatra";
    }
    
}