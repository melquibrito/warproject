package jogadores;

public class Amarelo extends Jogador {

    private static Amarelo instance;

    private Amarelo() {
    }

    protected static Amarelo getInstance() {
        if (instance == null) {
            instance = new Amarelo();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Amarelo";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.AMARELO;
    }

}
