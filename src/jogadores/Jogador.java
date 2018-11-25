package jogadores;

import batalha.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jogadores.estado.Estado;
import partida.Observador;
import partida.Partida;
import partida.Sujeito;
import territorios.Territorios;

public abstract class Jogador implements Sujeito {
    
    public final static List<Jogador> jogadores;
    
    static {
        List<Jogador> lista = new ArrayList();
        lista.add(Amarelo.getInstance());
        lista.add(Azul.getInstance());
        lista.add(Preto.getInstance());
        lista.add(Roxo.getInstance());
        lista.add(Verde.getInstance());
        lista.add(Vermelho.getInstance());
        lista.sort(Comparator.comparing(Jogador::toString));
        jogadores = Collections.unmodifiableList(lista);
        
    }
    
    private Estado estado;
    private String nick;
    private int tropas;
    private int avioes;
    private Dado dado;
    private int tropasADistribuir;
    private Partida partida;
    
    private Observador observador;

    public Jogador() {
        setNickToDefault();
        this.avioes = 5;
        this.tropasADistribuir = 0;
        
    }
    
    @Override
    public abstract String toString();
    public abstract Jogadores getCor();
    
    public void atacar(Territorios inimigo) {
        if(getAvioes() > 0 && getPartida() != null) {
            this.estado.atacar(inimigo);
        }
    }
    
    public void atacar(Territorios de, Territorios para) {
        if(getTropasADistribuir() == 0 && getPartida() != null) {
            this.estado.atacar(de, para);
        }
    }
    
    public void desconnectar() {
        //delegar metodo para Estado
    }
    
    public void finalizarEtapa() {
        this.estado.finalizarEtapa(this);
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
    
    
    @Override
    public void regitrarObservador(Observador observador) {
        this.observador = observador;
    }

    @Override
    public void removerObservador(Observador observer) {
        this.observador = null;
    }

    @Override
    public void notificarObservador() {
        if(observador != null) {
            observador.atualizar(this);
        }
    }
    
}
