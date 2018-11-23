package partida;

import java.util.Arrays;
import territorios.Territorio;
import territorios.europa.*;

public final class ClassePrincipal {
    
    public static void main(String[] args) {
        Territorio a = Alemanha.getInstance();
        System.out.println(Arrays.toString(a.getVizinhos()));
        System.out.println(a.getExercitos());
    }
    
}
