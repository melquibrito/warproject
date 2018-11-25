package partida;

import jogadores.Jogadores;

public final class ClassePrincipal {
    
    public static void main(String[] args) {
        Partida.criar(new Jogadores[]{Jogadores.AMARELO, Jogadores.AZUL, Jogadores.PRETO});
        System.out.println(Partida.getPartida().jogadores);
        
    }
    
}
