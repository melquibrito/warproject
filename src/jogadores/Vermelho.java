package jogadores;

public class Vermelho extends Jogador {

    private static Vermelho instance;
    
    private Vermelho() {}
    
    protected static Vermelho getInstance() {
        if(instance == null){
            instance = new Vermelho();
        }
        return instance;
    }
    
    @Override
    public String toString() {
        return "Vermelho";
    }

    @Override
    public Jogadores getCor() {
        return Jogadores.VERMELHO;
    }
    
}