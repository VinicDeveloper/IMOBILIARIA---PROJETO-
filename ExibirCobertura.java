/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import javax.swing.JOptionPane;
import projeto.model.Produto;

/**
 *
 * @author aluno
 */
public class ExibirCobertura extends javax.swing.JFrame {

    /**
     * Creates new form ExibirCobertura
     */
    public ExibirCobertura() {
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
        jLabel4 = new javax.swing.JLabel();
        quantb = new javax.swing.JComboBox<>();
        quants = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        quantq = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        JTFVOLTARR = new javax.swing.JButton();
        JTFPRECOS = new javax.swing.JButton();
        JTFFINALIZAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pretensao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        JTFALTC = new javax.swing.JButton();
        JTFTOTAL = new javax.swing.JButton();
        JTFCOMPRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        painel.setBackground(new java.awt.Color(0, 0, 0));
        painel.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/Cobertura.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        painel.add(jLabel1);
        jLabel1.setBounds(422, 33, 299, 300);

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Quartos:");
        painel.add(jLabel3);
        jLabel3.setBounds(10, 310, 95, 29);

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Suítes:");
        painel.add(jLabel4);
        jLabel4.setBounds(10, 364, 73, 29);

        quantb.setBackground(new java.awt.Color(0, 0, 0));
        quantb.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        quantb.setForeground(new java.awt.Color(102, 102, 102));
        quantb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        quantb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantbActionPerformed(evt);
            }
        });
        painel.add(quantb);
        quantb.setBounds(146, 418, 128, 38);

        quants.setBackground(new java.awt.Color(0, 0, 0));
        quants.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        quants.setForeground(new java.awt.Color(102, 102, 102));
        quants.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        quants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantsActionPerformed(evt);
            }
        });
        painel.add(quants);
        quants.setBounds(150, 363, 128, 38);

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Banheiros:");
        painel.add(jLabel5);
        jLabel5.setBounds(10, 419, 118, 29);

        quantq.setBackground(new java.awt.Color(0, 0, 0));
        quantq.setFont(new java.awt.Font("Noto Serif", 1, 12)); // NOI18N
        quantq.setForeground(new java.awt.Color(102, 102, 102));
        quantq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        quantq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantqActionPerformed(evt);
            }
        });
        painel.add(quantq);
        quantq.setBounds(150, 311, 128, 38);

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Estado:");
        painel.add(jLabel6);
        jLabel6.setBounds(10, 476, 82, 29);

        estado.setBackground(new java.awt.Color(1, 1, 1));
        estado.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 102, 102));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CE", "RJ", "MG", "PA", "SC", "RN", "BA", "SP", "PE", "ES" }));
        painel.add(estado);
        estado.setBounds(146, 474, 128, 38);

        JTFVOLTARR.setBackground(new java.awt.Color(1, 1, 1));
        JTFVOLTARR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFVOLTARR.setForeground(new java.awt.Color(254, 254, 254));
        JTFVOLTARR.setText("x");
        JTFVOLTARR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFVOLTARRActionPerformed(evt);
            }
        });
        painel.add(JTFVOLTARR);
        JTFVOLTARR.setBounds(725, 2, 44, 32);

        JTFPRECOS.setBackground(new java.awt.Color(1, 1, 1));
        JTFPRECOS.setFont(new java.awt.Font("Noto Serif", 2, 24)); // NOI18N
        JTFPRECOS.setForeground(new java.awt.Color(254, 254, 254));
        JTFPRECOS.setText("CONFERIR PREÇOS");
        JTFPRECOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPRECOSActionPerformed(evt);
            }
        });
        painel.add(JTFPRECOS);
        JTFPRECOS.setBounds(433, 425, 265, 41);

        JTFFINALIZAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFFINALIZAR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFFINALIZAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFFINALIZAR.setText("FINALIZAR");
        JTFFINALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFINALIZARActionPerformed(evt);
            }
        });
        painel.add(JTFFINALIZAR);
        JTFFINALIZAR.setBounds(618, 523, 151, 41);

        jLabel8.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Pretensão:");
        painel.add(jLabel8);
        jLabel8.setBounds(10, 270, 116, 32);

        pretensao.setBackground(new java.awt.Color(0, 0, 0));
        pretensao.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        pretensao.setForeground(new java.awt.Color(102, 102, 102));
        pretensao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Comprar", "Alugar" }));
        pretensao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretensaoActionPerformed(evt);
            }
        });
        painel.add(pretensao);
        pretensao.setBounds(150, 260, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/ilgner (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        painel.add(jLabel2);
        jLabel2.setBounds(10, 0, 278, 305);

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("VALOR TOTAL");
        painel.add(jLabel7);
        jLabel7.setBounds(482, 339, 164, 29);

        total.setEditable(false);
        total.setBackground(new java.awt.Color(1, 1, 1));
        total.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(254, 254, 254));
        painel.add(total);
        total.setBounds(482, 374, 164, 40);

        JTFALTC.setBackground(new java.awt.Color(1, 1, 1));
        JTFALTC.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFALTC.setForeground(new java.awt.Color(254, 254, 254));
        JTFALTC.setText("ALTERAR COMPRA");
        JTFALTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFALTCActionPerformed(evt);
            }
        });
        painel.add(JTFALTC);
        JTFALTC.setBounds(10, 531, 249, 41);

        JTFTOTAL.setBackground(new java.awt.Color(1, 1, 1));
        JTFTOTAL.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFTOTAL.setForeground(new java.awt.Color(254, 254, 254));
        JTFTOTAL.setText("VER TOTAL");
        JTFTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTOTALActionPerformed(evt);
            }
        });
        painel.add(JTFTOTAL);
        JTFTOTAL.setBounds(438, 523, 163, 41);

        JTFCOMPRAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFCOMPRAR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFCOMPRAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFCOMPRAR.setText("COMPRAR");
        JTFCOMPRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCOMPRARActionPerformed(evt);
            }
        });
        painel.add(JTFCOMPRAR);
        JTFCOMPRAR.setBounds(267, 523, 153, 41);

        getContentPane().add(painel);
        painel.setBounds(0, 0, 779, 586);

        setBounds(0, 0, 795, 609);
    }// </editor-fold>//GEN-END:initComponents

    private void quantbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantbActionPerformed

    private void quantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantsActionPerformed

    private void quantqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantqActionPerformed

    private void JTFVOLTARRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFVOLTARRActionPerformed
        TelaCompra tlc = new TelaCompra();
        tlc.setVisible(true);
        dispose();
    }//GEN-LAST:event_JTFVOLTARRActionPerformed

    private void JTFPRECOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPRECOSActionPerformed
       if(evt.getSource() == JTFPRECOS){
            JOptionPane.showMessageDialog(null, "COMPRAR"+

"\nDuplex:R$ 100 000"+

"\nCondominio:R$ 500 000"+

"\nMansão:R$ 1000.0000 - um milhão"+

"\nCobertura:R$ 200 000"+

"\nKitnet:R$ 50 000"+

"\nPredio:R$ 250 000"+

"\nApartamento:R$ 120 000"+
"\n"+
"\nALUGAR"+

"\nDuplex:R$ 1000"+

"\nCondominio:R$ 5000"+

"\nMansão:R$ 10000"+

"\nCobertura:R$ 2000"+

"\nKitnet:R$ 500"+

"\nPredio:R$ 2500"+

"\nApartamento:R$ 400"



);
        }
    }//GEN-LAST:event_JTFPRECOSActionPerformed

    private void JTFFINALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFINALIZARActionPerformed

        JOptionPane.showMessageDialog(null,"Obrigado por compra na Imobiliaria Igner!");
         JOptionPane.showMessageDialog(null,"QUALQUER IMPREVISTO NOS CONTATE:"+"\n 99345-5455");
     int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe-nos sua nota para o nosso aplicativo (1 Á 10)"));
      JOptionPane.showMessageDialog(null,"SUA NOTA FOI: "+nota+"\n OBRIGADO POR COMPRA NA NOSSA IMOBILIARIA AONDE O SEU SONHO E CONSTRUIDO!");
      System.exit(0);
    }//GEN-LAST:event_JTFFINALIZARActionPerformed

    private void JTFALTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFALTCActionPerformed
       quantq.setEnabled(true);
        quants.setEnabled(true);
        quantb.setEnabled(true);
        estado.setEnabled(true);
        pretensao.setEnabled(true);
        JTFFINALIZAR.setEnabled(true);
    }//GEN-LAST:event_JTFALTCActionPerformed

    private void JTFTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTOTALActionPerformed
 if(quantb.getSelectedItem().equals(0)|| quants.getSelectedItem().equals(0)||quantq.getSelectedItem().equals(0)||pretensao.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null,"INFORME OS VALORES");
        }
  else if(pretensao.getSelectedItem().equals("Comprar")){
       Produto pf = new Produto();
       pf.setEstado("Cobertura");
       pf.setQuant_q((Integer.parseInt((String)quantq.getSelectedItem())));
       pf.setQuant_b((Integer.parseInt((String)quantb.getSelectedItem())));
        pf.setQuant_s(Integer.parseInt((String)quants.getSelectedItem()));
     pf.CalcTotal();
     total.setText(""+pf.getTotal());
  }
  else if(pretensao.getSelectedItem().equals("Alugar")){
       Produto pf = new Produto();
       pf.setEstado("Cobertura");
       pf.setQuant_q((Integer.parseInt((String)quantq.getSelectedItem())));
       pf.setQuant_b((Integer.parseInt((String)quantb.getSelectedItem())));
        pf.setQuant_s(Integer.parseInt((String)quants.getSelectedItem()));
     pf.CalcAlugar();
     total.setText(""+pf.getTotal());
  }       
    }//GEN-LAST:event_JTFTOTALActionPerformed

    private void JTFCOMPRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCOMPRARActionPerformed
       if(evt.getSource() == JTFCOMPRAR){
           JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!"
                   + "\nObrigado por fazer negócio conosco, a Ilgner Imobiliária agradece!"
                   + "\nEm caso de dúvida ligue para (85)98745-8972"
                   + "\nOu acesse nosso site ilgnerimobiliaria@gmail.com");
        pretensao.setEnabled(false);
        quantq.setEnabled(false);
        quants.setEnabled(false);
        quantb.setEnabled(false);
        estado.setEnabled(false);
        JTFFINALIZAR.setEnabled(true);
       }
    }//GEN-LAST:event_JTFCOMPRARActionPerformed

    private void pretensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretensaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pretensaoActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirCobertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirCobertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirCobertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirCobertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirCobertura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JTFALTC;
    private javax.swing.JButton JTFCOMPRAR;
    private javax.swing.JButton JTFFINALIZAR;
    private javax.swing.JButton JTFPRECOS;
    private javax.swing.JButton JTFTOTAL;
    private javax.swing.JButton JTFVOLTARR;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel painel;
    private javax.swing.JComboBox<String> pretensao;
    private javax.swing.JComboBox<String> quantb;
    private javax.swing.JComboBox<String> quantq;
    private javax.swing.JComboBox<String> quants;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}