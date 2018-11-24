package territorios.oceania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public class NovaGuine extends Territorio {

    private final static NovaGuine instance;
    
    static {
        instance = new NovaGuine();
    }
    
    private NovaGuine() {}
    
    public static NovaGuine getInstance() {
        return instance;
    }
    
    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Borneo.getInstance());
        lista.add(Australia.getInstance());
        return Collections.unmodifiableList(lista);
    }

    @Override
    public Territorios setTag() {
        return Territorios.AUSTRALIA;
    }

    @Override
    public String toString() {
        return "Nova Guiné";
    }
    
}
