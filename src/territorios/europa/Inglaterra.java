package territorios.europa;

import territorios.*;

public final class Inglaterra extends Territorio {

    private final static Inglaterra instance;
    
    static {
        instance = new Inglaterra();
    }

    private Inglaterra() {}
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Islandia.getInstance(), Suecia.getInstance(), Franca.getInstance(), Alemanha.getInstance()};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public Territorios setTag() {
        return Territorios.INGLATERRA;
    }

    @Override
    public String toString() {
        return "Inglaterra";
    }
    
}
