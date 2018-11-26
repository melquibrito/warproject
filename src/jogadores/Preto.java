package jogadores;

public class Preto extends Jogador {

    private static Preto instance;

    private Preto() {
    }

    protected static Preto getInstance() {
        if (instance == null) {
            instance = new Preto();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Preto";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.PRETO;
    }

}
