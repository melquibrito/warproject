package jogadores;

import batalha.*;
import partida.Estados;
import territorios.Territorios;

public abstract class Jogador {
    
    private Estados estado;
    private String nick;
    private int tropas;
    private int avioes;
    private Ataque ataque;

    public Jogador() {
        setNickToDefault();
        this.avioes = 5;
    }
    
    @Override
    public abstract String toString();
    
    public void atacar(Territorios inimigo) {
        //delegar metodo para Estado
    }
    
    public void atacar(Territorios de, Territorios para) {
        //delegar metodo para Estado
    }
    
    public void desconnectar() {
        //delegar metodo para Estado
    }
    
    public void finalizarJogada() {
        //delegar metodo para Estado
    }

    public void alternarAtaque() {
        if(this.ataque instanceof AtaqueTerrestre && getAvioes() > 0) {
            this.ataque = AtaqueAereo.getInstance();
        }else if(getTropas() > 0){
            this.ataque = AtaqueTerrestre.getInstance();
        }
    }
    
    public Estados getEstado() {
        return estado;
    }

    
    public String getNick() {
        return nick;
    }

    public void setNick(String nome) {
        this.nick = nome;
    }
    
    public void setNickToDefault() {
        this.nick = this.toString();
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
    
}
