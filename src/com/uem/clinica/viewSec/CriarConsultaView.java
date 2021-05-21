/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uem.clinica.viewSec;
import com.uem.clinica.entidades.Consulta;
import com.uem.clinica.entidades.Paciente;
import com.uem.clinica.entidades.Secretaria;
import com.uem.clinica.util.TipoConsulta;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;


public class CriarConsultaView extends javax.swing.JInternalFrame {
    private Secretaria sec;
    private Consulta c;
    /**
     * Creates new form CreateAppointmentPage
     */
    public CriarConsultaView(EntityManagerFactory emf) {
        initComponents();
        this.sec = new Secretaria(emf);
    }
    
    public CriarConsultaView(EntityManagerFactory emf, int id) {
        initComponents();
        this.sec = new Secretaria(emf);
        
        c = sec.detalhesConsulta(id);
        
        if(c != null) {
            dateInput.setText(c.getDataConsulta().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            hourInput.setText(c.getDataConsulta().format(DateTimeFormatter.ofPattern("kk:mm")));
            
            namePatientInput.setText(String.valueOf(c.getPaciente().getId()));
            
            if(c.getTipo() != TipoConsulta.Regular) {
                visitSelector.setSelectedIndex(1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Prosseguindo para criação", "Consulta não encontrada", JOptionPane.WARNING_MESSAGE);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        visitSelector = new javax.swing.JComboBox<>();
        namePatientInput = new javax.swing.JTextField();
        dateInput = new javax.swing.JFormattedTextField();
        hourInput = new javax.swing.JFormattedTextField();
        saveButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Criar Consulta");

        jLabel1.setText("Data");

        jLabel2.setText("Horário");

        jLabel4.setText("Id do Paciente");

        visitSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Retorno" }));
        visitSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitSelectorActionPerformed(evt);
            }
        });

        try {
            dateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            hourInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        hourInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourInputActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(60, 103, 15));
        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(hourInput))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(visitSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(namePatientInput, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namePatientInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visitSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visitSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitSelectorActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // save Button
        String date = dateInput.getText();
        String hour = hourInput.getText();
        
        Paciente p = sec.detalhesPaciente(Integer.parseInt(namePatientInput.getText()));
        
        if (p == null) {
            JOptionPane.showMessageDialog(null, "Paciente com id " + namePatientInput.getText() + " não existe!");
        } else {
            TipoConsulta t = TipoConsulta.Regular;
            
            if(visitSelector.getSelectedIndex() != 0) {
                t = TipoConsulta.Retorno;
            }
            
            LocalDateTime horario = LocalDateTime.parse(hour + " " + date, DateTimeFormatter.ofPattern("kk:mm dd/MM/yyyy"));
            
            if(c ==  null) {
                sec.criarConsulta(horario, p, t);
            } else {
                sec.atualizarConsulta(c.getId(), horario, p, t);
            }
            
            JOptionPane.showMessageDialog(rootPane, "Consulta criada com sucesso\n\n"
                + date + "\n" + hour  + "\n" + p.getNome() + "\n");
        }
        
        
        
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void hourInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField dateInput;
    private javax.swing.JFormattedTextField hourInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namePatientInput;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> visitSelector;
    // End of variables declaration//GEN-END:variables
}
