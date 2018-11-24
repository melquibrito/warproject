package territorios.asia;

import territorios.Tag;
import territorios.Territorio;

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
    public Tag setTag() {
        return Tag.VLADVOSTOK;
    }

    @Override
    public String toString() {
        return "Vladvostok";
    }
}