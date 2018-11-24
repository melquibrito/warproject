package territorios.america_do_sul;

import territorios.*;

public class Argentina extends Territorio {

    public final static Argentina instance;
    
    static {
        instance = new Argentina();
    }
    
    private Argentina() {}
    
    public static Argentina getInstance() {
        return instance;
    }
    
    @Override
    public Territorio[] getVizinhos() {
        return new Territorio[]{Brasil.getInstance(), Peru.getInstance()};
    }

    @Override
    public Territorios setTag() {
        return Territorios.ARGENTINA;
    }

    @Override
    public String toString() {
        return "Argentina";
    }
    
}
