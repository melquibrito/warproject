package territorios.oceania;

import territorios.*;

public class NovaGuine extends Territorio {

    public final static NovaGuine instance;
    
    static {
        instance = new NovaGuine();
    }
    
    private NovaGuine() {}
    
    public static NovaGuine getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        return null;
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
