package jogadores;

class AguardandoAVez extends Estado {
    private volatile static AguardandoAVez instance;
    
    private AguardandoAVez(){}
    
    protected static AguardandoAVez getInstance(){
        AguardandoAVez innerInstance = AguardandoAVez.instance;
        if(innerInstance == null){
            synchronized(AguardandoAVez.class){
                innerInstance = AguardandoAVez.instance;
                if(innerInstance == null){
                    AguardandoAVez.instance = innerInstance = new AguardandoAVez();
                } 
            }
        }
        return innerInstance;
    }
    
}
