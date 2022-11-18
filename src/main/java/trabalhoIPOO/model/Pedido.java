package trabalhoIPOO.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class Pedido {

    @Getter
    private final int idPedido;
    @Getter
    private final List<Filme> itens = new ArrayList<>();

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void addItem(Filme filme) {
        itens.add(filme);
    }

}
