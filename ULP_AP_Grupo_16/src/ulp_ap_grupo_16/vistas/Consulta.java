
package ulp_ap_grupo_16.vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ulp_ap_grupo_16.accesoADatos.InscripcionData;
import ulp_ap_grupo_16.accesoADatos.MateriaData;
import ulp_ap_grupo_16.entidades.Alumno;
import ulp_ap_grupo_16.entidades.Inscripcion;
import ulp_ap_grupo_16.entidades.Materia;


public class Consulta extends javax.swing.JInternalFrame {
 private DefaultTableModel modelo = new DefaultTableModel();

    public Consulta() {
        initComponents();
        armarCabecera();
        llenarMaterias();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setText("Seleccione materia");

        jcMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMateriasActionPerformed(evt);
            }
        });

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtConsulta);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbSalir)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(108, 108, 108))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void llenarMaterias(){
         MateriaData matData = new MateriaData();
         List<Materia> materias = matData.listarMaterias();
         
            jcMaterias.removeAllItems();
   
            for (Materia materia : materias) {
                jcMaterias.addItem(materia.getNombre()); 
            }   
     }
    private void jcMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMateriasActionPerformed
            String nombreMateria = (String) jcMaterias.getSelectedItem();   
            InscripcionData inscData = new InscripcionData();
            List<Inscripcion> inscripciones = inscData.obtenerInscripciones();
            borrarFilasTabla();
            if (nombreMateria != null) {
            for (Inscripcion inscripcion : inscripciones) {
                  if (nombreMateria.equalsIgnoreCase(inscripcion.getMateria().getNombre())) {
                      int idAlumno = inscripcion.getAlumno().getIdAlumno();
                      int dni = inscripcion.getAlumno().getDni();
                      String apellido = inscripcion.getAlumno().getApellido();
                      String nombre = inscripcion.getAlumno().getNombre();
           
                      modelo.addRow(new Object[]{idAlumno, dni, apellido, nombre});
                  }
            }
            }
            
    }//GEN-LAST:event_jcMateriasActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcMaterias;
    private javax.swing.JTable jtConsulta;
    // End of variables declaration//GEN-END:variables
private void armarCabecera(){
    //Para poner nombre de cabezera en tablas
    modelo.addColumn("Id");
    modelo.addColumn("Dni");
    modelo.addColumn("Apellido");
    modelo.addColumn("Nombre");
    jtConsulta.setModel(modelo);
}

    private List<Materia> obtenerMateriasPorAlumno(int idAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class jcMaterias {

        private static void removeAllItems() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void addItem(Materia materia) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public jcMaterias() {
        }
    }
    private void borrarFilasTabla(){
    int indice= modelo.getRowCount()-1;

    for(int i = indice; i>=0;i--){
    modelo.removeRow(i);
}



}
}

