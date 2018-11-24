package territorios.africa;

import territorios.*;

public final class Egito extends Territorio {
    
    private final static Egito instance;
    
    static {
        instance = new Egito();
    }

    private Egito() {}

    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Egito";
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.EGITO;
    }
    
}
