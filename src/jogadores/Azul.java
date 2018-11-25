package jogadores;

public class Azul extends Jogador {

    private final static Azul instance;
    
    static {
        instance = new Azul();
    }
    
    private Azul() {}
    
    protected static Azul getInstance() {
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
