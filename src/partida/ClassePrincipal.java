package partida;

public final class ClassePrincipal {

    public static void main(String[] args) {
        Partida.criar(new String[]{"Melqui", "David", "Samyla", "Isaque", "Sostenes", "Karla", "João"});
        System.out.println(Partida.getPartida().jogadores);
        Partida.getPartida().iniciar();
    }

}
