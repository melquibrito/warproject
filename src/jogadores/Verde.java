package jogadores;

public class Verde extends Jogador {

    private final static Verde instance;
    
    static {
        instance = new Verde();
    }
    
    private Verde() {}
    
    public static Verde getInstance() {
        return instance;
    }
    
    @Override
    public String toString() {
        return "Verde";
    }

    @Override
    public Cor getCor() {
        return Cor.VERDE;
    }
    
}