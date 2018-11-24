package jogadores;

public class Azul extends Jogador {

    private final static Azul instance;
    
    static {
        instance = new Azul();
    }
    
    private Azul() {}
    
    public static Azul getInstance() {
        return instance;
    }
    
    @Override
    public String toString() {
        return "Azul";
    }

    @Override
    public Cor getCor() {
        return Cor.AZUL;
    }
    
}
