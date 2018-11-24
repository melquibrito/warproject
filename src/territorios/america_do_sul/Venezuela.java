package territorios.america_do_sul;

import territorios.*;

public class Venezuela extends Territorio {
    
    public final static Venezuela instance;
    
    static {
        instance = new Venezuela();
    }
    
    private Venezuela() {}
    
    public static Venezuela getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{};
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
