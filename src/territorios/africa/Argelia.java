package territorios.africa;

import territorios.*;

public final class Argelia extends Territorio {
    
    private final static Argelia instance;
    
    static {
        instance = new Argelia();
    }

    private Argelia() {}

    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public Territorios setTag() {
        return Territorios.ARGELIA;
    }
    
    @Override
    public String toString() {
        return "Argelia";
    }
    
}
