
package ulp_ap_grupo_16.vistas;


import java.util.*;
import javax.swing.table.*;
import ulp_ap_grupo_16.accesoADatos.*;
import ulp_ap_grupo_16.entidades.*;



public class Inscripcion_Vista extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    private InscripcionData insData;
    private MateriaData mData;
    private AlumnoData aData;
    private DefaultTableModel modelo ;
 
    public Inscripcion_Vista() {
        initComponents();
        aData=new AlumnoData();
        listaA  = (ArrayList<Alumno>) aData.listarAlumnos();
        modelo = new DefaultTableModel();
        insData = new InscripcionData();
        mData = new MateriaData();     
        cargarAlumnos();
        armarCabecera();
    }

   
    private void cargarAlumnos(){
   
        for(Alumno item:listaA){
            cboAlumno.addItem(item);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        cboAlumno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbIncribir = new javax.swing.JButton();
        jbAnularInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jRInscripta = new javax.swing.JRadioButton();
        jRNoInscripta = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(460, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Listado Materias");

        jLabel2.setText("Seleccione un Alumno");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Formulario de Inscripcion");

        jbIncribir.setText("Inscribir");
        jbIncribir.setEnabled(false);
        jbIncribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncribirActionPerformed(evt);
            }
        });

        jbAnularInscripcion.setText("Anular Inscripcion");
        jbAnularInscripcion.setEnabled(false);
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMaterias);

        jRInscripta.setText("Materias Inscriptas");
        jRInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRInscriptaActionPerformed(evt);
            }
        });

        jRNoInscripta.setText("Materias No Inscriptas");
        jRNoInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNoInscriptaActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Incripciones.gif"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRNoInscripta)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jbIncribir)
                        .addGap(18, 18, 18)
                        .addComponent(jbAnularInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRInscripta)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRInscripta)
                    .addComponent(jRNoInscripta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbIncribir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAnularInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbIncribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncribirActionPerformed
       
       MateriaData materiaData = new MateriaData();
       int filaSeleccionada = jtMaterias.getSelectedRow();
       if (filaSeleccionada!=-1){
            Alumno a = (Alumno)cboAlumno.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0); 
            Materia m = materiaData.buscarMateria(idMateria);
            Inscripcion i = new Inscripcion(a,m,0);
            insData.guardarInscripcion(i);
            borrarFilasTabla();
       }
    }//GEN-LAST:event_jbIncribirActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
       
        int filaSeleccionada=jtMaterias.getSelectedRow();
        if (filaSeleccionada!=-1){
         Alumno a=(Alumno)cboAlumno.getSelectedItem();
           int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0); 
           insData.borrarInscripcion(a.getIdAlumno(), idMateria);
            borrarFilasTabla();
        } 
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed

    private void jRInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInscriptaActionPerformed
        
        borrarFilasTabla();
        cargaDatosInscriptas();
        jbAnularInscripcion.setEnabled(true);
        jRInscripta.setSelected(true);
        jRNoInscripta.setSelected(false);
        jbIncribir.setEnabled(false);
    }//GEN-LAST:event_jRInscriptaActionPerformed

    private void jRNoInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNoInscriptaActionPerformed
       
        borrarFilasTabla();
        cargaDatosNoInscriptas();
        jbAnularInscripcion.setEnabled(false);
        jRInscripta.setSelected(false);
        jRNoInscripta.setSelected(true);
        jbIncribir.setEnabled(true);
    }//GEN-LAST:event_jRNoInscriptaActionPerformed

 
    private void armarCabecera(){

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");    
        jtMaterias.setModel(modelo);
    }
    private void borrarFilasTabla(){
    
        int indice= modelo.getRowCount()-1;
        for(int i = indice; i>=0;i--) {
            modelo.removeRow(i);
        }    
    }
  
    private void cargaDatosInscriptas(){
    
        Alumno selec =(Alumno) cboAlumno.getSelectedItem();
        listaM = (ArrayList)insData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m: listaM){
           modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
        }
    } 

    private void cargaDatosNoInscriptas(){
        
        Alumno selec =(Alumno) cboAlumno.getSelectedItem();
        listaM = (ArrayList)insData.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for (Materia m: listaM){
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
        }    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JComboBox<Alumno> cboAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRInscripta;
    private javax.swing.JRadioButton jRNoInscripta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbIncribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
}
