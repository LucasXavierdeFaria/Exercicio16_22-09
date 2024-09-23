import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoCartas {
    private List<Carta> baralho;
    private List<Jogador> jogadores;
    private List<Carta> pilhaDescarte;

    public JogoCartas() {
        this.baralho = new ArrayList<>();
        this.jogadores = new ArrayList<>();
        this.pilhaDescarte = new ArrayList<>();
        inicializarBaralho();
    }

    // Inicializa o baralho com cartas de exemplo (cores e valores simples)
    private void inicializarBaralho() {
        String[] cores = {"Vermelho", "Verde", "Azul", "Amarelo"};
        String[] valores = {"1", "2", "3", "Reverso", "Bloquear"};

        for (String cor : cores) {
            for (String valor : valores) {
                baralho.add(new Carta(cor, valor));
            }
        }
    }

    // Método para embaralhar o baralho
    public void embaralhar() {
        Collections.shuffle(baralho);
        System.out.println("O baralho foi embaralhado.");
    }

    // Método para adicionar um jogador ao jogo
    public void adicionarJogador(String nome) {
        jogadores.add(new Jogador(nome));
        System.out.println("Jogador " + nome + " adicionado ao jogo.");
    }

    // Método para distribuir cartas aos jogadores
    public void distribuirCartas(int numCartas) {
        for (Jogador jogador : jogadores) {
            for (int i = 0; i < numCartas; i++) {
                if (!baralho.isEmpty()) {
                    jogador.adicionarCarta(baralho.remove(0));
                }
            }
        }
        System.out.println(numCartas + " cartas distribuídas a cada jogador.");
    }

    // Método para permitir que um jogador jogue uma carta
    public void jogarCarta(Jogador jogador, Carta carta) {
        if (jogador.getMao().contains(carta)) {
            jogador.removerCarta(carta);
            pilhaDescarte.add(carta);
            System.out.println("Jogador " + jogador.getNome() + " jogou " + carta);
        } else {
            System.out.println("Carta inválida. O jogador não possui essa carta.");
        }
    }

    // Exibe a última carta jogada
    public void exibirUltimaCarta() {
        if (!pilhaDescarte.isEmpty()) {
            System.out.println("Última carta jogada: " + pilhaDescarte.get(pilhaDescarte.size() - 1));
        } else {
            System.out.println("Nenhuma carta jogada ainda.");
        }
    }
}
