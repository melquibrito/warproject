package jogadores;

import partida.Estados;

public abstract class Jogador {
    
    private Estados estado;
    private String nome;
    private int tropas;
    private int avioes;
    
    public void desconnectar() {
        //delegar metodo para Estado
    }
    
    public void finalizarJogada() {
        //delegar metodo para Estado
    }

    public Estados getEstado() {
        return estado;
    }
    
}
