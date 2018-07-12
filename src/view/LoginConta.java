package view;

import controller.LoginContaController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Conta;

public class LoginConta extends javax.swing.JFrame {

    int numeroDigitado;
    int clique = 0;
    boolean agencia = true,
            conta = false,
            senha = false;

    private static LoginConta instance;
    
    private int numAgencia,
                 numConta,
                 numSenha;
    
    int campoAtual = 0;
    final JTextField[] campos = new JTextField[3];

    private LoginConta() {

    }
    
    public static LoginConta getInstance(){
        if (instance == null) {
            instance = new LoginConta();
        }
        return instance;
    }

    public void iniciaTela(){
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        bloqueioInicial();
        setVisible(true);

        JOptionPane.showMessageDialog(null, "Utilize o teclado numérico para acesso ao sistema!");
        campos[0] = jtfAgencia;
        campos[1] = jtfConta;
        campos[2] = jtfSenha;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtUm = new javax.swing.JButton();
        jbtDois = new javax.swing.JButton();
        jbtTres = new javax.swing.JButton();
        jbtCancela = new javax.swing.JButton();
        jbtCorrige = new javax.swing.JButton();
        jbtSeis = new javax.swing.JButton();
        jbtCinco = new javax.swing.JButton();
        jbtQuatro = new javax.swing.JButton();
        jbtConfirma = new javax.swing.JButton();
        jbtNove = new javax.swing.JButton();
        jbtOito = new javax.swing.JButton();
        jbtSete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtZero = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfAgencia = new javax.swing.JTextField();
        jtfConta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtUm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtUm.setText("1");
        jbtUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUmActionPerformed(evt);
            }
        });

        jbtDois.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtDois.setText("2");
        jbtDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDoisActionPerformed(evt);
            }
        });

        jbtTres.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtTres.setText("3");
        jbtTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTresActionPerformed(evt);
            }
        });

        jbtCancela.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtCancela.setText("CANCELA");
        jbtCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelaActionPerformed(evt);
            }
        });

        jbtCorrige.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtCorrige.setText("CORRIGE");
        jbtCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCorrigeActionPerformed(evt);
            }
        });

        jbtSeis.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtSeis.setText("6");
        jbtSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSeisActionPerformed(evt);
            }
        });

        jbtCinco.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtCinco.setText("5");
        jbtCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCincoActionPerformed(evt);
            }
        });

        jbtQuatro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtQuatro.setText("4");
        jbtQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuatroActionPerformed(evt);
            }
        });

        jbtConfirma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtConfirma.setText("CONFIRMA");
        jbtConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmaActionPerformed(evt);
            }
        });

        jbtNove.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtNove.setText("9");
        jbtNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNoveActionPerformed(evt);
            }
        });

        jbtOito.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtOito.setText("8");
        jbtOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOitoActionPerformed(evt);
            }
        });

        jbtSete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtSete.setText("7");
        jbtSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSeteActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jbtZero.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtZero.setText("0");
        jbtZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtZeroActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtZero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtSete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtOito, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtNove, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtUm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtDois, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtTres, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtConfirma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtCancela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtTres, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtDois, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtUm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtCancela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtOito, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtNove, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtZero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setText("CAIXA ELETRÔNICO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("AGÊNCIA:");

        jtfAgencia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtfConta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("CONTA:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("SENHA:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfAgencia)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jtfConta))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfConta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSeteActionPerformed
        if (agencia) {
            numeroDigitado = Integer.parseInt(jtfAgencia.getText() + "7");
            jtfAgencia.setText("" + numeroDigitado);
        } else {
            if (conta) {
                numeroDigitado = Integer.parseInt(jtfConta.getText() + "7");
                jtfConta.setText("" + numeroDigitado);
            } else {
                if (senha) {
                    numeroDigitado = Integer.parseInt(jtfSenha.getText() + "7");
                    jtfSenha.setText("" + numeroDigitado);
                }
            }
        }
    }//GEN-LAST:event_jbtSeteActionPerformed

    private void jbtCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelaActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Encerrar Sistema?", "Atenção",
                JOptionPane.YES_OPTION,
                JOptionPane.CANCEL_OPTION);
        if ((x == JOptionPane.YES_OPTION)) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtCancelaActionPerformed

    private void jbtConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmaActionPerformed
        boolean ultimoCampo = false;
        campoAtual++;

        if (campoAtual > 2) {
            ultimoCampo = true;
            campoAtual = 2;
        }

        campos[campoAtual].requestFocus();
        if (ultimoCampo) {
            if (new LoginContaController(LoginConta.this).Logar()) {
                setNumAgencia(Integer.parseInt(campos[0].getText()));
                setNumConta(Integer.parseInt(campos[1].getText()));
                setNumSenha(Integer.parseInt(campos[2].getText()));
                dispose();
                new MenuCaixaEletronico();
            } else {
                JOptionPane.showMessageDialog(null, "Agencia e Conta inválida.");
                campos[2].requestFocus();
                campos[2].setText(null);
               
            }
        }
    }//GEN-LAST:event_jbtConfirmaActionPerformed

    private void jbtUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "1");
    }//GEN-LAST:event_jbtUmActionPerformed

    private void jbtDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDoisActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "2");
    }//GEN-LAST:event_jbtDoisActionPerformed

    private void jbtTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTresActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "3");
    }//GEN-LAST:event_jbtTresActionPerformed

    private void jbtQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuatroActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "4");
    }//GEN-LAST:event_jbtQuatroActionPerformed

    private void jbtCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCincoActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "5");
    }//GEN-LAST:event_jbtCincoActionPerformed

    private void jbtSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSeisActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "6");
    }//GEN-LAST:event_jbtSeisActionPerformed

    private void jbtOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOitoActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "8");
    }//GEN-LAST:event_jbtOitoActionPerformed

    private void jbtNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNoveActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "9");
    }//GEN-LAST:event_jbtNoveActionPerformed

    private void jbtZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtZeroActionPerformed
        campos[campoAtual].setText(campos[campoAtual].getText() + "0");
    }//GEN-LAST:event_jbtZeroActionPerformed

    private void jbtCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCorrigeActionPerformed
        if (campos[campoAtual].getText().isEmpty()) {
            campoAtual--;
            if (campoAtual < 0) {
                campoAtual = 0;
            }
            campos[campoAtual].requestFocus();
        } else {
            campos[campoAtual].setText(null);
        }


    }//GEN-LAST:event_jbtCorrigeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtCancela;
    private javax.swing.JButton jbtCinco;
    private javax.swing.JButton jbtConfirma;
    private javax.swing.JButton jbtCorrige;
    private javax.swing.JButton jbtDois;
    private javax.swing.JButton jbtNove;
    private javax.swing.JButton jbtOito;
    private javax.swing.JButton jbtQuatro;
    private javax.swing.JButton jbtSeis;
    private javax.swing.JButton jbtSete;
    private javax.swing.JButton jbtTres;
    private javax.swing.JButton jbtUm;
    private javax.swing.JButton jbtZero;
    private javax.swing.JTextField jtfAgencia;
    private javax.swing.JTextField jtfConta;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables

    public void bloqueioInicial() {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jtfAgencia.setEditable(false);
        jtfConta.setEditable(false);
        jtfSenha.setEditable(false);
        jtfAgencia.grabFocus();
    }

    public JTextField getJtfAgencia() {
        return jtfAgencia;
    }

    public void setJtfAgencia(JTextField jtfAgencia) {
        this.jtfAgencia = jtfAgencia;
    }

    public JTextField getJtfConta() {
        return jtfConta;
    }

    public void setJtfConta(JTextField jtfConta) {
        this.jtfConta = jtfConta;
    }

    public JPasswordField getJtfSenha() {
        return jtfSenha;
    }

    public void setJtfSenha(JPasswordField jtfSenha) {
        this.jtfSenha = jtfSenha;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumSenha() {
        return numSenha;
    }

    public void setNumSenha(int numSenha) {
        this.numSenha = numSenha;
    }


}