package trabalhoIPOO.view;

import javax.swing.*;

public class Main {

    public static final String menu = """
              1 - Menu Adm\s
              2 - Menu Cliente\s
              3 - Sair\s
            """;

    public static void main(String[] args) {
        String opcao = "";
        while (!opcao.equals("3")) {
            opcao = JOptionPane.showInputDialog(menu);
            switch (opcao) {
                case "1":
                    MenuAdm.menuAdm();
                    break;
                case "2":
                    MenuCliente.menuClienteDeslogado();
                    break;
                case "3":
                    break;
            }
        }
    }
}
