package jogadores.estado;

public class Aguardando extends Estado {

    @Override
    public Estados getEstado() {
        return Estados.AGUARDANDO_A_VEZ;
    }
    
}
