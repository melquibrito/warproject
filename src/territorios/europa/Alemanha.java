package territorios.europa;

import territorios.*;


public final class Alemanha extends Territorio {
    
    private static final Alemanha instance = new Alemanha();
    
    private Alemanha() {super();}

    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Inglaterra.getInstance(), Franca.getInstance(), Polonia.getInstance()};
    }
    
    public static Territorio getInstance() {
        return Alemanha.instance;
    }

    @Override
    public Territorio getTerritorio() {
        return getInstance();
    }

    @Override
    public String toString() {
        return "Alemanha";
    }
    
}
