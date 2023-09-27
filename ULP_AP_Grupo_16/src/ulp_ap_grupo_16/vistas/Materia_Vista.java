/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulp_ap_grupo_16.vistas;

import java.util.*;
import javax.swing.*;
import ulp_ap_grupo_16.accesoADatos.*;
import ulp_ap_grupo_16.entidades.*;


public class Materia_Vista extends javax.swing.JInternalFrame {
    private MateriaData materiaData = new MateriaData();
    private Materia materiaBuscada;
   
    public Materia_Vista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jrActivo = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar3 = new javax.swing.JButton();
        jtIdMateria = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(460, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setText("Código");

        jLabel4.setText("Nombre");

        jLabel3.setText("Año");

        jLabel6.setText("Estado");

        jrActivo.setText("Activo");

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

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar3.setText("Buscar");
        jbBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar3ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LibroMateria.gif"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(23, 23, 23)))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrActivo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbSalir)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbBuscar3))
                                        .addComponent(jtAnio, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar3))
                        .addGap(17, 17, 17)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jrActivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
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

    private void jbBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar3ActionPerformed
        
        String idMateriaStr = jtIdMateria.getText().trim();  
        int idmat = Integer.parseInt( idMateriaStr);
        this.materiaBuscada = this.materiaData.buscarMateria(idmat);
        if (materiaBuscada != null) {
            jtNombre.setText(materiaBuscada.getNombre());
            jtAnio.setText(String.valueOf(materiaBuscada.getAnio()));
            jrActivo.setSelected(materiaBuscada.isEstado());
        } else {
            jtIdMateria.setText("");
            jtNombre.setText("");
            jtAnio.setText("");
            jrActivo.setSelected(false);
            jtIdMateria.requestFocus();
        }        
    }//GEN-LAST:event_jbBuscar3ActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (materiaBuscada != null) {
            InscripcionData inscripcionData = new InscripcionData();
            List<Inscripcion> inscripciones = (ArrayList)inscripcionData.obtenerInscripciones();
            boolean bandera = true;
            if (materiaBuscada != null) {
                for (Inscripcion inscripcion : inscripciones) {
                    if (inscripcion.getMateria().getIdMateria() == materiaBuscada.getIdMateria())
                        bandera = false;
                }
                if (bandera) {
                    materiaData.eliminarMateria(this.materiaBuscada.getIdMateria());  
                    jtIdMateria.setText("");
                    jtNombre.setText("");
                    jtAnio.setText("");
                    jrActivo.setSelected(false);
                    jtIdMateria.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "No puedes eliminar esta materia por que tienes alumnos cursando.");
                }
            }
        }       
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        jbGuardar.setEnabled(true);
        jtIdMateria.setText("Codigo automatico");
        jtIdMateria.setEditable(false);
        jtNombre.setText("");
        jtNombre.requestFocus();
        jtAnio.setText("");
        jrActivo.setSelected(true);
        jbBuscar3.setEnabled(false);
        jbEliminar.setEnabled(false);
        jrActivo.setEnabled(false);   
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        Materia materiaNueva = new Materia();
        try {            
            String nombre = jtNombre.getText();
            materiaNueva.setNombre(nombre);
            int anio = Integer.parseInt(jtAnio.getText()) ;       
            materiaNueva.setAnio(anio);
            boolean estado = jrActivo.isSelected();
            materiaNueva.setEstado(estado);
            materiaData.guardarMateria(materiaNueva);
            jtIdMateria.setEditable(true);
            jtIdMateria.setText("");
            jtNombre.setText("");
            jtAnio.setText("");
            jrActivo.setSelected(false);
            jbGuardar.setEnabled(false);
            jbEliminar.setEnabled(true);
            jtIdMateria.requestFocus();            
        } catch(NullPointerException e ){
              JOptionPane.showMessageDialog(this, "Debe ingresar año valido");
              jtAnio.requestFocus();
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }
        jbBuscar3.setEnabled(true);
    }//GEN-LAST:event_jbGuardarActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar3;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrActivo;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtIdMateria;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}

