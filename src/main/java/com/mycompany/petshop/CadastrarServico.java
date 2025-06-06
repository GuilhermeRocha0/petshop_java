/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.petshop;

import com.mycompany.petshop.model.Persistencia;
import com.mycompany.petshop.model.Servico;
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class CadastrarServico extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarServico1
     */
    public CadastrarServico() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTituloPagina = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JSpinner();
        lblTempoEstimdo = new javax.swing.JLabel();
        lblTempoEstimado = new javax.swing.JSpinner();
        btEnviar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        lblTituloPagina.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloPagina.setText("Cadastrar Serviço");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNome.setText("Serviço:");

        txtNome.setToolTipText("");

        lblPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco.setText("Valor do Serviço:");

        txtPreco.setModel(new javax.swing.SpinnerNumberModel(0.1f, 0.1f, null, 1.0f));

        lblTempoEstimdo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTempoEstimdo.setText("Tempo estimado (em minutos):");

        lblTempoEstimado.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btEnviar.setText("Cadastrar Serviço");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblTituloPagina))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTempoEstimdo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtNome)
                            .addComponent(txtPreco)
                            .addComponent(lblTempoEstimado))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPagina)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempoEstimdo)
                    .addComponent(lblTempoEstimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btEnviar))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Método acionado ao clicar em 'Enviar'
    // Esse método é responsável em adquirir os dados inseridos pelo usuário, valida-los, e se forem válidos, chamar o método cadastrarServico() de Persistencia para salvar o serviço
    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        String nome = txtNome.getText().trim();

        float preco = ((Number) txtPreco.getValue()).floatValue();
        int tempo = (int) lblTempoEstimado.getValue();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o nome do serviço.");
            return;
        }

        if (preco <= 0) {
            JOptionPane.showMessageDialog(this, "O preço deve ser maior que zero.");
            return;
        }

        if (tempo <= 0) {
            JOptionPane.showMessageDialog(this, "O tempo estimado deve ser maior que zero.");
            return;
        }

        Servico novo = new Servico(nome, preco, tempo);
        Persistencia.cadastrarServico(novo);
        JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso! ID: " + novo.getId());

        txtNome.setText("");
        txtPreco.setValue(0.1f);
        lblTempoEstimado.setValue(0);
    }//GEN-LAST:event_btEnviarActionPerformed

    // Método acionado ao clicar em 'Fechar'
    // Esse método fecha essa página
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JSpinner lblTempoEstimado;
    private javax.swing.JLabel lblTempoEstimdo;
    private javax.swing.JLabel lblTituloPagina;
    private javax.swing.JTextField txtNome;
    private javax.swing.JSpinner txtPreco;
    // End of variables declaration//GEN-END:variables
}
