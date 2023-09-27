package ulp_ap_grupo_16.vistas;

import java.awt.event.*;
import java.sql.*;
import java.time.*;
import javax.swing.*;
import ulp_ap_grupo_16.accesoADatos.*;
import ulp_ap_grupo_16.entidades.*;


public class AlumnoVista extends javax.swing.JInternalFrame {
    
    AlumnoData aluData = new AlumnoData();
    private Alumno alumnoBuscado;
    
    public AlumnoVista() {
        initComponents();  
        
    }     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxEstado = new javax.swing.JRadioButton();
        jtApellido = new javax.swing.JTextField();
        jtDNI = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBuscar3 = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(460, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setText("Estado");

        jCheckBoxEstado.setText("Activo");

        jtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtDNIFocusGained(evt);
            }
        });
        jtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNIActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBuscar3.setText("Buscar");
        jbBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar3ActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loguito.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jbBuscar3))
                                    .addComponent(jCheckBoxEstado)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addComponent(jtApellido))
                                    .addComponent(jtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxEstado)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        jtDNI.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jCheckBoxEstado.setSelected(false);
        jtFechaNacimiento.setDate(null);
        jtDNI.requestFocus();
        jbEliminar.setEnabled(false);
        jbBuscar3.setEnabled(false);
      
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jtDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDNIFocusGained
    
        jtDNI.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jtApellido.requestFocusInWindow(); // solicita el foco para textField2
        }
        });
    }//GEN-LAST:event_jtDNIFocusGained

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
        try {   
            int dni = 0;
            String dniStr = "";
            dniStr = jtDNI.getText().trim();  
            dni = Integer.parseInt(dniStr);
            String apellido= jtApellido.getText();
            String nombre = jtNombre.getText();
            LocalDate fechaNacimiento = jtFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado = jCheckBoxEstado.isSelected();         
            Alumno nuevo = new Alumno(dni, apellido, nombre, fechaNacimiento, estado);
            AlumnoData.guardarAlumno(nuevo);
            jtDNI.setText("");
            jtApellido.setText("");
            jtNombre.setText("");
            jCheckBoxEstado.setSelected(false);
            jtFechaNacimiento.setDate(null);
            jtDNI.requestFocus();
            jbEliminar.setEnabled(true);
            jbBuscar3.setEnabled(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dni debe ser numero ",null, JOptionPane.WARNING_MESSAGE);
                  
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }      
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNIActionPerformed
        
    }//GEN-LAST:event_jtDNIActionPerformed

    private void jbBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar3ActionPerformed
       
        try {          
            String dniStr = jtDNI.getText().trim();  
            int dni = Integer.parseInt(dniStr);
            this.alumnoBuscado = aluData.buscarAlumnoPorDni(dni);
            Date fecha =  Date.valueOf(alumnoBuscado.getFechaNacimiento());          
            jtApellido.setText(alumnoBuscado.getApellido());
            jtNombre.setText(alumnoBuscado.getNombre());
            jCheckBoxEstado.setSelected(alumnoBuscado.isEstado());
            jtFechaNacimiento.setDate(fecha);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dni debe ser numero ",null, JOptionPane.WARNING_MESSAGE);
            jtDNI.requestFocus(true);
        } catch (NullPointerException e) {
            jtDNI.requestFocus(true);
        }    
    }//GEN-LAST:event_jbBuscar3ActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
             
        try {
            if (alumnoBuscado.isEstado()) {
            aluData.eliminarAlumno(alumnoBuscado.getIdAlumno());
            jtDNI.setText("");
            jtApellido.setText("");
            jtNombre.setText("");
            jCheckBoxEstado.setSelected(false);
            jtFechaNacimiento.setDate(null);
            jtDNI.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Ese alumno ya esta eliminando.",null, JOptionPane.WARNING_MESSAGE);
        }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Deves buscar un alumno para poder eliminarlo.",null, JOptionPane.WARNING_MESSAGE);
        }              
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jCheckBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar3;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private com.toedter.calendar.JDateChooser jtFechaNacimiento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
