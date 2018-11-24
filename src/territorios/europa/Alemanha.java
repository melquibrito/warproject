package territorios.europa;

import territorios.*;


public final class Alemanha extends Territorio {
    
    private final static Alemanha instance;
    
    static {
        instance = new Alemanha();
    }

    private Alemanha() {}
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Inglaterra.getInstance(), Franca.getInstance(), Polonia.getInstance()};
    }
    
    public static Territorio getInstance() {
        return Alemanha.instance;
    }

    @Override
    public Tag setTag() {
        return Tag.ALEMANHA;
    }
    
    @Override
    public String toString() {
        return "Alemanha";
    }
    
}
