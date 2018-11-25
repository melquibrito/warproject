package jogadores;

public class Roxo extends Jogador {

    private final static Roxo instance;
    
    static {
        instance = new Roxo();
    }
    
    private Roxo() {}
    
    protected static Roxo getInstance() {
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
