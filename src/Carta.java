public class Carta {
    private String cor; // Ex: "Vermelho", "Verde", "Azul", "Amarelo"
    private String valor; // Ex: "1", "2", "Reverso", "Bloquear"

    public Carta(String cor, String valor) {
        this.cor = cor;
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return cor + " " + valor;
    }
}
