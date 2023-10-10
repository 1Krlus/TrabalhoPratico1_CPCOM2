/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.PacienteController;
import controller.PlanoSaudeController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Paciente;
import model.bean.PlanoSaude;

/**
 *
 * @author Carlos
 */
public class PacienteView extends javax.swing.JFrame {

    PacienteController pacienteController = new PacienteController();

    public PacienteView() {
        initComponents();
        DefaultTableModel tabelaPacientes = (DefaultTableModel) jTablePacientes.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTítulo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDtNasc = new javax.swing.JFormattedTextField();
        jComboBoxPlanos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelTítulo.setText("Cadastro de Pacientes");

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF:");

        jLabelDataNascimento.setText("Data de Nascimento:");

        jLabelTelefone.setText("Telefone:");

        jLabelEndereco.setText("Endereço:");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Plano de Saúde:");

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "endereco", "Telefone", "Data de Nascimento", "Plano de Saúde"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTítulo)
                .addGap(400, 400, 400))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDataNascimento)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEndereco))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAtualizar)
                                .addGap(206, 206, 206)
                                .addComponent(jButtonRemover)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar))
                            .addComponent(jComboBoxPlanos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelTítulo)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCPF))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTelefone)
                                    .addComponent(jFormattedTextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDataNascimento)))))
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void listaPacientes() {
        DefaultTableModel tabelaPacientes = (DefaultTableModel) jTablePacientes.getModel();
        tabelaPacientes.setNumRows(0);

        for (Paciente p : pacienteController.read()) {
            tabelaPacientes.addRow(new Object[]{
                p.getIdPaciente(),
                p.getNome(),
                p.getCpf(),
                p.getEndereco(),
                p.getTelefone(),
                p.getDataNascimento(),
                p.getPlanoSaude().getNome()
            });
        }
    }

    public void listaPlanos() {
        PlanoSaudeController pSaudeController = new PlanoSaudeController();

        for (PlanoSaude ps : pSaudeController.read()) {
            jComboBoxPlanos.addItem(ps);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        this.listaPacientes();
        this.listaPlanos();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja adicionar este novo paciente ao sistema?",
                "Confirmação de adição!", JOptionPane.YES_NO_CANCEL_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            if (jTextFieldNome.getText().isEmpty() || jTextFieldEndereco.getText().isEmpty() || jFormattedTextFieldCPF.getText().isEmpty()
                    || jFormattedTextFieldDtNasc.getText().isEmpty() || jFormattedTextFieldFone.getText().isEmpty() || jComboBoxPlanos.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos", "Erro: Informações Incompletas!", JOptionPane.WARNING_MESSAGE);
            } else {
                if (jComboBoxPlanos.getSelectedItem() != null
                        && !jTextFieldNome.getText().equals("")
                        && !jFormattedTextFieldCPF.getText().equals("")
                        && !jTextFieldEndereco.getText().equals("")
                        && !jFormattedTextFieldFone.getText().equals("")
                        && !jFormattedTextFieldDtNasc.getText().equals("")) {

                    PlanoSaude pSaude = (PlanoSaude) jComboBoxPlanos.getSelectedItem();

                    if (pacienteController.create(jTextFieldNome.getText(), jFormattedTextFieldCPF.getText(), jTextFieldEndereco.getText(),
                            jFormattedTextFieldFone.getText(), jFormattedTextFieldDtNasc.getText(), pSaude)) {
                        JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Não foi possível realizar o cadastro!", "Erro ao realizar o cadastro!",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    jTextFieldNome.setText("");
                    jTextFieldEndereco.setText("");
                    jTextFieldBuscar.setText("");
                    jFormattedTextFieldCPF.setText("");
                    jFormattedTextFieldDtNasc.setText("");
                    jFormattedTextFieldFone.setText("");
                }
            }
        } else if (confirma == JOptionPane.CANCEL_OPTION) {
            jTextFieldNome.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldBuscar.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jFormattedTextFieldFone.setText("");
        }

        this.listaPacientes();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
        // TODO add your handling code here:

        if (jTablePacientes.getSelectedRow() != -1) {
            jTextFieldNome.setText((String) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 1));
            jFormattedTextFieldCPF.setText((String) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 2));
            jTextFieldEndereco.setText((String) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 3));
            jFormattedTextFieldFone.setText((String) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 4));
            jFormattedTextFieldDtNasc.setText((String) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 5));
            String plano = (String) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 6);

            for (int i = 0; i < jComboBoxPlanos.getItemCount(); i++) {
                PlanoSaude ps = (PlanoSaude) jComboBoxPlanos.getItemAt(i);

                if (ps.getNome().equals(plano)) {
                    jComboBoxPlanos.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jTablePacientesMouseClicked

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados deste paciente no sistema ?",
                "Confirmação de atualização!", JOptionPane.YES_NO_CANCEL_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            if (jTextFieldNome.getText().isEmpty() || jTextFieldEndereco.getText().isEmpty()
                    || jFormattedTextFieldCPF.getText().isEmpty() || jFormattedTextFieldDtNasc.getText().isEmpty() || jFormattedTextFieldFone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro: Informações incompletas!", JOptionPane.WARNING_MESSAGE);
            } else {
                if (jTablePacientes.getSelectedRow() != -1) {
                    PlanoSaude pSaude = (PlanoSaude) jComboBoxPlanos.getSelectedItem();
                    pacienteController.update(
                            (int) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 0),
                            jTextFieldNome.getText(),
                            jFormattedTextFieldCPF.getText(),
                            jTextFieldEndereco.getText(),
                            jFormattedTextFieldFone.getText(),
                            jFormattedTextFieldDtNasc.getText(),
                            pSaude
                    );

                    this.listaPacientes();

                    JOptionPane.showMessageDialog(this, "Os dados foram atualizados com sucesso!",
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                    jTextFieldNome.setText("");
                    jTextFieldEndereco.setText("");
                    jFormattedTextFieldCPF.setText("");
                    jFormattedTextFieldDtNasc.setText("");
                    jFormattedTextFieldFone.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione um paciente para atualizar os dados!",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (confirma == JOptionPane.CANCEL_OPTION) {
            jTextFieldNome.setText("");
            jTextFieldEndereco.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jFormattedTextFieldFone.setText("");
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // TODO add your handling code here:

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja remover este paciente do sistema?",
                "Confirmação de exclusão!", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            if (jTablePacientes.getSelectedRow() != -1) {
                pacienteController.delete((int) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 0));

                this.listaPacientes();

                JOptionPane.showMessageDialog(this, "O paciente foi removido do sistema com sucesso!",
                        "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

                jTextFieldNome.setText("");
                jTextFieldEndereco.setText("");
                jFormattedTextFieldCPF.setText("");
                jFormattedTextFieldDtNasc.setText("");
                jFormattedTextFieldFone.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um paciente para remover do sistema!",
                        "Nenhum paciente foi selecionado!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            jTextFieldNome.setText("");
            jTextFieldEndereco.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jFormattedTextFieldFone.setText("");
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tabelaPacientes = (DefaultTableModel) jTablePacientes.getModel();
        tabelaPacientes.setNumRows(0);

        for (Paciente p : pacienteController.search(jTextFieldBuscar.getText())) {
            tabelaPacientes.addRow(new Object[]{
                p.getIdPaciente(),
                p.getNome(),
                p.getCpf(),
                p.getEndereco(),
                p.getTelefone(),
                p.getDataNascimento(),
                p.getPlanoSaude()
            });
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<Object> jComboBoxPlanos;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTítulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
