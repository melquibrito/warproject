package partida;

import java.util.List;
import territorios.ListaTerritorios;
import territorios.Territorio;

public final class ClassePrincipal {
    
    public static void main(String[] args) {
        List<Territorio> lista;
        lista = ListaTerritorios.getLista();
        
        System.out.println(lista);
    }
    
}
