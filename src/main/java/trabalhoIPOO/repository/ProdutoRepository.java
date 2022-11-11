package trabalhoIPOO.repository;

import trabalhoIPOO.model.Produto;

import java.util.List;

public interface ProdutoRepository {

    void insere(Produto produto);

    void altera(Produto produto);

    void exclui(Produto produto);

    Produto pesquisaPorId(int id);

    List<Produto> listaTodos();

}


