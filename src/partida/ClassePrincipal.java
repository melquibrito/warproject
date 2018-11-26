package partida;

public final class ClassePrincipal {

    public static void main(String[] args) {
        Partida.criar(new String[]{"Melqui", "David"});
        System.out.println(Partida.jogadores);

    }

}
