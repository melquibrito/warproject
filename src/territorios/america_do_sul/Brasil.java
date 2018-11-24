package territorios.america_do_sul;

import territorios.*;

public class Brasil extends Territorio {
    
    public final static Brasil instance;
    
    static {
        instance = new Brasil();
    }
    
    private Brasil() {}
    
    public static Brasil getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        return null;
    }

    @Override
    public Territorios setTag() {
        return Territorios.BRASIL;
    }

    @Override
    public String toString() {
        return "Brasil";
    }
    
}
