package partida;

import jogadores.Jogadores;

public final class ClassePrincipal {
    
    public static void main(String[] args) {
        
        Partida.criar(new String[]{"Melqui", "Denisson", "Filipe"});
        System.out.println(Partida.getPartida().jogadores);
        Partida.getPartida().iniciar();
        System.out.println("\nOBJETIVOS SORTEADOS:\n");
        
        for(Jogadores x : Partida.getPartida().jogadores) {
            System.out.println(x + ": " + x.getJogador().getObjetivo());
        }
        
    }
}
