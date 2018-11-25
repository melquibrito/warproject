package jogadores.estado;

public class Jogando extends Estado {
    private NaVez etapa;

    public NaVez getEtapa() {
        return etapa;
    }

    public void setEtapa(NaVez etapa) {
        this.etapa = etapa;
    }

    @Override
    public Estados getEstado() {
        return Estados.NA_VEZ;
    }
    
}
