package territorios.america_do_sul;

import territorios.Tag;
import territorios.Territorio;

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
    public Tag setTag() {
        return Tag.BRASIL;
    }

    @Override
    public String toString() {
        return "Brasil";
    }
    
}
