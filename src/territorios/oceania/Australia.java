package territorios.oceania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import territorios.*;

public final class Australia extends Territorio {

    private final static Australia instance;
    
    static {
        instance = new Australia();
    }
    
    private Australia() {}
    
    public static Australia getInstance() {
        return instance;
    }
    
    @Override
    public List<Territorio> getVizinhos() {
        List<Territorio> lista = new ArrayList();
        lista.add(Borneo.getInstance());
        lista.add(NovaGuine.getInstance());
        lista.add(Sumatra.getInstance());
        return Collections.unmodifiableList(lista);
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.AUSTRALIA;
    }

    @Override
    public String toString() {
        return "Australia";
    }
    
}
