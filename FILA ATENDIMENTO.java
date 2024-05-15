FILA ATENDIMENTO
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class FilaAtendimento {
    private Queue<Cliente> filaClientes;
    private List<Funcionario> funcionarios;

    public FilaAtendimento(int numeroFuncionarios) {
        this.filaClientes = new LinkedList<>();
        this.funcionarios = new ArrayList<>();
        for (int i = 0; i < numeroFuncionarios; i++) {
            this.funcionarios.add(new Funcionario());
        }
    }

    public void adicionarCliente(Cliente cliente) {
        filaClientes.add(cliente);
        System.out.println("Cliente " + cliente.getId() + " entrou na fila.");
    }

    public void iniciarAtendimento() {
        while (!filaClientes.isEmpty()) {
            for (Funcionario funcionario : funcionarios) {
                if (!filaClientes.isEmpty()) {
                    Cliente cliente = filaClientes.poll();
                    funcionario.atenderCliente(cliente);
                }
            }
        }
    }

    public static void main(String[] args) {
        FilaAtendimento filaAtendimento = new FilaAtendimento(3); // 3 funcionários

        for (int i = 0; i < 10; i++) { // adicionando 10 clientes na fila
            filaAtendimento.adicionarCliente(new Cliente());
        }

        filaAtendimento.iniciarAtendimento();
    }
}