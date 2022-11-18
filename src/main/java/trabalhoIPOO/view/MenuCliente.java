package trabalhoIPOO.view;

import trabalhoIPOO.model.Cliente;
import trabalhoIPOO.model.Filme;
import trabalhoIPOO.model.Pedido;
import trabalhoIPOO.repository.ClienteRepository;
import trabalhoIPOO.repository.ClienteRepositoryArray;

import javax.swing.*;
import java.util.Random;

public class MenuCliente {
    private static Cliente clienteLogado;
    private static final ClienteRepository CLIENTE_REPOSITORY = getClienteRepository();

    public static final String menuDeslogado = """
              1 - Cadastro\s
              2 - Login\s
              3 - Sair\s
            """;

    public static final String menuLogado = """
              1 - Listar Filmes\s
              2 - Adicionar Filme ao carrinho\s
              3 - Fechar pedido e terminar compra\s
              4 - Ver Pedidos\s
              5 - Sair\s
            """;


    public static void menuClienteDeslogado() {

        String opcao = "";
        while (!opcao.equals("3")) {
            opcao = JOptionPane.showInputDialog(menuDeslogado);
            switch (opcao) {
                case "1":
                    obtemInfoCliente(null);
                    break;
                case "2":
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    String senha = JOptionPane.showInputDialog("Digite a senha:");
                    clienteLogado = CLIENTE_REPOSITORY.login(nome, senha);
                    if (clienteLogado != null) {
                        menuClienteLogado();
                    }
                    break;
                case "3":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção valida ");
            }
        }
    }

    public static void menuClienteLogado() {

        String opcao = "";
        Pedido pedido = null;
        while (!opcao.equals("5")) {
            opcao = JOptionPane.showInputDialog(menuLogado);
            switch (opcao) {
                case "1" -> {
                    StringBuilder resposta = new StringBuilder();
                    for (Filme filme : MenuAdm.getFilmeRepository().listaTodos()) {
                        resposta.append(filme).append("\n");
                    }
                    if (resposta.length() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum filme encontrado");
                    } else {
                        JOptionPane.showMessageDialog(null, resposta.toString());
                    }
                }
                case "2" -> {
                    String nomeFilme = JOptionPane.showInputDialog("Digite o nome do filme:");
                    Filme filme = MenuAdm.getFilmeRepository().pesquisaPorNome(nomeFilme);
                    if (pedido == null) {
                        pedido = new Pedido(new Random().nextInt(1000));
                        JOptionPane.showMessageDialog(null, "Item adicionado");
                    }
                    pedido.addItem(filme);
                }
                case "3" -> {
                    clienteLogado.getPedidos().add(pedido);
                    pedido = null;
                    JOptionPane.showMessageDialog(null, "Pedido fechado.");
                }
                case "4" -> {
                    StringBuilder pedidos = new StringBuilder();
                    for (Pedido showPedido : clienteLogado.getPedidos()) {
                        pedidos.append(showPedido).append("\n");
                    }
                    if (pedidos.length() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum pedido encontrado");
                    } else {
                        JOptionPane.showMessageDialog(null, pedidos.toString());
                    }
                }
                case "5" -> {
                    clienteLogado = null;
                    return;
                }
                default -> JOptionPane.showMessageDialog(null, "Digite uma opção valida ");
            }
        }
    }

    private static void obtemInfoCliente(Cliente cli) {

        ClienteDialog dialog = new ClienteDialog(null, true, CLIENTE_REPOSITORY, cli);
        dialog.setResizable(false);
        dialog.setVisible(true);
    }

    private static ClienteRepository getClienteRepository() {
        return new ClienteRepositoryArray();
    }


}