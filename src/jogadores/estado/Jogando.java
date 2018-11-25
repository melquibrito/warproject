package jogadores.estado;

public class Jogando extends Estado {
    
    @Override
    public Estados getEstado() {
        return Estados.NA_VEZ;
    }
    
}
