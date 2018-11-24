package territorios.europa;

import territorios.*;
import territorios.africa.Egito;

public final class Polonia extends Territorio {

    private final static Polonia instance;
    
    static {
        instance = new Polonia();
    }

    private Polonia() {}
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Franca.getInstance(), Alemanha.getInstance(), Egito.getInstance()/*, OrienteMedio.getInstance()*/, Moscou.getInstance()};
    }

    public static Territorio getInstance() {
        return instance;
    }
    
    @Override
    public Territorios setTag() {
        return Territorios.POLONIA;
    }

    @Override
    public String toString() {
        return "Polonia";
    }
    
}
