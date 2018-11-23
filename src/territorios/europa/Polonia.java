package territorios.europa;

import territorios.*;
import territorios.africa.Egito;

public final class Polonia extends Territorio {

    private final static Polonia instance = new Polonia();
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Franca.getInstance(), Alemanha.getInstance(), Egito.getInstance()/*, OrienteMedio.getInstance()*/, Moscou.getInstance()};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public Territorio getTerritorio() {
        return Polonia.getInstance();
    }
    
    @Override
    public Tag setTag() {
        return Tag.POLONIA;
    }

    @Override
    public String toString() {
        return "Polonia";
    }
    
}
