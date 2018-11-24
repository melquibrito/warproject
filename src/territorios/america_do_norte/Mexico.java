package territorios.america_do_norte;

import territorios.*;

public final class Mexico extends Territorio {

    public final static Mexico instance;

    static {
        instance = new Mexico();
    }

    private Mexico() {
    }

    public static Mexico getInstance() {
        return instance;
    }

    @Override
    public Territorio[] getVizinhos() {
        return null;
    }

    @Override
    public Territorios setTag() {
        return Territorios.MEXICO;
    }

    @Override
    public String toString() {
        return "México";
    }

}
