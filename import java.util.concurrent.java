import java.util.concurrent.ThreadLocalRandom;

public class Cliente {
    private static int idCounter = 1;
    private int id;
    private int tempoAtendimento;
    private long tempoEntradaFila;

    public Cliente() {
        this.id = idCounter++;
        this.tempoAtendimento = ThreadLocalRandom.current().nextInt(1, 10); // tempo aleatório entre 1 e 10 minutos
        this.tempoEntradaFila = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public int getTempoAtendimento() {
        return tempoAtendimento;
    }

    public long getTempoEntradaFila() {
        return tempoEntradaFila;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", tempoAtendimento=" + tempoAtendimento +
                ", tempoEntradaFila=" + tempoEntradaFila +
                '}';
    }
}