package jogadores;

public class Preto extends Jogador {

    private final static Preto instance;
    
    static {
        instance = new Preto();
    }
    
    private Preto() {}
    
    public static Preto getInstance() {
        return instance;
    }
    
    @Override
    public String toString() {
        return "Preto";
    }

    @Override
    public Cor getCor() {
        return Cor.PRETO;
    }
    
}