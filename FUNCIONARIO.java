FUNCIONARIO
public class Funcionario {
    private static int idCounter = 1;
    private int id;

    public Funcionario() {
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public void atenderCliente(Cliente cliente) {
        System.out.println("Funcionario " + id + " atendendo o Cliente " + cliente.getId());
        try {
            Thread.sleep(cliente.getTempoAtendimento() * 1000); // tempo de atendimento em segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long tempoSaidaFila = System.currentTimeMillis();
        long tempoEspera = (tempoSaidaFila - cliente.getTempoEntradaFila()) / 1000; // tempo de espera em segundos
        System.out.println("Cliente " + cliente.getId() + " atendido. Tempo de espera: " + tempoEspera + " segundos.");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                '}';
    }
}