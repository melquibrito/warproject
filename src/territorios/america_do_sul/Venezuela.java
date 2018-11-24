package territorios.america_do_sul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public class Venezuela extends Territorio {
    
    private final static Venezuela instance;
    
    static {
        instance = new Venezuela();
    }
    
    private Venezuela() {}
    
    public static Venezuela getInstance() {
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
        return Territorios.VENEZUELA;
    }

    @Override
    public String toString() {
        return "Venezuela";
    }
    
}
