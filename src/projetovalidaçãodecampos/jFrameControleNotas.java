/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovalidaçãodecampos;

import javax.swing.JOptionPane;

/**
 *
 * @author 277111
 */
public class jFrameControleNotas extends javax.swing.JFrame {

    /**
     * Creates new form jFrameControleNotas
     */
    public jFrameControleNotas() {
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

        jPanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMatri = new javax.swing.JLabel();
        jLabelNota1 = new javax.swing.JLabel();
        jLabelNota2 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldMatri = new javax.swing.JTextField();
        jTextFieldNota1 = new javax.swing.JTextField();
        jTextFieldNota2 = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonResultado = new javax.swing.JButton();
        jLabelSituacao = new javax.swing.JLabel();
        jTextFieldSituacao = new javax.swing.JTextField();
        jLabelError2 = new javax.swing.JLabel();
        jLabelError3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CONTROLE DE NOTAS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetovalidaçãodecampos/icons8-resultados-do-teste-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addGap(116, 116, 116))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabelMatri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMatri.setText("Matrícula");

        jLabelNota1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNota1.setText("1º Bimestre");

        jLabelNota2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNota2.setText("2º Bimestre");

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTotal.setText("Total");

        jTextFieldMatri.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldMatri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldNota1.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldNota1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldNota2.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldNota2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetovalidaçãodecampos/icons8-boletim-50.png"))); // NOI18N
        jButtonResultado.setText("RESULTADO");
        jButtonResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultadoActionPerformed(evt);
            }
        });

        jLabelSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSituacao.setText("Situação");

        jTextFieldSituacao.setBackground(new java.awt.Color(255, 255, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetovalidaçãodecampos/icons8-undefined-50.png"))); // NOI18N
        jButton1.setText("LIMPAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetovalidaçãodecampos/error (1).png"))); // NOI18N
        jButtonClose.setText("   SAIR");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelMatri)
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMatri)
                            .addComponent(jTextFieldNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotal)
                            .addComponent(jLabelNota2)
                            .addComponent(jLabelNota1)
                            .addComponent(jLabelSituacao))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTotal)
                            .addComponent(jTextFieldSituacao)
                            .addComponent(jTextFieldNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelError2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jLabelError3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButtonResultado)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMatri)
                            .addComponent(jTextFieldMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNota1)
                                .addComponent(jTextFieldNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelError2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNota2)
                            .addComponent(jTextFieldNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelError3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotal)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSituacao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResultado)
                    .addComponent(jButton1)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultadoActionPerformed
        // TODO add your handling code here:
        
        if (jTextFieldMatri.getText().isEmpty() 
            || jTextFieldNota1.getText().isEmpty()
            || jTextFieldNota2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos e tente novamente");
        }
        
        else {
            
        String matricula, converter, erroO;
        Double nota1, nota2, total;
        
        matricula = jTextFieldMatri.getText();
        nota1 = Double.valueOf(jTextFieldNota1.getText());
        nota2 = Double.valueOf(jTextFieldNota2.getText());
        erroO = "* Dados obrigatórios tente novamente. ";
        
        total = nota1 + nota2;
        
        converter = String.valueOf(total);
        
        jTextFieldTotal.setText(converter);
        
        if(nota1 < 0 || nota1 > 100){
            jLabelError2.setText(erroO);
        }
        
        if (nota2 < 0 || nota2 > 100){
            jLabelError3.setText(erroO);
        }
        
        if(total >= 60){
            jTextFieldSituacao.setText("Aprovado");
        }
        
        else{
            jTextFieldSituacao.setText("Reprovado");
        }
                
    }
        
    }//GEN-LAST:event_jButtonResultadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jTextFieldMatri.setText("");
        jTextFieldNota1.setText("");
        jTextFieldNota2.setText("");
        jTextFieldSituacao.setText("");
        jTextFieldTotal.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(jFrameControleNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameControleNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameControleNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameControleNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameControleNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelError2;
    private javax.swing.JLabel jLabelError3;
    private javax.swing.JLabel jLabelMatri;
    private javax.swing.JLabel jLabelNota1;
    private javax.swing.JLabel jLabelNota2;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldMatri;
    private javax.swing.JTextField jTextFieldNota1;
    private javax.swing.JTextField jTextFieldNota2;
    private javax.swing.JTextField jTextFieldSituacao;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
