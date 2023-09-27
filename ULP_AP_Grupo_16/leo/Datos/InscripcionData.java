package ulp_ap_grupo_16.accesoADatos;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import ulp_ap_grupo_16.entidades.*;

public class InscripcionData {
    private Connection con = null; 
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();

public InscripcionData() {
   this.con = Conexion.getConexion();
}

public void guardarInscripcion(Inscripcion insc) {
    String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?, ?, ?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {
                insc.setIdIncripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Incripción registrada");
            }
            ps.close();
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
        }
}

public void actualizarNota(int idAlumno, int idMateria, double nota) {
    
    String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, nota);
        ps.setInt(2, idAlumno);
        ps.setInt(3, idMateria);
        
        int filas = ps.executeUpdate();
        if(filas > 0) {
            JOptionPane.showMessageDialog(null, "Nota actualizada");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró una inscripción con el idAlumno y idMateria proporcionados.");
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
    }
}

public void borrarInscripcion(int idAlumno, int idMateria) {
    String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas = ps.executeUpdate();
            if(filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripción borrada");
        }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
        }

}

public List<Inscripcion> obtenerInscripciones(){
    ArrayList<Inscripcion> cursadas = new ArrayList<>();
    String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdIncripcion((rs.getInt("idInscripcion")));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
}

public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
    ArrayList<Inscripcion> cursadas = new ArrayList<>();
    String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdIncripcion((rs.getInt("idInscripcion")));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
}

public List<Materia>obtenerMateriasCursadas(int idAlumo) {
    ArrayList<Materia> materias = new ArrayList<>();
    
   String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE "
                     + " inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materias.add(materia); 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
}

public List<Materia>obtenerMateriasNoCursadas(int idAlumo) {
    ArrayList<Materia>materias = new ArrayList<>();
    String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                         + " (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
     try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materias.add(materia); 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return materias;
}

public List<Alumno>obtenerAlumnosPorMateria(int idMateria) {
    ArrayList<Alumno> alumnosMateria = new ArrayList<>();
    String sql = "SELECT a.idAlumno, dni, nombre, fechaNacimiento, estado FROM inscripcion i,"
                          + "alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apelllido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return alumnosMateria;
}

  
}

