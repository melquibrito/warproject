package jogadores.estado;

public abstract class Estado {
    private Estados estado;

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
}
