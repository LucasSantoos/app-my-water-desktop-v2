/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Lucas Santos
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnOpenPessoas = new javax.swing.JMenuItem();
        btnOpenTelefones = new javax.swing.JMenuItem();
        btnOpenEnderecos = new javax.swing.JMenuItem();
        btnOpenCidade = new javax.swing.JMenuItem();
        btnOpenEstado = new javax.swing.JMenuItem();
        btnOpenPais = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menu");

        btnOpenPessoas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        btnOpenPessoas.setText("Pessoas");
        btnOpenPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPessoasActionPerformed(evt);
            }
        });
        jMenu1.add(btnOpenPessoas);

        btnOpenTelefones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        btnOpenTelefones.setText("Telefones");
        btnOpenTelefones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenTelefonesActionPerformed(evt);
            }
        });
        jMenu1.add(btnOpenTelefones);

        btnOpenEnderecos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        btnOpenEnderecos.setText("Endereços");
        btnOpenEnderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenEnderecosActionPerformed(evt);
            }
        });
        jMenu1.add(btnOpenEnderecos);

        btnOpenCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btnOpenCidade.setText("Cidades");
        btnOpenCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenCidadeActionPerformed(evt);
            }
        });
        jMenu1.add(btnOpenCidade);

        btnOpenEstado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnOpenEstado.setText("Estados");
        btnOpenEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenEstadoActionPerformed(evt);
            }
        });
        jMenu1.add(btnOpenEstado);

        btnOpenPais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        btnOpenPais.setText("Paises");
        btnOpenPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPaisActionPerformed(evt);
            }
        });
        jMenu1.add(btnOpenPais);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Emissão conta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPessoasActionPerformed
        // TODO add your handling code here:
        DialogPessoa dialogPessoa = new DialogPessoa(this, rootPaneCheckingEnabled);
        dialogPessoa.setVisible(true);
    }//GEN-LAST:event_btnOpenPessoasActionPerformed

    private void btnOpenTelefonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenTelefonesActionPerformed
        // TODO add your handling code here:
        DialogTelefone dialogTelefone = new DialogTelefone(this, rootPaneCheckingEnabled);
        dialogTelefone.setVisible(true);
    }//GEN-LAST:event_btnOpenTelefonesActionPerformed

    private void btnOpenEnderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenEnderecosActionPerformed
        // TODO add your handling code here:
        DialogEndereco dialogEndereco = new DialogEndereco(this, rootPaneCheckingEnabled);
        dialogEndereco.setVisible(true);
    }//GEN-LAST:event_btnOpenEnderecosActionPerformed

    private void btnOpenCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenCidadeActionPerformed
        // TODO add your handling code here:
        DialogCidade dialogCidade = new DialogCidade(this, rootPaneCheckingEnabled);
        dialogCidade.setVisible(true);
    }//GEN-LAST:event_btnOpenCidadeActionPerformed

    private void btnOpenPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPaisActionPerformed
        // TODO add your handling code here:
        DialogPais dialogPais = new DialogPais(this, rootPaneCheckingEnabled);
        dialogPais.setVisible(true);
    }//GEN-LAST:event_btnOpenPaisActionPerformed

    private void btnOpenEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenEstadoActionPerformed
        // TODO add your handling code here:
        DialogEstado dialogEstado = new DialogEstado(this, rootPaneCheckingEnabled);
        dialogEstado.setVisible(true);
    }//GEN-LAST:event_btnOpenEstadoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DialogEmissaoConta dialogEmissaoConta = new DialogEmissaoConta(this, rootPaneCheckingEnabled);
        dialogEmissaoConta.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnOpenCidade;
    private javax.swing.JMenuItem btnOpenEnderecos;
    private javax.swing.JMenuItem btnOpenEstado;
    private javax.swing.JMenuItem btnOpenPais;
    private javax.swing.JMenuItem btnOpenPessoas;
    private javax.swing.JMenuItem btnOpenTelefones;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
