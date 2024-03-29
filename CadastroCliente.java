/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.text.MaskFormatter;
import projeto.model.Clientes;

/**
 *
 * @author aluno
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFCODE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFNOME = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFUF = new javax.swing.JComboBox<>();
        JTFPESQUISAR = new javax.swing.JButton();
        JTFCADASTRAR = new javax.swing.JButton();
        JTFEXCLUIR = new javax.swing.JButton();
        JTFATUALIZAR = new javax.swing.JButton();
        JTFALTERAR = new javax.swing.JButton();
        JTFLIMPAR = new javax.swing.JButton();
        JTFCADASTRARF = new javax.swing.JButton();
        JTFINICIAR = new javax.swing.JButton();
        JTFCPF = new javax.swing.JFormattedTextField();
        JTFVOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/img/fundocadastro.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Código:");

        JTFCODE.setBackground(new java.awt.Color(1, 1, 1));
        JTFCODE.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        JTFCODE.setForeground(new java.awt.Color(254, 254, 254));

        jLabel4.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("CPF:");

        JTFNOME.setBackground(new java.awt.Color(1, 1, 1));
        JTFNOME.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        JTFNOME.setForeground(new java.awt.Color(254, 254, 254));

        jLabel5.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("UF:");

        JTFUF.setBackground(new java.awt.Color(1, 1, 1));
        JTFUF.setFont(new java.awt.Font("Noto Serif", 1, 14)); // NOI18N
        JTFUF.setForeground(new java.awt.Color(254, 254, 254));
        JTFUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CE", "RJ", "MG", "PA", "SC", "RN", "BA", "SP", "PE", "ES" }));

        JTFPESQUISAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFPESQUISAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFPESQUISAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFPESQUISAR.setText("Pesquisar");
        JTFPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPESQUISARActionPerformed(evt);
            }
        });

        JTFCADASTRAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFCADASTRAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFCADASTRAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFCADASTRAR.setText("Cadastrar");
        JTFCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCADASTRARActionPerformed(evt);
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

        JTFALTERAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFALTERAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFALTERAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFALTERAR.setText("Alterar");
        JTFALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFALTERARActionPerformed(evt);
            }
        });

        JTFLIMPAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFLIMPAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFLIMPAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFLIMPAR.setText("Limpar");
        JTFLIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFLIMPARActionPerformed(evt);
            }
        });

        JTFCADASTRARF.setBackground(new java.awt.Color(1, 1, 1));
        JTFCADASTRARF.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFCADASTRARF.setForeground(new java.awt.Color(254, 254, 254));
        JTFCADASTRARF.setText(" Cadastrar Fornec.");
        JTFCADASTRARF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCADASTRARFActionPerformed(evt);
            }
        });

        JTFINICIAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFINICIAR.setFont(new java.awt.Font("Noto Serif", 0, 24)); // NOI18N
        JTFINICIAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFINICIAR.setText("INICIAR COMPRA");
        JTFINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFINICIARActionPerformed(evt);
            }
        });

        JTFCPF.setBackground(new java.awt.Color(1, 1, 1));
        JTFCPF.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFNOME, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(JTFCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFCADASTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFALTERAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFPESQUISAR, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFEXCLUIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTFATUALIZAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFLIMPAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTFCODE)
                    .addComponent(JTFUF, 0, 120, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFCADASTRARF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(429, Short.MAX_VALUE)
                    .addComponent(JTFINICIAR)
                    .addGap(10, 10, 10)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTFCODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(JTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(JTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPESQUISAR)
                    .addComponent(JTFATUALIZAR)
                    .addComponent(JTFCADASTRAR))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFEXCLUIR)
                    .addComponent(JTFALTERAR)
                    .addComponent(JTFLIMPAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(JTFCADASTRARF))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(309, Short.MAX_VALUE)
                    .addComponent(JTFINICIAR)
                    .addGap(2, 2, 2)))
        );

        JTFVOLTAR.setBackground(new java.awt.Color(1, 1, 1));
        JTFVOLTAR.setFont(new java.awt.Font("Noto Serif", 0, 18)); // NOI18N
        JTFVOLTAR.setForeground(new java.awt.Color(254, 254, 254));
        JTFVOLTAR.setText("x");
        JTFVOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFVOLTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JTFVOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFVOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCADASTRARActionPerformed
        Clientes cli = new Clientes();
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

    private void JTFLIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFLIMPARActionPerformed
       JTFNOME.setText("");
       JTFCODE.setText("");
       JTFCPF.setText("");
       JTFUF.setSelectedItem(0);

    }//GEN-LAST:event_JTFLIMPARActionPerformed

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

    private void JTFEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEXCLUIRActionPerformed
        
        try{
        String code = JOptionPane.showInputDialog("Digite o código: ");
        Clientes c = new Clientes();
        c.setCode(code);
        JOptionPane.showMessageDialog(null,c.Deletar());
        }
        catch(Exception error){
            
                JOptionPane.showMessageDialog(null, "Erro: " +error.getMessage());
                Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, error);
            
        }
    }//GEN-LAST:event_JTFEXCLUIRActionPerformed

    private void JTFPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPESQUISARActionPerformed
       if(evt.getSource() == JTFPESQUISAR){
       try{
           String code = JOptionPane.showInputDialog("Digite o código:");
           BufferedReader bf = new BufferedReader(new FileReader(code+"c.txt"));
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
       }
       
      catch (Exception erro) {
               JOptionPane.showMessageDialog(null, "Não foi possível encontrar o código "+erro.getMessage());
           JTFNOME.setEnabled(true);
            JTFCODE.setEnabled(true);
            JTFCPF.setEnabled(true);
            JTFUF.setEnabled(true);
            JTFCADASTRAR.setEnabled(true);
      }
       
    }//GEN-LAST:event_JTFPESQUISARActionPerformed
    }
    private void JTFATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFATUALIZARActionPerformed
        Clientes cli = new Clientes();
       String nome = JTFNOME.getText();
         String code = JTFCODE.getText();
         String cpf = JTFCPF.getText();
         
          
         
         
     if(nome.equals("") || code.equals("") || cpf.equals("")||JTFUF.getSelectedItem().equals("Selecione")){
              
                  JOptionPane.showMessageDialog(null, "Preencha os campos para atualizar!");
          }
     else if(JTFCADASTRAR.isEnabled()){
         JOptionPane.showMessageDialog(null,"Você precisa cadastrar para poder atualizar");
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
                                              
    }//GEN-LAST:event_JTFATUALIZARActionPerformed

    private void JTFVOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFVOLTARActionPerformed
         JfLogin l = new JfLogin();
        l.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_JTFVOLTARActionPerformed

    private void JTFINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFINICIARActionPerformed
          try{
        String codigo = JOptionPane.showInputDialog("Digite o codigo");
       BufferedReader bf = new BufferedReader(new FileReader(codigo+"c.txt"));
       TelaCompra p = new TelaCompra();
       p.setVisible(true);
       dispose();
       }
       catch(Exception erro){
           JOptionPane.showMessageDialog(null,"Seu codigo não foi encontrado,verifique se está cadastrado!");
           Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, erro);
       }
                                           

     
    }//GEN-LAST:event_JTFINICIARActionPerformed

    private void JTFCADASTRARFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCADASTRARFActionPerformed
      CadastroFornecedor c = new CadastroFornecedor();
      c.setVisible(true);
      dispose();

    }//GEN-LAST:event_JTFCADASTRARFActionPerformed
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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JTFALTERAR;
    private javax.swing.JButton JTFATUALIZAR;
    private javax.swing.JButton JTFCADASTRAR;
    private javax.swing.JButton JTFCADASTRARF;
    private javax.swing.JTextField JTFCODE;
    private javax.swing.JFormattedTextField JTFCPF;
    private javax.swing.JButton JTFEXCLUIR;
    private javax.swing.JButton JTFINICIAR;
    private javax.swing.JButton JTFLIMPAR;
    private javax.swing.JTextField JTFNOME;
    private javax.swing.JButton JTFPESQUISAR;
    private javax.swing.JComboBox<String> JTFUF;
    private javax.swing.JButton JTFVOLTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
