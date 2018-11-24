package territorios.oceania;

import territorios.*;

public class Borneo extends Territorio {

    public final static Borneo instance;
    
    static {
        instance = new Borneo();
    }
    
    private Borneo() {}
    
    public static Borneo getInstance() {
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
        return "Borneo";
    }
    
}
