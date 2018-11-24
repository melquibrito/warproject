package territorios.europa;

import territorios.*;

public final class Suecia extends Territorio {

    private final static Suecia instance;

    static {
        instance = new Suecia();
    }

    private Suecia() {}
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Inglaterra.getInstance(), Moscou.getInstance()};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public Territorio getTerritorio() {
        return Suecia.getInstance();
    }

    
    @Override
    public Tag setTag() {
        return Tag.SUECIA;
    }
  
    @Override
    public String toString() {
        return "Suécia";
    }
    
}
