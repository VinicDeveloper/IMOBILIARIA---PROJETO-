/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import projeto.model.Clientes;
import projeto.model.Fornecer;

/**
 *
 * @author aluno
 */
public class CadastroFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFornecedor
     */
    public CadastroFornecedor() {
        initComponents();
        formatarcampo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNOME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFCODE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFUF = new javax.swing.JComboBox<>();
        JTFCADASTRAR = new javax.swing.JButton();
        JTFALTERAR = new javax.swing.JButton();
        JTFPESQUISAR = new javax.swing.JButton();
        JTFEXCLUIR = new javax.swing.JButton();
        JTFATUALIZAR = new javax.swing.JButton();
        JTFLIMPARF = new javax.swing.JButton();
        JTFVENDER = new javax.swing.JButton();
        JTFVOLTAR = new javax.swing.JButton();
        JTFCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(1, 1, 1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/fundocadastro.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Fornecedor:");

        JTFNOME.setBackground(new java.awt.Color(1, 1, 1));
        JTFNOME.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        JTFNOME.setForeground(new java.awt.Color(254, 254, 254));

        jLabel4.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Código:");

        JTFCODE.setBackground(new java.awt.Color(1, 1, 1));
        JTFCODE.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        JTFCODE.setForeground(new java.awt.Color(254, 254, 254));

        jLabel5.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("UF:");

        JTFUF.setBackground(new java.awt.Color(1, 1, 1));
        JTFUF.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        JTFUF.setForeground(new java.awt.Color(254, 254, 254));
        JTFUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CE", "RJ", "MG", "PA", "SC", "RN", "BA", "SP", "PE", "ES" }));

        JTFCADASTRAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFCADASTRAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFCADASTRAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFCADASTRAR.setText("Cadastrar");
        JTFCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCADASTRARActionPerformed(evt);
            }
        });

        JTFALTERAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFALTERAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFALTERAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFALTERAR.setText("Alterar");
        JTFALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFALTERARActionPerformed(evt);
            }
        });

        JTFPESQUISAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFPESQUISAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFPESQUISAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFPESQUISAR.setText("Pesquisar");
        JTFPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPESQUISARActionPerformed(evt);
            }
        });

        JTFEXCLUIR.setBackground(new java.awt.Color(1, 1, 1));
        JTFEXCLUIR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFEXCLUIR.setForeground(new java.awt.Color(254, 254, 254));
        JTFEXCLUIR.setText("Excluir");
        JTFEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEXCLUIRActionPerformed(evt);
            }
        });

        JTFATUALIZAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFATUALIZAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFATUALIZAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFATUALIZAR.setText("Atualizar");
        JTFATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFATUALIZARActionPerformed(evt);
            }
        });

        JTFLIMPARF.setBackground(new java.awt.Color(1, 1, 1));
        JTFLIMPARF.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFLIMPARF.setForeground(new java.awt.Color(254, 254, 254));
        JTFLIMPARF.setText("Limpar");
        JTFLIMPARF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFLIMPARFActionPerformed(evt);
            }
        });

        JTFVENDER.setBackground(new java.awt.Color(1, 1, 1));
        JTFVENDER.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFVENDER.setForeground(new java.awt.Color(254, 254, 254));
        JTFVENDER.setText("VENDER");
        JTFVENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFVENDERActionPerformed(evt);
            }
        });

        JTFVOLTAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFVOLTAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFVOLTAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFVOLTAR.setText("x");
        JTFVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFVOLTARActionPerformed(evt);
            }
        });

        JTFCPF.setBackground(new java.awt.Color(1, 1, 1));
        JTFCPF.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(JTFVOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTFNOME, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(JTFCPF))
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JTFCODE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFUF, 0, 136, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFLIMPARF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTFATUALIZAR, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFCADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFPESQUISAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTFVENDER)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFVOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTFCODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCADASTRAR)
                    .addComponent(JTFPESQUISAR)
                    .addComponent(JTFATUALIZAR))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFALTERAR)
                    .addComponent(JTFEXCLUIR)
                    .addComponent(JTFLIMPARF))
                .addGap(30, 30, 30)
                .addComponent(JTFVENDER)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 619, 556);

        setSize(new java.awt.Dimension(635, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCADASTRARActionPerformed
       Fornecer cli = new Fornecer();
       String nome = JTFNOME.getText();
         String code = JTFCODE.getText();
         String cpf = JTFCPF.getText();
         
          
         
         
          if(nome.equals("") || code.equals("") || cpf.equals("")||JTFUF.getSelectedItem().equals("Selecione")){
              
                  JOptionPane.showMessageDialog(null, "Preencha os campos para cadastrar!");
          }
            
       else   {
         //criando o objeto cliente
       
       cli.setNome(JTFNOME.getText());
       cli.setCode(JTFCODE.getText());
       cli.setCPF(JTFCPF.getText());
       cli.setUf((String)JTFUF.getSelectedItem());
       //Salvando ou cadastrando as informações
       
       JOptionPane.showMessageDialog(null, cli.Salvar());
       
       JTFNOME.setText("");
       JTFCODE.setText("");
       JTFCPF.setText("");
       JTFUF.setSelectedItem(0);
          }

    }//GEN-LAST:event_JTFCADASTRARActionPerformed

    private void JTFALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFALTERARActionPerformed
         if(JTFNOME.isEnabled()||JTFCODE.isEnabled()||JTFCPF.isEnabled()||JTFUF.isEnabled()){
          JOptionPane.showMessageDialog(null, "Primeiramente pesquise um código!");
          JTFCADASTRAR.setEnabled(true);
        }else{
        
        JTFNOME.setEnabled(true);
        JTFCODE.setEnabled(true);
        JTFCPF.setEnabled(true);
        JTFUF.setEnabled(true);
        JTFCADASTRAR.setEnabled(false);
         }
    }//GEN-LAST:event_JTFALTERARActionPerformed

    private void JTFPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPESQUISARActionPerformed
        if(evt.getSource() == JTFPESQUISAR){
            try{
                String code = JOptionPane.showInputDialog("Digite o código:");
                BufferedReader bf = new BufferedReader(new FileReader(code+"f.txt"));
                //criando o arquivo de leitura de caracteres
                 JTFCODE.setText(bf.readLine());
                JTFNOME.setText(bf.readLine());
                
                JTFCPF.setText(bf.readLine());
                JTFUF.setSelectedItem(bf.readLine());
                bf.close();
             JTFNOME.setEnabled(false);
            JTFCODE.setEnabled(false);
            JTFCPF.setEnabled(false);
            JTFUF.setEnabled(false);
            JTFCADASTRAR.setEnabled(false);

            }   catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Não foi possível encontrar o código "+erro.getMessage());
             JTFNOME.setEnabled(true);
            JTFCODE.setEnabled(true);
            JTFCPF.setEnabled(true);
            JTFUF.setEnabled(true);
                 JTFCADASTRAR.setEnabled(true);
                  JTFNOME.setText("");
       JTFCODE.setText("");
       JTFCPF.setText("");
       JTFUF.setSelectedItem(0);
            }
         
    }//GEN-LAST:event_JTFPESQUISARActionPerformed
    }
    private void JTFEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEXCLUIRActionPerformed
       try{
        String code = JOptionPane.showInputDialog("Digite o código: ");
        Fornecer c = new Fornecer();
        c.setCode(code);
        JOptionPane.showMessageDialog(null,c.Deletar());
          JTFNOME.setEnabled(true);
            JTFCODE.setEnabled(true);
            JTFCPF.setEnabled(true);
            JTFUF.setEnabled(true);
            JTFCADASTRAR.setEnabled(true);
        }
        catch(Exception error){
            
                JOptionPane.showMessageDialog(null, "Erro: " +error.getMessage());
                Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, error);
            
        }
    }//GEN-LAST:event_JTFEXCLUIRActionPerformed

    private void JTFATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFATUALIZARActionPerformed
          Fornecer cli = new Fornecer();
       String nome = JTFNOME.getText();
         String code = JTFCODE.getText();
         String cpf = JTFCPF.getText();
         
          
         
         
          if(nome.equals("") || code.equals("") || cpf.equals("")||JTFUF.getSelectedItem().equals("Selecione")){
              
                  JOptionPane.showMessageDialog(null, "Preencha os campos para atualizar!");
          }
          else if(JTFCADASTRAR.isEnabled()){
              
              JOptionPane.showMessageDialog(null, "Cadastre antes de atualizar");
    }
            
       else   {
         //criando o objeto cliente
       
       cli.setNome(JTFNOME.getText());
       cli.setCode(JTFCODE.getText());
       cli.setCPF(JTFCPF.getText());
       cli.setUf((String)JTFUF.getSelectedItem());
       //Salvando ou cadastrando as informações
       
       JOptionPane.showMessageDialog(null, cli.Atualizar());
       
       JTFNOME.setText("");
       JTFCODE.setText("");
       JTFCPF.setText("");
       JTFUF.setSelectedItem(0);
        JTFCADASTRAR.setEnabled(true);
          }
    }                                            

    private void JTFLIMPARActionPerformed(java.awt.event.ActionEvent evt) {                                          
      
    }//GEN-LAST:event_JTFATUALIZARActionPerformed

    private void JTFLIMPARFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFLIMPARFActionPerformed
    JTFNOME.setText("");
       JTFCODE.setText("");
       JTFCPF.setText("");
       JTFUF.setSelectedItem(0);

    }//GEN-LAST:event_JTFLIMPARFActionPerformed

    private void JTFVENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFVENDERActionPerformed

       try{
        String codigo = JOptionPane.showInputDialog("Digite o codigo");
       BufferedReader bf = new BufferedReader(new FileReader(codigo+"f.txt"));
        bf.close();
       TelaVenda p = new TelaVenda();
       p.setVisible(true);
       dispose();
      
       }
       catch(Exception erro){
           JOptionPane.showMessageDialog(null,"Seu codigo não foi encontrado,verifique se está cadastrado!");
           Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, erro);
       }
    }//GEN-LAST:event_JTFVENDERActionPerformed

    private void JTFVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFVOLTARActionPerformed
        CadastroCliente l = new CadastroCliente();
        l.setVisible(true);
        dispose();

    }//GEN-LAST:event_JTFVOLTARActionPerformed
private void formatarcampo(){
         try {
           MaskFormatter mk = new MaskFormatter("###.###.###-##");
          mk.install(JTFCPF);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JTFALTERAR;
    private javax.swing.JButton JTFATUALIZAR;
    private javax.swing.JButton JTFCADASTRAR;
    private javax.swing.JTextField JTFCODE;
    private javax.swing.JFormattedTextField JTFCPF;
    private javax.swing.JButton JTFEXCLUIR;
    private javax.swing.JButton JTFLIMPARF;
    private javax.swing.JTextField JTFNOME;
    private javax.swing.JButton JTFPESQUISAR;
    private javax.swing.JComboBox<String> JTFUF;
    private javax.swing.JButton JTFVENDER;
    private javax.swing.JButton JTFVOLTAR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
