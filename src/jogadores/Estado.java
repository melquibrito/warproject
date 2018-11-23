package jogadores;

public abstract class Estado {
    
    public void desconectar(Jogador jogador) {
        if(jogador.getEstado() instanceof Desconectado == false) {
            jogador.mudarEstado(Jogador.estado.DESCONECTADO);
        }
    }
}
