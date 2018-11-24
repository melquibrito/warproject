package territorios.america_do_norte;

import territorios.Tag;
import territorios.Territorio;

public final class Alaska extends Territorio {
    
    public final static Alaska instance;
    
    static {
        instance = new Alaska();
    }

    private Alaska() {}
    
    public static Alaska getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        return null;
    }

    @Override
    public Tag setTag() {
        return Tag.ALASKA;
    }

    @Override
    public String toString() {
        return "Alaska";
    }
    
}
