package jogadores;

public class Azul extends Jogador {

    private static Azul instance;

    private Azul() {
    }

    protected static Azul getInstance() {
        if (instance == null) {
            instance = new Azul();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Azul";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.AZUL;
    }

}
