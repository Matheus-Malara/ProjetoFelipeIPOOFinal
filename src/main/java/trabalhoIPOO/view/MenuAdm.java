package trabalhoIPOO.view;

import trabalhoIPOO.model.Filme;
import trabalhoIPOO.repository.FilmeRepository;
import trabalhoIPOO.repository.FilmeRepositoryArray;

import javax.swing.*;
import java.util.Objects;

public class MenuAdm {
    public static final String menu = """
              1 - Inserir Filme\s
              2 - Alterar Filme\s
              3 - Excluir Filme\s
              4 - Pesquisar Filme por Nome\s
              5 - Listar Filmes\s
              6 - Sair\s
            """;

    private static final FilmeRepository FILME_REPOSITORY = getFilmeRepository();

    public static void menuAdm() {
        String opcao = "";
        while (!opcao.equals("6")) {
            Filme filmin;
            opcao = JOptionPane.showInputDialog(menu);
            switch (opcao) {
                case "1":
                    obtemInfoProduto(null);
                    break;
                case "2":
                    String nome = String.format(JOptionPane.showInputDialog("Digite o nome do filme que sera alterado"));
                    filmin = FILME_REPOSITORY.pesquisaPorNome(nome);
                    if (filmin == null) {
                        JOptionPane.showMessageDialog(null, "Filme não encontrado");
                    } else {
                        obtemInfoProduto(filmin);
                    }
                    break;
                case "3":
                    nome = String.format(JOptionPane.showInputDialog("Digite o nome do filme que sera alterado"));
                    filmin = FILME_REPOSITORY.pesquisaPorNome(nome);
                    if (filmin == null) {
                        JOptionPane.showMessageDialog(null, "Filme não encontrado");
                    } else {
                        FILME_REPOSITORY.exclui(filmin);
                    }
                    break;
                case "4":
                    nome = String.format(JOptionPane.showInputDialog("Digite o nome do cadastro que sera alterado"));
                    filmin = FILME_REPOSITORY.pesquisaPorNome(nome);
                    JOptionPane.showMessageDialog(null, Objects.requireNonNullElse(filmin, "filme não encontrado"));
                    break;
                case "5":
                    StringBuilder resposta = new StringBuilder();
                    for (Filme filme : FILME_REPOSITORY.listaTodos()) {
                        resposta.append(filme).append("\n");
                    }
                    if (resposta.length() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum filme encontrado");
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

    private static void obtemInfoProduto(Filme prod) {

        ProdutoDialog dialog = new ProdutoDialog(null, true, FILME_REPOSITORY, prod);
        dialog.setResizable(false);
        dialog.setVisible(true);
    }

    public static FilmeRepository getFilmeRepository() {
        if (FILME_REPOSITORY == null) {
            return new FilmeRepositoryArray();
        }
        return FILME_REPOSITORY;
    }
}
