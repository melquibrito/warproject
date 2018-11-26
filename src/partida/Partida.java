package partida;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import jogadores.Jogador;
import jogadores.Jogadores;
import jogadores.estado.Estados.Jogando;
import territorios.Territorios;
import partida.objetivos.Objetivo;

public final class Partida implements Observador {

    static Random rand = new Random();
    private volatile static Partida partida;
    public List<Jogadores> jogadores;
    private Jogador jogador;
    private int tropasADistribuir = 0;
    private boolean primeiraRodada = false;

    private Partida() {
    }
    
    
    public static Partida getPartida() {
        if(partida != null) {
            return partida;
        }else {
            criar();
            return partida;
        }
    }
    
    public synchronized static void criar() {
        if(partida == null) {
            partida = new Partida();
            List<Jogadores> lista = new ArrayList();
            for(Jogador x : Jogador.jogadores) {
                lista.add(x.getCor());
            }
            Collections.shuffle(lista);
            partida.jogadores = Collections.unmodifiableList(lista);
        }
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
        }else {
            if(jogadores.length < 2) {
                System.out.println("Quantidade de jogadores insuficienten para iniciar uma partida!");
            }
            if(jogadores.length > 6) {
                System.out.println("A partida não pode conter mais do que seis jogadores!");
            }
            if(partida != null) {
                System.out.println("A partida já foi criada! Encerre esta partida para começar uma outra...");
            }
        }
    }

    public synchronized static void criar(String[] jogadores) {
        if (partida == null && jogadores.length > 1 && jogadores.length < 7) {
            partida = new Partida();

            List<Jogadores> lista = new ArrayList();
            List<Jogadores> aSortear = new ArrayList();

            for (Jogador x : Jogador.jogadores) {
                aSortear.add(x.getCor());
            }

            for (String j : jogadores) {
                Jogadores sorteado = aSortear.get(rand.nextInt(aSortear.size()));
                lista.add(sorteado);
                sorteado.getJogador().setNick(j);
                sorteado.getJogador().setPartida(partida);
                aSortear.remove(sorteado);
            }
            Collections.shuffle(lista);
            partida.jogadores = Collections.unmodifiableList(lista);
        }else {
            if(jogadores.length < 2) {
                System.out.println("Quantidade de jogadores insuficienten para iniciar uma partida!");
            }
            if(jogadores.length > 6) {
                System.out.println("A partida não pode conter mais do que seis jogadores!");
            }
            if(partida != null) {
                System.out.println("A partida já foi criada! Encerre esta partida para começar uma outra...");
            }
        }
    }

    //Template Method
    public void iniciar() {
        if (partida != null) {
            System.out.println("Partida Iniciada!\n");
            partida.sortearTerritorios();
            partida.sortearObjetivos();
            partida.jogador = jogadores.get(0).getJogador();
            partida.iniciarPrimeiraRodada();
        }

    }

    public void encerrar() {
        partida = null;
        System.out.println("Partida Encerrada!");
    }

    private void sortearTerritorios() {
        Territorios.resetar();
        ArrayList<Territorios> aSortear = new ArrayList();
        aSortear.addAll(Arrays.asList(Territorios.values()));

        ArrayList<Jogadores> jog = new ArrayList();

        for (Jogadores x : partida.jogadores) {
            jog.add(x);
        }

        int quantidade = aSortear.size() / jog.size();

        for (Jogadores j : jog) {
            for (int i = 0; i < quantidade; i++) {
                Territorios sorteado = aSortear.get(rand.nextInt(aSortear.size()));
                sorteado.setOcupante(j.getJogador());
                aSortear.remove(sorteado);
            }
        }

        if (!aSortear.isEmpty()) {
            Territorios sorteado = aSortear.get(rand.nextInt(aSortear.size()));
            sorteado.setOcupante(partida.jogadores.get(partida.jogadores.size() - 1).getJogador());
            aSortear.remove(sorteado);
            aSortear.get(aSortear.size() - 1).setOcupante(partida.jogadores.get(partida.jogadores.size() - 2).getJogador());
        }

        System.out.println("\nDISTRIBUIÇÃO ALEATÓRIA:\n");
        for (Territorios x : Territorios.values()) {
            System.out.printf("%-20s %-25s %s%d%n", x, x.getOcupante().getCor(), "Tropas: ", x.getTropas());
        }
        System.out.println();
        for (Jogadores x : partida.jogadores) {
            System.out.println(x + ": " + Territorios.ocupando(x.getJogador()));
        }

    }

    private void sortearObjetivos() {
        ArrayList<Objetivo> objetivos = Objetivo.getTodosExcetoOsDeDestruir();

        ArrayList<Objetivo> objetivosAManter = new ArrayList();

        for (Objetivo y : Objetivo.getObjetivosDeDestruirOponentes()) {
            for (Jogadores x : jogadores) {
                if (x.equals(y.getInimigo())) {
                    objetivosAManter.add(y);
                }
            }
        }

        for (Objetivo x : objetivosAManter) {
            objetivos.add(x);
        }

        for (int i = 0; i < jogadores.size(); i++) {
            Objetivo sorteado = null;
            do {
                sorteado = objetivos.get(rand.nextInt(objetivos.size()));
            } while (sorteado.getInimigo() == jogadores.get(i));
            jogadores.get(i).getJogador().setObjetivo(sorteado);
            objetivos.remove(sorteado);
        }

    }

    private void iniciarPrimeiraRodada() {
        primeiraRodada = true;
    }
    
    private int getNovasTropas() {
        if(partida != null) {
            int t = Territorios.ocupando(jogador)/2;
            
        }
        return 0;
    }
    
    private void proximo() {
        if(!Objetivo.checar(jogador)){
            int j = jogadores.indexOf(jogador) + 1;
            if(j >= jogadores.size()) {
                jogador = jogadores.get(0).getJogador();
            }else {
                jogador = jogadores.get(j).getJogador();
                if(Objetivo.checar(jogador)){
                    encerrar();
                    System.out.println("O jogador " + jogador + " venceu o jogo!");
                    System.out.println("O objetivo de " + jogador.getCor() + " era " + jogador.getObjetivo() + ".");
                }
            }
        }else {
            System.out.println("O jogador " + jogador + " venceu o jogo!");
            System.out.println("O objetivo de " + jogador.getCor() + " era " + jogador.getObjetivo() + ".");
            encerrar();
        }
        
    }

    @Override
    public void atualizar(Sujeito sujeito) {
        Jogador j = (Jogador) sujeito;
        if (j.getEstado().getEtapa() == Jogando.FALSO) {
            proximo();
        }
    }

}
