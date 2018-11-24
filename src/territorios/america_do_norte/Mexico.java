package territorios.america_do_norte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Mexico extends Territorio {

    private final static Mexico instance;

    static {
        instance = new Mexico();
    }

    private Mexico() {
    }

    public static Mexico getInstance() {
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
        return Territorios.MEXICO;
    }

    @Override
    public String toString() {
        return "México";
    }

}
