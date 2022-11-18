package trabalhoIPOO.repository;

import trabalhoIPOO.model.Cliente;

public interface ClienteRepository {

    void cadastra(Cliente cliente);

    Cliente login(String nome, String senha);
}
