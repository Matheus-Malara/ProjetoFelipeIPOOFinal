package trabalhoIPOO.view;

import trabalhoIPOO.model.Cliente;
import trabalhoIPOO.repository.ClienteRepository;

import java.awt.*;

public class ClienteDialog extends javax.swing.JDialog {

    private final ClienteRepository clienteRepository;
    private final Cliente cliente;
    public ClienteDialog(Frame parent, boolean modal, ClienteRepository clienteRepository, Cliente cliente) {
        super(parent, modal);
        this.clienteRepository = clienteRepository;
        this.cliente = cliente;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();

        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        // Variables declaration - do not modify
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();

        nomeField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        senhaField = new javax.swing.JTextField();
        codClienteField = new javax.swing.JTextField();

        jLabel2.setText("Nome:");
        jLabel3.setText("Email:");
        jLabel4.setText("Senha:");
        jLabel5.setText("Cod Cliente:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel6.setText("Cadastro:");

        jButton2.setText("Salvar");
        jButton2.addActionListener(evt -> jButton2ActionPerformed());

        jButton1.setText("Cancelar");
        jButton1.addActionListener(evt -> jButton1ActionPerformed());

        nomeField.setMinimumSize(new Dimension(80, 22));
        emailField.setMinimumSize(new Dimension(80, 22));
        senhaField.setMinimumSize(new Dimension(80, 22));
        codClienteField.setMinimumSize(new Dimension(80, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator1)
                                                        .addComponent(jSeparator2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel6)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2))
                                                        .addGap(30, 30, 30)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel5))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(senhaField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(codClienteField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(22, 22, 22))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(codClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(77, Short.MAX_VALUE)))
        );

        pack();
        if (cliente != null) {
            nomeField.setText(cliente.getNome());
            emailField.setText(cliente.getEmail());
            senhaField.setText(cliente.getSenha());
            codClienteField.setText(cliente.getCodCliente());
            codClienteField.setVisible(true);
            codClienteField.setEnabled(false);
            jLabel5.setVisible(true);
        } else {
            codClienteField.setVisible(false);
            jLabel5.setVisible(false);
        }
    }


    private void jButton2ActionPerformed() {
        Cliente clienteAdd = new Cliente();
        clienteAdd.setNome(nomeField.getText());
        clienteAdd.setEmail(emailField.getText());
        clienteAdd.setSenha(senhaField.getText());
        clienteAdd.setCodCliente(codClienteField.getText());
            clienteRepository.cadastra(clienteAdd);
        dispose();
    }

    private void jButton1ActionPerformed() {
        dispose();
    }

    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField senhaField;
    private javax.swing.JTextField codClienteField;
    // End of variables declaration
}

