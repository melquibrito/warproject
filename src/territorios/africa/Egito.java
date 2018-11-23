package territorios.africa;

import territorios.Territorio;

public final class Egito extends Territorio {
    
    private final static Egito instance = new Egito();
    
    private Egito() {}

    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public Territorio getTerritorio() {
        return Egito.getInstance();
    }

    @Override
    public String toString() {
        return "Egito";
    }
    
}
