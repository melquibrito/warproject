package jogadores;

public class Roxo extends Jogador {

    private static Roxo instance;

    private Roxo() {
    }

    protected static Roxo getInstance() {
        if (instance == null) {
            instance = new Roxo();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Roxo";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.ROXO;
    }

}
