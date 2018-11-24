package territorios.america_do_norte;

import territorios.*;

public final class Groelandia extends Territorio {

    public final static Groelandia instance;
    
    static {
        instance = new Groelandia();
    }

    private Groelandia() {}

    public static Groelandia getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Territorios setTag() {
        return Territorios.GROELANDIA;
    }
    
    @Override
    public String toString() {
        return "Groelância";
    }
    
}
