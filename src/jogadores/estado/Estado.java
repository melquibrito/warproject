package jogadores.estado;

import territorios.Territorios;

public abstract class Estado {
    private Estados estado;

    public void atacar(Territorios inimigo) {
        
    }
    
    public void atacar(Territorios de, Territorios para) {
        
    }
    
    public void desconnectar() {
        //delegar metodo para Estado
    }
    
    public void finalizarJogada() {
        //delegar metodo para Estado
    }
    
    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
}
