package trabalhoIPOO.repository;
import trabalhoIPOO.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClienteRepositoryArray implements ClienteRepository {
    private final List<Cliente> clientes;

    public ClienteRepositoryArray() {
        this.clientes = new ArrayList<>();
    }

    public void cadastra(Cliente cliente) {
        cliente.setCodCliente(UUID.randomUUID().toString());
        this.clientes.add(cliente);
    }

    public Cliente login(String nome, String senha) {
        for (Cliente cli: clientes) {
            if (cli.getNome().equals(nome) && cli.getSenha().equals(senha)) {
                return cli;
            }
        }
        return null;
    }

}
