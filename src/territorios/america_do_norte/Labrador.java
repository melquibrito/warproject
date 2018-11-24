package territorios.america_do_norte;

import territorios.*;

public final class Labrador extends Territorio {

    public final static Labrador instance;

    static {
        instance = new Labrador();
    }

    private Labrador() {}

    public static Labrador getInstance() {
        return instance;
    }

    @Override
    public Territorio[] getVizinhos() {
        return null;
    }

    @Override
    public Territorios setTag() {
        return Territorios.LABRADOR;
    }

    @Override
    public String toString() {
        return "Labrador";
    }

}
