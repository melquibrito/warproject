package territorios.oceania;

import territorios.Tag;
import territorios.Territorio;

public class Australia extends Territorio {

    public final static Australia instance;
    
    static {
        instance = new Australia();
    }
    
    private Australia() {}
    
    public static Australia getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        return null;
    }

    @Override
    public Tag setTag() {
        return Tag.AUSTRALIA;
    }

    @Override
    public String toString() {
        return "Australia";
    }
    
}
