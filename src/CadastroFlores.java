
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lorec
 */
public class CadastroFlores extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFlores
     */
    public CadastroFlores() {
        initComponents();
        this.setLocationRelativeTo(null);             // esse comando centraliza o painel do jframe quando em execução
        Color minhaCor = new Color(15, 127, 127);   // já essse muda a cor do painel.
        getContentPane().setBackground(minhaCor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        disponivelTexto = new javax.swing.JLabel();
        Especie = new javax.swing.JTextField();
        Quantidade = new javax.swing.JTextField();
        Disponibilidade = new javax.swing.JTextField();
        salvarBotao = new javax.swing.JButton();
        voltarBotao = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Espécie:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade:");

        disponivelTexto.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        disponivelTexto.setForeground(new java.awt.Color(255, 255, 255));
        disponivelTexto.setText("Disponível para:");

        Quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeActionPerformed(evt);
            }
        });

        Disponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponibilidadeActionPerformed(evt);
            }
        });

        salvarBotao.setBackground(new java.awt.Color(51, 255, 51));
        salvarBotao.setForeground(new java.awt.Color(255, 255, 255));
        salvarBotao.setText("Salvar");
        salvarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBotaoActionPerformed(evt);
            }
        });

        voltarBotao.setBackground(new java.awt.Color(223, 77, 85));
        voltarBotao.setForeground(new java.awt.Color(255, 255, 255));
        voltarBotao.setText("Voltar");
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(223, 77, 85));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastre as flores!");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Especie))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(disponivelTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Disponibilidade, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(salvarBotao)
                                .addGap(29, 29, 29)
                                .addComponent(voltarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))))
                .addGap(79, 79, 79))
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(Especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disponivelTexto)
                    .addComponent(Disponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBotao)
                    .addComponent(voltarBotao))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeActionPerformed

    private void DisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisponibilidadeActionPerformed

    private void salvarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBotaoActionPerformed
        Plantas planta = new Plantas();
        planta.setEspecie(Especie.getText());                      // Aqui o sistema recebe o que for adicionado nos campos
        int qnt = Integer.parseInt(Quantidade.getText());         // Espécie, Quantidade e Disponibilidade.  
        planta.setQuantidade(qnt);
        planta.setDisponibilidade(Disponibilidade.getText());

        String caminho = "C:\\Users\\lorec\\OneDrive\\Documentos\\NetBeansProjects\\Floricultura\\src\\Dados.txt";  // Local onde os dados serão salvos
        GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos(caminho);     // Utilizamos o gerenciador para salvar novos dados.
        ArrayList<Plantas> flores = new ArrayList<Plantas>();         // ArrayList usado para auxiliar o salvamento dos dados.

        try {       // Circundado com try-catch para evitar erros.
            File arquivo = new File(caminho);
            if (arquivo.length() > 0) {     // Verifica se existe algum objeto salvo.
                flores = (ArrayList<Plantas>) gerenciador.readObject();
            }
            flores.add(planta);     // Adiciona a nova flor ao ArrayList.
            gerenciador.writeObject(flores);    // Salva os dados da ArrayList no documento de texto.
            System.out.println("Objeto salvo!");
        } catch (IOException ex) {
            Logger.getLogger(CadastroFlores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroFlores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarBotaoActionPerformed

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        new PainelPrincipal().show(); //Esse botão retorna para a classe principal que vc quer voltar
        dispose();                    //e dispose fecha o atual
    }//GEN-LAST:event_voltarBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFlores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFlores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFlores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFlores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFlores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Disponibilidade;
    private javax.swing.JTextField Especie;
    private javax.swing.JTextField Quantidade;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel disponivelTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label;
    private java.awt.Panel panel1;
    private javax.swing.JButton salvarBotao;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables

}