package jogadores;

import batalha.*;
import partida.Estados;
import territorios.Territorios;

public abstract class Jogador {
    
    private Cor cor;
    private Estados estado;
    private String nick;
    private int tropas;
    private int avioes;
    private Ataque ataque;
    private int tropasADistribuir;

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
            //delegar metodo para Estado
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
        if(this.ataque instanceof AtaqueTerrestre && getAvioes() > 0) {
            this.ataque = AtaqueAereo.getInstance();
        }else if(getTropas() > 0){
            this.ataque = AtaqueTerrestre.getInstance();
        }
    }
    
    public Estados getEstado() {
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
    
}
