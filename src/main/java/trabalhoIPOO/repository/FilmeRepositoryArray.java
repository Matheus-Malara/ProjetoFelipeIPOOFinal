package trabalhoIPOO.repository;

import trabalhoIPOO.model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FilmeRepositoryArray implements FilmeRepository {

    private final List<Filme> filmes;

    public FilmeRepositoryArray() {
        this.filmes = new ArrayList<>();
    }

    public void insere(Filme filme) {
        this.filmes.add(filme);
    }

    public void altera(Filme filme, String nomeFilme) {
        for (Filme filmeAltera : filmes) {
            if (Objects.equals(filmeAltera.getNome(), nomeFilme)) {
                filmeAltera.setNome(filme.getNome());
                filmeAltera.setDescricao(filme.getDescricao());
                filmeAltera.setIdioma(filme.getIdioma());
                filmeAltera.setDuracao(filme.getDuracao());
            }
        }
    }

    /*Usei sugestão do IntelliJ para simplificar o loop*/
    public void exclui(Filme filme) {
        filmes.removeIf(p -> Objects.equals(p.getNome(), filme.getNome()));
    }

    public Filme pesquisaPorNome(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }

    public List<Filme> listaTodos() {
        return this.filmes;
    }
}
