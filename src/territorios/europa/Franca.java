package territorios.europa;

import territorios.*;
import territorios.africa.*;

public final class Franca extends Territorio {
    
    private final static Franca instance;
    
    static {
        instance = new Franca();
    }

    private Franca() {}

    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Inglaterra.getInstance(), Alemanha.getInstance(), Polonia.getInstance(), Argelia.getInstance(), Egito.getInstance()};
    }

    public static Territorio getInstance() {
        return Franca.instance;
    }

    @Override
    public Territorios setTag() {
        return Territorios.FRANCA;
    }
    
    @Override
    public String toString() {
        return "França";
    }
}
