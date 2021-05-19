/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uem.clinica.viewSec;
import javax.swing.JOptionPane;
import com.uem.clinica.entidades.Secretaria;
import com.uem.clinica.util.Convenio;
import com.uem.clinica.util.Endereco;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.EntityManagerFactory;



public class CriarPacienteView extends javax.swing.JInternalFrame{
    private Secretaria sec;
   
    /**
     * Creates new form CadastroPaciente
     */
    public CriarPacienteView(EntityManagerFactory emf) {
        initComponents();
        this.sec = new Secretaria(emf);
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
        nome = new javax.swing.JLabel();
        dataNasc = new javax.swing.JLabel();
        rua = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        convênio = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        ruaInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        birthDateInput = new javax.swing.JFormattedTextField();
        phoneInput = new javax.swing.JFormattedTextField();
        numeroInput = new javax.swing.JTextField();
        numero = new javax.swing.JLabel();
        bairroInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        complementoInput = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cepInput = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cidadeInput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        estadoInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        convenioInput = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Cadastro Paciente");

        nome.setText("Nome");

        dataNasc.setText("Data de Nascimento");

        rua.setText("Rua");

        telefone.setText("Telefone");

        email.setText("E-mail");

        convênio.setText("Convênio");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(60, 103, 15));
        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        try {
            birthDateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        birthDateInput.setToolTipText("");

        try {
            phoneInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        numero.setText("Número");

        jLabel9.setText("Bairro");

        jLabel10.setText("Complemento");

        jLabel11.setText("CEP");

        jLabel12.setText("Cidade");

        jLabel13.setText("Estado");

        convenioInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plano", "Particular", " " }));
        convenioInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convenioInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome)
                            .addComponent(email)
                            .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ruaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(convênio)
                            .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complementoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(birthDateInput)
                                .addComponent(dataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(telefone)
                            .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(convenioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(birthDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rua)
                        .addGap(10, 10, 10)
                        .addComponent(ruaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numero)
                        .addGap(10, 10, 10)
                        .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addComponent(complementoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(10, 10, 10)
                        .addComponent(estadoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(convênio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convenioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convenioInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convenioInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_convenioInputActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // Criar paciente

        String birthDate = birthDateInput.getText();
        String email = emailInput.getText();
        String name = nameInput.getText();
        String phone = phoneInput.getText();

        Endereco end = new Endereco();

        end.setRua(ruaInput.getText());
        end.setBairro(bairroInput.getText());
        end.setNumero(Integer.valueOf(numeroInput.getText()));
        end.setCidade(cidadeInput.getText());
        end.setCep(Integer.valueOf(cepInput.getText()));
        end.setComplemento(complementoInput.getText());
        end.setEstado(estadoInput.getText());

        Convenio conv = Convenio.Plano;

        if (convenioInput.getSelectedIndex() == 1) {
            conv = Convenio.Particular;
        }

        sec.criarPaciente(name, LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")), end, phone, email, conv);
        JOptionPane.showMessageDialog(rootPane, "Paciente Criado com sucesso\n\n"
            + name + "\n" + email  + "\n" + birthDate + "\n" + conv.toString() + "\n" + end.toString() + "\n" + phone + "\n");

    }//GEN-LAST:event_saveButtonActionPerformed

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputActionPerformed

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroInput;
    private javax.swing.JFormattedTextField birthDateInput;
    private javax.swing.JTextField cepInput;
    private javax.swing.JTextField cidadeInput;
    private javax.swing.JTextField complementoInput;
    private javax.swing.JComboBox<String> convenioInput;
    private javax.swing.JLabel convênio;
    private javax.swing.JLabel dataNasc;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailInput;
    private javax.swing.JTextField estadoInput;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JFormattedTextField phoneInput;
    private javax.swing.JLabel rua;
    private javax.swing.JTextField ruaInput;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}
