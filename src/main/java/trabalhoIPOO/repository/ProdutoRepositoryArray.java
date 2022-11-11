package trabalhoIPOO.repository;
import trabalhoIPOO.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositoryArray implements ProdutoRepository {


	private final List<Produto> produtos;
	
	public ProdutoRepositoryArray(int tamanho) {
		this.produtos = new ArrayList<>(tamanho);
	}
	
	public void insere(Produto produto) {
		this.produtos.add(produto);
	}

	public void altera(Produto produto) {
		for (Produto p: produtos) {
			if (p.getId() == produto.getId()) {
				p.setId(produto.getId());
				p.setNome(produto.getNome());
				p.setDescricao(produto.getDescricao());
				p.setCategoria(produto.getCategoria());
				p.setPreco(produto.getPreco());
			}
		}
	}

	/*Usei sugestão do IntelliJ para simplificar o loop*/
	public void exclui(Produto produto) {
		produtos.removeIf(p -> p.getId() == produto.getId());
	}

	public Produto pesquisaPorId(int id) {
		for (Produto p : produtos) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	public List<Produto> listaTodos() {
		return this.produtos;
	}
}
