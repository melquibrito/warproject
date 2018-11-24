package territorios.america_do_sul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.Territorio;
import territorios.Territorios;

public class Peru extends Territorio {
    
    private final static Peru instance;
    
    static {
        instance = new Peru();
    }
    
    private Peru() {}
    
    public static Peru getInstance() {
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
        return Territorios.PERU;
    }

    @Override
    public String toString() {
        return "Peru";
    }
    
}
