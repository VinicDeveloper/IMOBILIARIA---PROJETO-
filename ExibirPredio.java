/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ExibirPredio extends javax.swing.JFrame {

    /**
     * Creates new form ExibirPrédio
     */
    public ExibirPredio() {
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

        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFBANHEIROS = new javax.swing.JComboBox<>();
        JTFSUITES = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        JTFQUARTOS = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        JTFESTADO = new javax.swing.JComboBox<>();
        JTFVOLTARR = new javax.swing.JButton();
        JTFPRECOS = new javax.swing.JButton();
        JTFFINALIZAR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTFSUSUARIO = new javax.swing.JTextField();
        JTFALTC = new javax.swing.JButton();
        JTFTOTAL = new javax.swing.JButton();
        JTFCOMPRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/Prédio.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Quartos:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/ilgner (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Suítes:");

        JTFBANHEIROS.setBackground(new java.awt.Color(0, 0, 0));
        JTFBANHEIROS.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        JTFBANHEIROS.setForeground(new java.awt.Color(102, 102, 102));
        JTFBANHEIROS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        JTFBANHEIROS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFBANHEIROSActionPerformed(evt);
            }
        });

        JTFSUITES.setBackground(new java.awt.Color(0, 0, 0));
        JTFSUITES.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        JTFSUITES.setForeground(new java.awt.Color(102, 102, 102));
        JTFSUITES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        JTFSUITES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFSUITESActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Banheiros:");

        JTFQUARTOS.setBackground(new java.awt.Color(0, 0, 0));
        JTFQUARTOS.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        JTFQUARTOS.setForeground(new java.awt.Color(102, 102, 102));
        JTFQUARTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        JTFQUARTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQUARTOSActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Estado:");

        JTFESTADO.setBackground(new java.awt.Color(1, 1, 1));
        JTFESTADO.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        JTFESTADO.setForeground(new java.awt.Color(102, 102, 102));
        JTFESTADO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CE", "RJ", "MG", "PA", "SC", "RN", "BA", "SP", "PE", "ES" }));

        JTFVOLTARR.setBackground(new java.awt.Color(1, 1, 1));
        JTFVOLTARR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFVOLTARR.setForeground(new java.awt.Color(254, 254, 254));
        JTFVOLTARR.setText("x");
        JTFVOLTARR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFVOLTARRActionPerformed(evt);
            }
        });

        JTFPRECOS.setBackground(new java.awt.Color(1, 1, 1));
        JTFPRECOS.setFont(new java.awt.Font("Noto Serif", 2, 24)); // NOI18N
        JTFPRECOS.setForeground(new java.awt.Color(254, 254, 254));
        JTFPRECOS.setText("CONFERIR PREÇOS");
        JTFPRECOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPRECOSActionPerformed(evt);
            }
        });

        JTFFINALIZAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFFINALIZAR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFFINALIZAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFFINALIZAR.setText("FINALIZAR");
        JTFFINALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFINALIZARActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("VALOR TOTAL");

        JTFSUSUARIO.setEditable(false);
        JTFSUSUARIO.setBackground(new java.awt.Color(1, 1, 1));
        JTFSUSUARIO.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        JTFSUSUARIO.setForeground(new java.awt.Color(254, 254, 254));

        JTFALTC.setBackground(new java.awt.Color(1, 1, 1));
        JTFALTC.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFALTC.setForeground(new java.awt.Color(254, 254, 254));
        JTFALTC.setText("ALTERAR COMPRA");
        JTFALTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFALTCActionPerformed(evt);
            }
        });

        JTFTOTAL.setBackground(new java.awt.Color(1, 1, 1));
        JTFTOTAL.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFTOTAL.setForeground(new java.awt.Color(254, 254, 254));
        JTFTOTAL.setText("VER TOTAL");
        JTFTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTOTALActionPerformed(evt);
            }
        });

        JTFCOMPRAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFCOMPRAR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFCOMPRAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFCOMPRAR.setText("COMPRAR");
        JTFCOMPRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCOMPRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)))
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(JTFSUITES, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTFESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTFBANHEIROS, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(45, 45, 45)
                                        .addComponent(JTFQUARTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFVOLTARR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTFSUSUARIO)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addComponent(JTFPRECOS)
                                .addGap(71, 71, 71))))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTFALTC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFCOMPRAR)
                        .addGap(18, 18, 18)
                        .addComponent(JTFTOTAL)
                        .addGap(17, 17, 17)
                        .addComponent(JTFFINALIZAR)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTFQUARTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTFSUITES, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(JTFVOLTARR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFSUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(JTFPRECOS)
                        .addContainerGap(138, Short.MAX_VALUE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTFBANHEIROS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTFESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTFTOTAL)
                                    .addComponent(JTFFINALIZAR)
                                    .addComponent(JTFCOMPRAR))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTFALTC)
                                .addGap(14, 14, 14))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 795, 609);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFBANHEIROSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFBANHEIROSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFBANHEIROSActionPerformed

    private void JTFSUITESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFSUITESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFSUITESActionPerformed

    private void JTFQUARTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQUARTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQUARTOSActionPerformed

    private void JTFVOLTARRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFVOLTARRActionPerformed
        TelaCompra tlc = new TelaCompra();
        tlc.setVisible(true);
        dispose();
    }//GEN-LAST:event_JTFVOLTARRActionPerformed

    private void JTFPRECOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPRECOSActionPerformed
        if(evt.getSource() == JTFPRECOS){
            JOptionPane.showMessageDialog(null, "Preço das Casas:"
                + "\nApartamento: R$7.500,00"
                + "\nCondomínio: R$250.000,00"
                + "\nCobertura: R$350.000,00"
                + "\nPrédio: R$10.500,00"
                + "\nDuplex: R$250.000,00"
                + "\nKitnet: R$1.600,00"
                + "\nMansão: R$1.000.000,00"
                + "\n"
                + "\nPreço dos cômodos:"
                + "\n---Quartos---"
                + "\nEntre 1 - 3: R$450,00"
                + "\nEntre 3 - 5: R$650,00"
                + "\nMais de 5: R$940,00"
                + "\n---Suítes---"
                + "\nEntre 1 - 3: R$600,00"
                + "\nEntre 3 - 5: R$970,00"
                + "\nMais de 5: R$1.300,00"
                + "\n---Banheiros---"
                + "\nEntre 1 - 3: R$400,00"
                + "\nEntre 3 - 5: R$650,00"
                + "\nMais de 5: R$900,00");
        }
    }//GEN-LAST:event_JTFPRECOSActionPerformed

    private void JTFFINALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFINALIZARActionPerformed

        JTFQUARTOS.setEnabled(false);
        JTFSUITES.setEnabled(false);
        JTFBANHEIROS.setEnabled(false);
        JTFESTADO.setEnabled(false);
        JTFFINALIZAR.setEnabled(false);
    }//GEN-LAST:event_JTFFINALIZARActionPerformed

    private void JTFALTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFALTCActionPerformed
        JTFQUARTOS.setEnabled(true);
        JTFSUITES.setEnabled(true);
        JTFBANHEIROS.setEnabled(true);
        JTFESTADO.setEnabled(true);
        JTFFINALIZAR.setEnabled(true);
    }//GEN-LAST:event_JTFALTCActionPerformed

    private void JTFTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTOTALActionPerformed

    }//GEN-LAST:event_JTFTOTALActionPerformed

    private void JTFCOMPRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCOMPRARActionPerformed
        if(evt.getSource() == JTFCOMPRAR){
            JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!"
                + "\nObrigado por fazer negócio conosco, a Ilgner Imobiliária agradece!"
                + "\nEm caso de dúvida ligue para (85)98745-8972"
                + "\nOu acesse nosso site ilgnerimobiliaria@gmail.com");

        }
    }//GEN-LAST:event_JTFCOMPRARActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirPredio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirPredio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirPredio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirPredio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirPredio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JTFALTC;
    private javax.swing.JComboBox<String> JTFBANHEIROS;
    private javax.swing.JButton JTFCOMPRAR;
    private javax.swing.JComboBox<String> JTFESTADO;
    private javax.swing.JButton JTFFINALIZAR;
    private javax.swing.JButton JTFPRECOS;
    private javax.swing.JComboBox<String> JTFQUARTOS;
    private javax.swing.JComboBox<String> JTFSUITES;
    private javax.swing.JTextField JTFSUSUARIO;
    private javax.swing.JButton JTFTOTAL;
    private javax.swing.JButton JTFVOLTARR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
