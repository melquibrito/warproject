package territorios.europa;

import territorios.*;
import territorios.africa.*;

public final class Franca extends Territorio {
    
    private final static Franca instance = new Franca();
    
    private Franca() {}

    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Inglaterra.getInstance(), Alemanha.getInstance(), Polonia.getInstance(), Argelia.getInstance(), Egito.getInstance()};
    }

    public static Territorio getInstance() {
        return Franca.instance;
    }
    
    @Override
    public Territorio getTerritorio() {
        return getInstance();
    }

    @Override
    public Tag setTag() {
        return Tag.FRANCA;
    }
    
    @Override
    public String toString() {
        return "França";
    }
}
