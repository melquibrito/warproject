package jogadores;

public class Preto extends Jogador {

    private final static Preto instance = new Preto();

    private Preto() {
    }

    protected static Preto getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "PRETO";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.PRETO;
    }

}
