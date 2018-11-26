package jogadores;

import batalha.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jogadores.estado.*;
import partida.*;
import partida.objetivos.Objetivo;
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
    private Ataque ataque;
    private int tropasADistribuir;
    private Partida partida;
    private Objetivo objetivo;

    private Observador observador;

    public Jogador() {
        this.avioes = 5;
        this.tropasADistribuir = 0;
        this.ataque = new AtaqueTerrestre();
        this.estado = new Jogando();
    }

    @Override
    public abstract String toString();

    public abstract Jogadores getCor();

    public void atacar(Territorios inimigo) {
        if (getAvioes() > 0 && getPartida() != null) {
            this.estado.atacar(this, null, inimigo);
        }
    }

    public void atacar(Territorios de, Territorios para) {
        if (getTropasADistribuir() == 0 && getPartida() != null) {
            this.estado.atacar(this, de, para);
        }
    }

    public void abandonarPartida() {
        estado.abandonarPartida(this);
    }

    public void finalizarEtapa() {
        this.estado.finalizarEtapa(this);
    }
    
    public void descolarTropas(Territorios de, Territorios para) {
        this.estado.descolarTropas(this, de, para);
    }
    
    public void alternarAtaque() {
        if (this.ataque instanceof AtaqueTerrestre && getAvioes() > 0) {
            this.ataque = new AtaqueAereo();
        } else if (getTropas() > 0) {
            this.ataque = new AtaqueTerrestre();
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void atualizarEstado(Estados estado, Jogador jogador) {
        switch (estado) {
            case AGUARDANDO_A_VEZ:
                this.estado = new Aguardando();
                break;
            case NA_VEZ:
                this.estado = new Jogando();
                break;
            case MORTO:
                this.estado = new Morto(jogador);
                break;
            case DESCONECTADO:
                this.estado = new Desconectado();
                break;
            default:
                this.estado = null;
        }
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nome) {
        this.nick = nome;
    }

    public Ataque getAtaque() {
        if (this.getPartida() != null && this.getEstado().getEtapa() == Estados.Jogando.ATACANDO) {
            return ataque;
        }
        return null;
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

    public void addAvioes(int quantidade) {
        if (this.getEstado().getEtapa() == Estados.Jogando.DISTRIBUINDO_TROPAS) {
            this.avioes += quantidade;
        }
    }

    public void diminuirAvioes(int quantidade) {
        if (this.estado.getEtapa() == Estados.Jogando.ATACANDO) {
            int resultado = this.avioes - quantidade;
            if (resultado > 0) {
                this.avioes -= quantidade;
            } else {
                this.avioes = 0;
            }
        }
    }

    public int getTropasADistribuir() {
        return tropasADistribuir;
    }

    public void setTropasADistribuir(int tropasADistribuir) {
        this.tropasADistribuir = tropasADistribuir;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
        regitrarObservador(partida);
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
        if (observador != null) {
            observador.atualizar(this);
        }
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }
    
}
