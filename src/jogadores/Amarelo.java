package jogadores;

public class Amarelo extends Jogador {

    private final static Amarelo instance;
    
    static {
        instance = new Amarelo();
    }
    
    private Amarelo() {}
    
    public static Amarelo getInstance() {
        return instance;
    }
    
    @Override
    public String toString() {
        return "Amarelo";
    }

    @Override
    public Cor getCor() {
        return Cor.AMARELO;
    }
    
}