package territorios.oceania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public class Borneo extends Territorio {

    private final static Borneo instance;
    
    static {
        instance = new Borneo();
    }
    
    private Borneo() {}
    
    public static Borneo getInstance() {
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
        return "Borneo";
    }
    
}
