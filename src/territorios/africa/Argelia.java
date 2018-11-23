package territorios.africa;

import territorios.Territorio;

public final class Argelia extends Territorio {
    
    private final static Argelia instance = new Argelia();
    
    private Argelia() {}

    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public Territorio getTerritorio() {
        return Argelia.getInstance();
    }

    @Override
    public String toString() {
        return "Argelia";
    }
    
}
