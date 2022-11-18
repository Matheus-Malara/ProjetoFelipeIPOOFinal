package trabalhoIPOO.repository;

import trabalhoIPOO.model.Filme;

import java.util.List;

public interface FilmeRepository {

    void insere(Filme filme);

    void altera(Filme filme, String nomeFilme);

    void exclui(Filme filme);

    Filme pesquisaPorNome(String nome);

    List<Filme> listaTodos();

}


