package territorios.america_do_sul;

import territorios.Territorio;
import territorios.Territorios;

public class Peru extends Territorio {
    
    public final static Peru instance;
    
    static {
        instance = new Peru();
    }
    
    private Peru() {}
    
    public static Peru getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{};
    }

    @Override
    public Territorios setTag() {
        return Territorios.PERU;
    }

    @Override
    public String toString() {
        return "Peru";
    }
    
}
