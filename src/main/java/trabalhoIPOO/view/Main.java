package trabalhoIPOO.view;

import trabalhoIPOO.model.Produto;
import trabalhoIPOO.repository.ProdutoRepository;
import trabalhoIPOO.repository.ProdutoRepositoryArray;

import javax.swing.*;
import java.util.Objects;

public class Main {

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
                    obtemInfoProduto(null);
                    break;
                case "2":
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice do produto que sera alterado"));
                    prod = produtoRepository.pesquisaPorId(id);
                    if (prod == null) {
                        JOptionPane.showMessageDialog(null, "ID do produto não encontrado");
                    } else {
                        obtemInfoProduto(prod);
                    }
                    break;
                case "3":
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice do produto que sera alterado"));
                    prod = produtoRepository.pesquisaPorId(id);
                    if (prod == null) {
                        JOptionPane.showMessageDialog(null, "ID do produto não encontrado");
                    } else {
                        produtoRepository.exclui(prod);
                    }
                    break;
                case "4":
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice do cadastro que sera alterado"));
                    prod = produtoRepository.pesquisaPorId(id);
                    JOptionPane.showMessageDialog(null, Objects.requireNonNullElse(prod, "ID do produto não encontrado"));
                    break;
                case "5":
                    StringBuilder resposta = new StringBuilder();
                    for (Produto produto : produtoRepository.listaTodos()) {
                        resposta.append(produto).append("\n");
                    }
                    if (resposta.length() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum produto encontrado");
                    } else {
                        JOptionPane.showMessageDialog(null, resposta.toString());
                    }
                    break;
                case "6":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção valida ");
            }
        }
    }

    private static void obtemInfoProduto(Produto prod) {

        ProdutoDialog dialog = new ProdutoDialog(null, true, produtoRepository, prod);
        dialog.setResizable(false);
        dialog.setVisible(true);
    }

    public static ProdutoRepository getProdutoRepository(){
        return new ProdutoRepositoryArray(100);
    }
}
