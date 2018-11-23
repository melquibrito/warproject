package jogadores;

//Padrão de Projeto: State
public abstract class Estado {
    
    public static void desconectar(Jogador jogador) {
        if(jogador.getEstado() instanceof Desconectado == false) {
            jogador.mudarEstado(Jogador.Estados.DESCONECTADO);
        }
    }
}
