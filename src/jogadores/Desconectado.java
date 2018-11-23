package jogadores;

public class Desconectado extends Estado {
    
    private volatile static Desconectado instance;
    
    private Desconectado(){}
    
    protected static Desconectado getInstance(){
        Desconectado innerInstance = Desconectado.instance;
        if(innerInstance == null){
            synchronized(Desconectado.class){
                innerInstance = Desconectado.instance;
                if(innerInstance == null){
                    Desconectado.instance = innerInstance = new Desconectado();
                } 
            }
        }
        return innerInstance;
    }
    
    public void reconectar(Jogador jogador) {
    
    }
}
