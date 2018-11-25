package jogadores.estado;

public class Desconectado extends Estado {
    
    @Override
    public Estados getEstado() {
        return Estados.DESCONECTADO;
    }
    
}
