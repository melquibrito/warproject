package partida;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import jogadores.Jogador;
import jogadores.Jogadores;
import jogadores.estado.Estados.Jogando;
import partida.objetivos.Objetivo;

public final class Partida implements Observador {
    
    static Random rand = new Random();
    private static Partida partida;
    public List<Jogadores> jogadores;
    private Jogador jogador;

    private Partida() {
    }

    public synchronized static void criar(Jogadores[] jogadores) {
        if (partida == null && jogadores.length > 1 && jogadores.length < 7) {
            partida = new Partida();
            List<Jogadores> lista = new ArrayList();
            for (Jogadores x : jogadores) {
                lista.add(x);
                x.setPartida(partida);
            }
            Collections.shuffle(lista);
            partida.jogadores = Collections.unmodifiableList(lista);
        }
    }
    
    public synchronized static void criar(String[] jogadores) {
        if (partida == null && jogadores.length > 1 && jogadores.length < 7) {
            partida = new Partida();
            List<Jogadores> lista = new ArrayList();
            ArrayList<Integer> retirado = new ArrayList();
            
            for(int i = 0; i < jogadores.length; i++) {
                boolean repetido = false;
                int j;
                do{
                    j = rand.nextInt(Jogador.jogadores.size());
                    for(int x : retirado) {
                        if(x == j) {
                            repetido = true;
                        }
                    }
                }while(repetido);
                lista.add(Jogador.jogadores.get(j).getCor());
                Jogador.jogadores.get(j).setNick(jogadores[i]);
                Jogador.jogadores.get(j).setPartida(partida);
                retirado.add(j);
            }
            Collections.shuffle(lista);
            partida.jogadores = Collections.unmodifiableList(lista);
        }
    }
    
    //Template Method
    public void iniciar() {
        partida.sortearTerritorios();
        partida.sortearObjetivos();
        partida.iniciarPrimeiraRodada();
    }

    public void encerrar() {
        partida = null;
    }

    private void sortearTerritorios() {
        
    }

    private void sortearObjetivos() {
        ArrayList<Objetivo> objetivos = new ArrayList();
        objetivos.addAll(Arrays.asList(Objetivo.values()));
    }

    private void iniciarPrimeiraRodada() {

    }

    private void proximo() {

    }

    public synchronized static Partida getPartida() {
        if (partida != null) {
            return partida;
        } else {
            return new Partida();
        }
    }

    @Override
    public void atualizar(Sujeito sujeito) {
        Jogador j = (Jogador) sujeito;
        if (j.getEstado().getEtapa() == Jogando.FALSO) {
            proximo();
        }
    }

    public Jogador jogador(Jogadores jogador) {
        for (Jogadores x : jogadores) {
            if (x.equals(jogador)) {
                return jogador.getJogador();
            }
        }
        return null;
    }

}
