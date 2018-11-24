package territorios.europa;

import territorios.*;
import territorios.america_do_norte.Groelandia;

public final class Islandia extends Territorio {
    
    private final static Islandia instance;
    
    static {
        instance = new Islandia();
    }

    private Islandia() {}

    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Groelandia.getInstance(), Inglaterra.getInstance()};
    }

    public static Territorio getInstance() {
        return instance;
    }
    
    @Override
    public Tag setTag() {
        return Tag.ISLANDIA;
    }
    
    @Override
    public String toString() {
        return "Islândia";
    }
    
}
