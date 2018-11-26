package jogadores.estado;

import jogadores.Jogador;
import territorios.Territorios;

public abstract class Estado {

    public void atacar(Territorios inimigo) {
        
    }
    
    public void atacar(Territorios de, Territorios para) {
        if(de.getOcupante() != null && de.territorioVizinho(para)) {
            if(de.getOcupante().getEstado().getEstado() == Estados.NA_VEZ) {
                if(de.getOcupante().getEstado().getEstado().getEtapa() == Estados.Jogando.ATACANDO) {
                    de.getOcupante().getDado().jogar(de, para);
                }else {
                    if(de.getOcupante().getEstado().getEstado().getEtapa() == Estados.Jogando.DISTRIBUINDO_TROPAS) {
                        System.out.println("Você ainda não terminou de distribuir suas tropas!");
                    }else { 
                        System.out.println("Você já finalizou o ataque. Não é mais possível atacar nesta rodada.");
                    }
                }
            }else {
                System.out.println("Você não pode atacar! Seu estado atual é: " + de.getOcupante().getEstado().getEstado());
            }
        }
    }
    
    public void desconnectar() {
        
    }
    
    public void finalizarEtapa(Jogador jogador) {
        Estados.proximaFase(jogador);
    }
    
    public abstract Estados getEstado();
    
    public Estados.Jogando getEtapa() {
        return getEstado().getEtapa();
    }

    public void setEstado(Estados estado) {
        
    }
    
}
