public class Main {
    public static void main(String[] args) {
        JogoCartas jogo = new JogoCartas();

        // Adicionar jogadores
        jogo.adicionarJogador("Alice");
        jogo.adicionarJogador("Bob");

        // Embaralhar o baralho
        jogo.embaralhar();

        // Distribuir 5 cartas para cada jogador
        jogo.distribuirCartas(5);

        // Jogar uma carta
        Jogador alice = jogo.getJogadores().get(0);
        alice.exibirMao();

        Carta cartaParaJogar = alice.getMao().get(0);
        jogo.jogarCarta(alice, cartaParaJogar);

        // Exibir a última carta jogada
        jogo.exibirUltimaCarta();
    }
}
