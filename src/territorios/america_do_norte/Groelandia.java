package territorios.america_do_norte;

import territorios.Tag;
import territorios.Territorio;

public final class Groelandia extends Territorio {

    public static Groelandia instance = new Groelandia();
    
    private Groelandia() {}

    public static Groelandia getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Territorio getTerritorio() {
        return Groelandia.getInstance();
    }

    @Override
    public Tag setTag() {
        return Tag.GROELANDIA;
    }

    @Override
    public String toString() {
        return "Groelância";
    }
    
}
