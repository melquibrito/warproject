package jogadores;

public class Roxo extends Jogador {

    private final static Roxo instance;
    
    static {
        instance = new Roxo();
    }
    
    private Roxo() {}
    
    public static Roxo getInstance() {
        return instance;
    }
    
    @Override
    public String toString() {
        return "Roxo";
    }

    @Override
    public Cor getCor() {
        return Cor.ROXO;
    }
    
}
