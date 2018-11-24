package territorios.america_do_norte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Labrador extends Territorio {

    private final static Labrador instance;

    static {
        instance = new Labrador();
    }

    private Labrador() {}

    public static Labrador getInstance() {
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
        return Territorios.LABRADOR;
    }

    @Override
    public String toString() {
        return "Labrador";
    }

}
