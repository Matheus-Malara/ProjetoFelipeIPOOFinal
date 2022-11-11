package trabalhoIPOO.view;

import trabalhoIPOO.model.Produto;
import trabalhoIPOO.repository.ProdutoRepository;
import trabalhoIPOO.repository.ProdutoRepositoryArray;

import javax.swing.*;

public class Principal {

    public static final String menu = """
              1 - Inserir Produto\s
              2 - Alterar Produto\s
              3 - Excluir Produto\s
              4 - Pesquisar por Id\s
              5 - Listar Produto\s
              6 - Sair\s
            """;

    private static final ProdutoRepository produtoRepository = getProdutoRepository();

    public static void main(String[] args) {
        String opcao = "";
        while (!opcao.equals("6")) {
            Produto prod;
            opcao = JOptionPane.showInputDialog(menu);
            switch (opcao) {
                case "1":
                    prod = obtemInfoProduto();
                    produtoRepository.insere(prod);
                    break;
                case "2":
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice do produto que sera alterado"));
                    prod = obtemInfoProduto();
                    prod.setId(id);
                    produtoRepository.altera(prod);
                    break;
                case "3":
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice do produto que sera alterado"));
                    prod = new Produto();
                    prod.setId(id);
                    produtoRepository.exclui(prod);
                    break;
                case "4":
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice do cadastro que sera alterado"));
                    prod = produtoRepository.pesquisaPorId(id);
                    JOptionPane.showMessageDialog(null, prod);
                    break;
                case "5":
                    StringBuilder resposta = new StringBuilder();
                    for (Produto produto : produtoRepository.listaTodos()) {
                        if (produto != null)
                            resposta.append(produto).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, resposta.toString());
                    break;
                case "6":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção valida ");
            }
        }
    }

    private static Produto obtemInfoProduto() {
        Produto p = new Produto();
        p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id")));
        p.setNome(JOptionPane.showInputDialog("Digite o nome"));
        p.setDescricao(JOptionPane.showInputDialog("Digite a descricao"));
        p.setCategoria(JOptionPane.showInputDialog("Digite a categoria"));
        p.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Digite o preco")));
        return p;
    }

    public static ProdutoRepository getProdutoRepository(){
        return new ProdutoRepositoryArray(100);
    }
}
