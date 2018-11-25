package partida;

public interface Sujeito {
    public abstract void regitrarObservador(Observador observer);
    public abstract void removerObservador(Observador observer);
    public abstract void notificarObservador();
}
