package territorios.oceania;

import territorios.*;

public final class Australia extends Territorio {

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
    public Territorios setTag() {
        return Territorios.AUSTRALIA;
    }

    @Override
    public String toString() {
        return "Australia";
    }
    
}
