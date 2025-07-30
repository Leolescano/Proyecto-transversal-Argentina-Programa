
package ulp_ap_grupo_16.vistas;

import javax.swing.*;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();          
   }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jlULP = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmMateri = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmInscripcion = new javax.swing.JMenuItem();
        jmNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmConsulta = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Universidad Grupo 16");

        jlULP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo2.jpg"))); // NOI18N

        escritorio.setLayer(jlULP, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(640, Short.MAX_VALUE)
                .addComponent(jlULP)
                .addContainerGap())
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jlULP)
                .addGap(0, 242, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas (Personalizado).png"))); // NOI18N
        jMenu1.setText("Alumno");

        jmAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduado (Personalizado).png"))); // NOI18N
        jmAlumno.setText("Formulario de Aumno");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmAlumno);

        jMenuBar1.add(jMenu1);

        jmMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros (Personalizado).png"))); // NOI18N
        jmMateria.setText("Materia");
        jmMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMateriaActionPerformed(evt);
            }
        });

        jmMateri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ortografia (Personalizado).png"))); // NOI18N
        jmMateri.setText("Formulario de Materias");
        jmMateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMateriActionPerformed(evt);
            }
        });
        jmMateria.add(jmMateri);

        jMenuBar1.add(jmMateria);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/intercambiabilidad (Personalizado).png"))); // NOI18N
        jMenu3.setText("Administracion");

        jmInscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/examen (Personalizado).png"))); // NOI18N
        jmInscripcion.setText("Manejo de Inscripciones");
        jmInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscripcionActionPerformed(evt);
            }
        });
        jMenu3.add(jmInscripcion);

        jmNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuaderno (Personalizado).png"))); // NOI18N
        jmNotas.setText("Manipulacion de Notas");
        jmNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jmNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/interactivo (Personalizado).png"))); // NOI18N
        jMenu4.setText("Consultas");

        jmConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumno (Personalizado).png"))); // NOI18N
        jmConsulta.setText("Alumnos por Materia");
        jmConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaActionPerformed(evt);
            }
        });
        jMenu4.add(jmConsulta);

        jMenuBar1.add(jMenu4);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida (Personalizado).png"))); // NOI18N
        jmSalir.setText("Salir");
        jmSalir.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jmSalirMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jmSalir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jmSalirFocusGained(evt);
            }
        });
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AlumnoVista alu = new AlumnoVista();
      
        alu.setVisible(true);
        escritorio.add(alu);
        escritorio.moveToFront(alu);
    }//GEN-LAST:event_jmAlumnoActionPerformed

    private void jmMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMateriaActionPerformed

    }//GEN-LAST:event_jmMateriaActionPerformed

    private void jmMateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMateriActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Materia_Vista mat =new Materia_Vista();
        mat.setVisible(true);
        escritorio.add(mat);
        escritorio.moveToFront(mat);
    }//GEN-LAST:event_jmMateriActionPerformed

    private void jmInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Inscripcion_Vista ins =new Inscripcion_Vista();
        ins.setVisible(true);
        escritorio.add(ins);
        escritorio.moveToFront(ins);
    }//GEN-LAST:event_jmInscripcionActionPerformed

    private void jmNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Nota not =new Nota();
        not.setVisible(true);
        escritorio.add(not);
        escritorio.moveToFront(not);
    }//GEN-LAST:event_jmNotasActionPerformed

    private void jmConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Consulta cons =new Consulta();
        cons.setVisible(true);
        escritorio.add(cons);
        escritorio.moveToFront(cons);       
    }//GEN-LAST:event_jmConsultaActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmSalirMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jmSalirMenuKeyPressed
      
    }//GEN-LAST:event_jmSalirMenuKeyPressed
 
    private void jmSalirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jmSalirFocusGained
      
      
    }//GEN-LAST:event_jmSalirFocusGained

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas salir del programa?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0); // Terminar la ejecución del programa
        }   
    }//GEN-LAST:event_jmSalirMouseClicked
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlULP;
    private javax.swing.JMenuItem jmAlumno;
    private javax.swing.JMenuItem jmConsulta;
    private javax.swing.JMenuItem jmInscripcion;
    private javax.swing.JMenuItem jmMateri;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenuItem jmNotas;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
