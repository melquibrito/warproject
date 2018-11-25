package jogadores;

import batalha.*;
import jogadores.estado.Estado;
import partida.Partida;
import territorios.Territorios;

public abstract class Jogador {
    
    private Estado estado;
    private String nick;
    private int tropas;
    private int avioes;
    private Dado dado;
    private int tropasADistribuir;
    private Partida partida;

    public Jogador() {
        setNickToDefault();
        this.avioes = 5;
        this.tropasADistribuir = 0;
        
    }
    
    @Override
    public abstract String toString();
    public abstract Cor getCor();
    
    public void atacar(Territorios inimigo) {
        if(getAvioes() > 0) {
            
        }
    }
    
    public void atacar(Territorios de, Territorios para) {
        if(getTropasADistribuir() == 0) {
            //delegar metodo para Estado
        }
    }
    
    public void desconnectar() {
        //delegar metodo para Estado
    }
    
    public void finalizarJogada() {
        //delegar metodo para Estado
    }

    public void alternarAtaque() {
        if(this.dado instanceof AtaqueTerrestre && getAvioes() > 0) {
            this.dado = new AtaqueAereo();
        }else if(getTropas() > 0){
            this.dado = new AtaqueTerrestre();
        }
    }
    
    public Estado getEstado() {
        return estado;
    }

    public void setNickToDefault() {
        this.nick = this.toString();
    }
    
    public String getNick() {
        return nick;
    }

    public void setNick(String nome) {
        this.nick = nome;
    }

    public int getTropas() {
        return tropas;
    }

    public void setTropas(int tropas) {
        this.tropas = tropas;
    }

    public int getAvioes() {
        return avioes;
    }

    public void setAvioes(int avioes) {
        this.avioes = avioes;
    }

    public int getTropasADistribuir() {
        return tropasADistribuir;
    }

    public void setTropasADistribuir(int tropasADistribuir) {
        this.tropasADistribuir = tropasADistribuir;
    }

    public Dado getDado() {
        return dado;
    }
    
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    
}
