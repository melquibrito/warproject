package jogadores;

public class Vermelho extends Jogador {

    private final static Vermelho instance = new Vermelho();;

    private Vermelho() {
    }

    protected static Vermelho getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "VERMELHO";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.VERMELHO;
    }

}
