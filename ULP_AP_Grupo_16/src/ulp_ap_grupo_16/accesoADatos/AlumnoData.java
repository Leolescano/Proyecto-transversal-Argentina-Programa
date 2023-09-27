package ulp_ap_grupo_16.accesoADatos;

import java.sql.Date;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import ulp_ap_grupo_16.entidades.*;

public  class AlumnoData {
    private static Connection con = null;

    public AlumnoData(){
        con = Conexion.getConexion();
    }
    
    public static void guardarAlumno(Alumno alumno) {
    
        try {
            String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs =  ps.getGeneratedKeys();
            if (rs.next()) {
               alumno.setIdAlumno(rs.getInt(1));
               JOptionPane.showMessageDialog (null, "Alumno guardado");
            }
           ps.close();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    public void modificarAlumno(Alumno alumno) {
        
        try {
            String sql = "UPDATE  alumno  SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if(exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al modificar la tabla alumno");
        } 
    }
    
    public void eliminarAlumno(int idAlumno) {
        
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog (null, "Alumno eliminado");
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al acceder a la tabla alumno");
        } 
    }
    
    public Alumno buscarAlumno(int id) {
            
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado =1";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE dni = ?";
        Alumno alumno = null;
        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            boolean est = rs.getBoolean("estado");
            if (est) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "El alumno existe, pero esta inactivo.");
            }
        } else{
            JOptionPane.showMessageDialog(null, "No existe ese alumno");
        }
        ps.close();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }
    
    public List<Alumno> listarAlumnos() {
    
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado =1";
        ArrayList <Alumno> alumnos = new ArrayList<>() ;
        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Alumno alumno = new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setEstado(true);
            alumnos.add(alumno);
        }
        ps.close();
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al acceder a la tabla alumno");
        }
        return alumnos;  
    }
}
    
