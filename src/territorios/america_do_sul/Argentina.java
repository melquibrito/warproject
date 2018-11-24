package territorios.america_do_sul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public class Argentina extends Territorio {

    private final static Argentina instance;
    
    static {
        instance = new Argentina();
    }
    
    private Argentina() {}
    
    public static Argentina getInstance() {
        return instance;
    }
    
    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Brasil.getInstance());
        lista.add(Peru.getInstance());
        return Collections.unmodifiableList(lista);
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.ARGENTINA;
    }

    @Override
    public String toString() {
        return "Argentina";
    }
    
}
