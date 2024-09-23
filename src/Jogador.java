import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> mao; // Cartas na mão do jogador

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public void adicionarCarta(Carta carta) {
        mao.add(carta);
    }

    public void removerCarta(Carta carta) {
        mao.remove(carta);
    }

    public void exibirMao() {
        System.out.println("Mão do jogador " + nome + ":");
        for (Carta carta : mao) {
            System.out.println(carta);
        }
    }
}
