
package ulp_ap_grupo_16.vistas;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import ulp_ap_grupo_16.accesoADatos.*;
import ulp_ap_grupo_16.entidades.*;


public class Nota extends javax.swing.JInternalFrame {
    
    private static String nuevoValorStr;
    private static int idAlumno;
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
             return column == 2; // Solo permite editar la columna con índice 2 (es decir, la columna "Nota")
    }
    
    };
    
    public Nota() {
        initComponents();
        armarCabecera();
        llenarAlumnos();
    }
    
    private void llenarAlumnos(){
        AlumnoData aluData = new AlumnoData();
        List <Alumno> listaAlu =  aluData.listarAlumnos();
        //jcAlumnosNota.removeAllItems();  

        for(int i = 0; i < listaAlu.size(); i++) {
            int recoge1 =(listaAlu.get(i).getDni());        
            String recoge2 =(listaAlu.get(i).getApellido());
            String recoge3 =(listaAlu.get(i).getNombre());

            String resultadoConcatenado = recoge1 + " , " + recoge2 + " , " + recoge3;
            jcAlumnosNota.addItem(resultadoConcatenado);
       }             
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcAlumnosNota = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno");

        jcAlumnosNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnosNotaActionPerformed(evt);
            }
        });

        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtNotas);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcAlumnosNota, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(113, 113, 113)
                .addComponent(jbSalir)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcAlumnosNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAlumnosNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosNotaActionPerformed
        InscripcionData inscripcionData = new InscripcionData();
        AlumnoData alumnoData = new AlumnoData();
        String alumnoSeleccionado = (String) jcAlumnosNota.getSelectedItem();
        int posicionComa;
        int idMateria;
        String dniAlumnoStr;
        
        posicionComa = alumnoSeleccionado.indexOf(",");
        dniAlumnoStr = alumnoSeleccionado.substring(0, posicionComa).trim();
        Alumno alumnoBuscado = alumnoData.buscarAlumnoPorDni(Integer.parseInt(dniAlumnoStr));
        
        idAlumno = alumnoBuscado.getIdAlumno();
        
        List<Inscripcion> cursadasAlumno = new ArrayList<>();
        cursadasAlumno = (List) inscripcionData.obtenerInscripcionesPorAlumno(alumnoBuscado.getIdAlumno());
     
        borrarFilasTabla(); 
        if (cursadasAlumno.size() > 0) {
            for (Inscripcion inscripcion : cursadasAlumno) {
                idMateria = inscripcion.getMateria().getIdMateria();
                String nombreMateria = inscripcion.getMateria().getNombre();
                modelo.addRow(new Object[]{idMateria, nombreMateria, inscripcion.getNota()}); 
            }
       } else {
           JOptionPane.showMessageDialog(this, "El alumno no esta cursando ninguna materia.",null, JOptionPane.WARNING_MESSAGE);
       }
        
    
    jtNotas.getModel().addTableModelListener(new TableModelListener() {
    @Override
    public void tableChanged(TableModelEvent e) {
        if (e.getType() == TableModelEvent.UPDATE) {
            int row = e.getFirstRow();
            int column = e.getColumn();

            if (column == 2) { 
                nuevoValorStr  = (String) modelo.getValueAt(row, column);
               
            }
        }
      }
    });
               
    
    }//GEN-LAST:event_jcAlumnosNotaActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        InscripcionData inscripcionData = new InscripcionData();
        
        int filaSeleccionada = jtNotas.getSelectedRow();
        int column = 0;  // por ejemplo, tercera columna
        int idMateria = (int) jtNotas.getModel().getValueAt(filaSeleccionada, column);
       
        inscripcionData.actualizarNota(idAlumno, idMateria, Double.parseDouble(nuevoValorStr));
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed
    
    private void armarCabecera() {
        
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");    
        jtNotas.setModel(modelo);
      
    }

    private void borrarFilasTabla() {
        
        int indice= modelo.getRowCount()-1;
        for(int i = indice; i >= 0; i--){
            modelo.removeRow(i);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcAlumnosNota;
    private javax.swing.JTable jtNotas;
    // End of variables declaration//GEN-END:variables
}

