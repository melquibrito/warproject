package jogadores;

public class Amarelo extends Jogador {

    private final static Amarelo instance = new Amarelo();

    private Amarelo() {
    }

    protected static Amarelo getInstance() {
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
