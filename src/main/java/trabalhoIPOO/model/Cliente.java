package trabalhoIPOO.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class Cliente {

	private String codCliente;
    private String nome;
    private String email;
    private String senha;
    private List<Pedido> pedidos;


    public Cliente() {
        pedidos = new ArrayList<>();
    }
}
