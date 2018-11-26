package jogadores.estado;

public class Morto extends Estado {

    @Override
    public Estados getEstado() {
        return Estados.MORTO;
    }

}
