package territorios.oceania;

import territorios.*;

public class Sumatra extends Territorio {

    public final static Sumatra instance;
    
    static {
        instance = new Sumatra();
    }
    
    private Sumatra() {}
    
    public static Sumatra getInstance() {
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
        return "Sumatra";
    }
    
}