package territorios.asia;

import territorios.*;

public class Vladvostok extends Territorio {
    
    public final static Vladvostok instance;
    
    static {
        instance = new Vladvostok();
    }

    private Vladvostok() {}
    
    public static Vladvostok getInstance() {
        return instance;
    }

    @Override
    public Territorio[] getVizinhos() {
        return null;
    }

    @Override
    public Territorios setTag() {
        return Territorios.VLADVOSTOK;
    }

    @Override
    public String toString() {
        return "Vladvostok";
    }
}
