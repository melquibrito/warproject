package territorios.europa;

import territorios.*;

public final class Moscou extends Territorio {
    
    private final static Moscou instance;
    
    static {
        instance = new Moscou();
    }

    private Moscou() {}
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Suecia.getInstance(), Polonia.getInstance()/*, OrienteMedio.getInstance(), Aral.getInstance(), Onsk.getInstance()*/};
    }

    public static Territorio getInstance() {
        return instance;
    }

    @Override
    public Territorio getTerritorio() {
        return Moscou.getInstance();
    }
    
    @Override
    public Tag setTag() {
        return Tag.MOSCOU;
    }
    
    @Override
    public String toString() {
        return "Moscou";
    }
    
}
