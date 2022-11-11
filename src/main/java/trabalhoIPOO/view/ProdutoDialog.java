package trabalhoIPOO.view;

import trabalhoIPOO.model.Produto;
import trabalhoIPOO.repository.ProdutoRepository;

import java.awt.*;

public class ProdutoDialog extends javax.swing.JDialog {

    private final ProdutoRepository produtoRepository;
    private final Produto prod;
    public ProdutoDialog(Frame parent, boolean modal, ProdutoRepository produtoRepository, Produto prod) {
        super(parent, modal);
        this.produtoRepository = produtoRepository;
        this.prod = prod;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        // Variables declaration - do not modify
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        descField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        categField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        precoField = new javax.swing.JTextField();

        jLabel1.setText("ID:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel6.setText("Produto:");

        jButton2.setText("Salvar");
        jButton2.addActionListener(evt -> jButton2ActionPerformed());

        jButton1.setText("Cancelar");
        jButton1.addActionListener(evt -> jButton1ActionPerformed());

        jLabel8.setText("ID:");

        idField.setMinimumSize(new java.awt.Dimension(80, 22));

        jLabel2.setText("Nome:");

        nomeField.setMinimumSize(new java.awt.Dimension(80, 22));

        jLabel3.setText("Descrição:");

        descField.setMinimumSize(new java.awt.Dimension(80, 22));

        jLabel4.setText("Categoria:");

        categField.setMinimumSize(new java.awt.Dimension(80, 22));

        jLabel5.setText("Preço:");

        precoField.setMinimumSize(new java.awt.Dimension(80, 22));

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
                                                        .addComponent(descField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel8)
                                                                .addComponent(jLabel2))
                                                        .addGap(30, 30, 30)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                                .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel5))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(categField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(precoField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel8)
                                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(descField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(categField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(precoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(77, Short.MAX_VALUE)))
        );

        pack();
        if (prod != null) {
            idField.setText(Integer.valueOf(prod.getId()).toString());
            idField.setEnabled(false);
            nomeField.setText(prod.getNome());
            descField.setText(prod.getDescricao());
            categField.setText(prod.getCategoria());
            precoField.setText(Integer.valueOf(prod.getPreco()).toString());
        } else {
            idField.setEnabled(true);
        }
    }


    private void jButton2ActionPerformed() {
        Produto p = new Produto();
        p.setId(Integer.parseInt(idField.getText()));
        p.setNome(nomeField.getText());
        p.setDescricao(descField.getText());
        p.setCategoria(categField.getText());
        p.setPreco(Integer.parseInt(precoField.getText()));
        if (prod == null) {
            produtoRepository.insere(p);
        } else {
            produtoRepository.altera(p);
        }
        dispose();
    }

    private void jButton1ActionPerformed() {
        dispose();
    }

    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField descField;
    private javax.swing.JTextField categField;
    private javax.swing.JTextField precoField;
    private javax.swing.JTextField idField;
    // End of variables declaration
}

