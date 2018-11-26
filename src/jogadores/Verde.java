package jogadores;

public class Verde extends Jogador {

    private final static Verde instance = new Verde();

    private Verde() {
    }

    protected static Verde getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "VERDE";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.VERDE;
    }

}
