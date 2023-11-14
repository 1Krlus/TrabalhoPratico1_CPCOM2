/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.MedicoController;
import javax.swing.JOptionPane;
import tablemodel.MedicoTableModel;

/**
 *
 * @author Carlos
 */
public class MedicoView extends javax.swing.JFrame {

    MedicoTableModel tableModel;
    MedicoController medicoController = new MedicoController();

    public MedicoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldCrm = new javax.swing.JTextField();
        jTextFieldEspecialidade = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jComboBoxBuscar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cadastro de Médicos");

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("CPF:");

        jLabel6.setText("CRM:");

        jLabel7.setText("Especialidade:");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-adicionar-24.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-atualizar-24.png"))); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-excluir-24.png"))); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jTableMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Endereço", "Telefone", "CRM", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });

        jComboBoxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Nome", "CPF", "CRM" }));
        jComboBoxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jButtonAdicionar)
                                .addGap(128, 128, 128)
                                .addComponent(jButtonAtualizar)
                                .addGap(120, 120, 120)
                                .addComponent(jButtonRemover))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(197, 197, 197)
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonRemover))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void listaMedicos() {
        tableModel = new MedicoTableModel(medicoController.read());
        jTableMedicos.setModel(tableModel);
    }
    
    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:

        int confirma = JOptionPane.showConfirmDialog(null,
                "Deseja adicionar este novo médico ao sistema?",
                "Confirmação de adição!",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            if (jTextFieldNome.getText().isEmpty()
                    || jTextFieldEndereco.getText().isEmpty()
                    || jTextFieldEspecialidade.getText().isEmpty()
                    || jTextFieldCrm.getText().isEmpty()
                    || jFormattedTextFieldCpf.getText().isEmpty()
                    || jFormattedTextFieldTelefone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Preencha todos os campos!",
                        "Erro: Informações Incompletas",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                if (medicoController.create(jTextFieldNome.getText(),
                        jFormattedTextFieldCpf.getText(),
                        jTextFieldEndereco.getText(),
                        jFormattedTextFieldTelefone.getText(),
                        jTextFieldCrm.getText(),
                        jTextFieldEspecialidade.getText())) {
                    JOptionPane.showMessageDialog(this,
                            "Cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Não foi possível realizar o cadastro!",
                            "Erro ao realizar o cadastro!",
                            JOptionPane.ERROR_MESSAGE);
                }

                jTextFieldCrm.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldEspecialidade.setText("");
                jTextFieldNome.setText("");
                jFormattedTextFieldCpf.setText("");
                jFormattedTextFieldTelefone.setText("");
            }
        } else if (confirma == JOptionPane.CANCEL_OPTION) {
            jTextFieldCrm.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldEspecialidade.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCpf.setText("");
            jFormattedTextFieldTelefone.setText("");
        }

        this.listaMedicos();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        this.listaMedicos();
    }//GEN-LAST:event_formWindowOpened

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
        // TODO add your handling code here:

        if (jTableMedicos.getSelectedRow() != -1) {
            jTextFieldNome.setText((String) jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 0));
            jFormattedTextFieldCpf.setText((String) jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 1));
            jTextFieldEndereco.setText((String) jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 2));
            jFormattedTextFieldTelefone.setText((String) jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 3));
            jTextFieldCrm.setText((String) jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 4));
            jTextFieldEspecialidade.setText((String) jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 5));
        }
    }//GEN-LAST:event_jTableMedicosMouseClicked

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:

        int confirma = JOptionPane.showConfirmDialog(null,
                "Deseja atualizar os dados deste médico no sistema ?",
                "Confirmação de atualização!",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            if (jTextFieldNome.getText().isEmpty() 
                    || jTextFieldEndereco.getText().isEmpty() 
                    || jTextFieldEspecialidade.getText().isEmpty()
                    || jTextFieldCrm.getText().isEmpty() 
                    || jFormattedTextFieldCpf.getText().isEmpty() 
                    || jFormattedTextFieldTelefone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Preencha todos os campos!",
                        "Erro: Informações Incompletas",
                        JOptionPane.ERROR_MESSAGE);

            } else {
                if (jTableMedicos.getSelectedRow() != -1) {
                    medicoController.update(
                            (int) jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 0),
                            jTextFieldNome.getText(),
                            jFormattedTextFieldCpf.getText(),
                            jTextFieldEndereco.getText(),
                            jFormattedTextFieldTelefone.getText(),
                            jTextFieldCrm.getText(),
                            jTextFieldEspecialidade.getText()
                    );

                    this.listaMedicos();

                    JOptionPane.showMessageDialog(this,
                            "Os dados foram atualizados com sucesso!",
                            "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

                    jTextFieldNome.setText("");
                    jFormattedTextFieldCpf.setText("");
                    jTextFieldEndereco.setText("");
                    jFormattedTextFieldTelefone.setText("");
                    jTextFieldCrm.setText("");
                    jTextFieldEspecialidade.setText("");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Selecione um médico para atualizar os dados!",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (confirma == JOptionPane.CANCEL_OPTION) {
            jTextFieldNome.setText("");
            jFormattedTextFieldCpf.setText("");
            jTextFieldEndereco.setText("");
            jFormattedTextFieldTelefone.setText("");
            jTextFieldCrm.setText("");
            jTextFieldEspecialidade.setText("");
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // TODO add your handling code here:

        int confirma = JOptionPane.showConfirmDialog(null,
                "Deseja remover este médico do sistema?", 
                "Alerta de exclusão!", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            if (jTableMedicos.getSelectedRow() != -1) {
                medicoController.delete((int) jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 0));

                this.listaMedicos();

                JOptionPane.showMessageDialog(this,
                        "O médico foi removido do sistema com sucesso!",
                        "Sucesso!",
                        JOptionPane.INFORMATION_MESSAGE);

                jTextFieldNome.setText("");
                jTextFieldCrm.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldEspecialidade.setText("");
                jFormattedTextFieldCpf.setText("");
                jFormattedTextFieldTelefone.setText("");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Selecione um medico para remover do sistema!",
                        "Nenhum médico foi selecionado!",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            jTextFieldNome.setText("");
            jTextFieldCrm.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldEspecialidade.setText("");
            jFormattedTextFieldCpf.setText("");
            jFormattedTextFieldTelefone.setText("");
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jComboBoxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBuscarActionPerformed
        // TODO add your handling code here:
        
        jTextFieldBuscar.setText("");
        
        if(jComboBoxBuscar.getSelectedIndex() == 0) {
            tableModel = new MedicoTableModel(medicoController.read());
            jTableMedicos.setModel(tableModel);
        }
        jTextFieldBuscar.requestFocus();
    }//GEN-LAST:event_jComboBoxBuscarActionPerformed

    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        // TODO add your handling code here:
        
        String chave = jTextFieldBuscar.getText();
        
        if (evt.getKeyChar() != '\b') {
            chave = chave + evt.getKeyChar();
        }
        
        switch (jComboBoxBuscar.getSelectedIndex()) {
            case 1:
                tableModel = new MedicoTableModel(medicoController.searchMedicoNome(chave));
                break;
            case 2:
                tableModel = new MedicoTableModel(medicoController.searchMedicoCPF(chave));
                break;
            case 3: 
                tableModel = new MedicoTableModel(medicoController.searchMedicoCRM(chave));
                break;
        }
        jTableMedicos.setModel(tableModel);
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<String> jComboBoxBuscar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCrm;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEspecialidade;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
