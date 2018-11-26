package jogadores;

public class Verde extends Jogador {

    private static Verde instance;

    private Verde() {
    }

    protected static Verde getInstance() {
        if (instance == null) {
            instance = new Verde();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Verde";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.VERDE;
    }

}
