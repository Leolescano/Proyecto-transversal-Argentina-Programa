package ulp_ap_grupo_16.accesoADatos;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;
import ulp_ap_grupo_16.entidades.Materia;

public class MateriaData {
    private Connection con = null;
    
public MateriaData(){
       con = Conexion.getConexion();
    }
    
public void guardarMateria(Materia materia) {
        try {
            String sql = "INSERT INTO materia (año, nombre, estado)"
                    + "VALUES (?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, materia.getAnio());
            ps.setString(2, materia.getNombre());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
           ResultSet rs =  ps.getGeneratedKeys();
           if (rs.next()) {
               materia.setIdMateria(rs.getInt(1));
               JOptionPane.showMessageDialog (null, "Materia guardada");
           }
           ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }

public void modificarMateria(Materia materia) {
        try {
            String sql = "UPDATE  materia  SET año = ?, nombre = ?, estado = ? WHERE idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, materia.getAnio());
            ps.setString(2, materia.getNombre());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if(exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al modificar la tabla materia");
        } 
    }
 public void eliminarMateria(int idMateria) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog (null, "Materia eliminado");
            }
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al acceder a la tabla materia");
        } 
        }
 
 public Materia buscarMateria(int id) {
            String sql = "SELECT año, nombre FROM materia WHERE idMateria = ? AND estado =1";
            Materia materia = null;
            try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setAnio(rs.getInt("año"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe esa materia");
            }
            ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al acceder a la tabla materia");
        }
            return materia;
    }
      public Materia buscarMateriaPorNombre(String nombre) {
            String sql = "SELECT idMateria, año, nombre, estado FROM materia WHERE nombre = ? AND estado =1";
            Materia materia = null;
            try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setAnio(rs.getInt("año"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe esa materia");
            }
            ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al acceder a la tabla materia");
        }
            return materia;
    }  
      public List<Materia> listarMaterias() {
            String sql = "SELECT idMateria, año, nombre, estado FROM materia WHERE estado =1";
            ArrayList <Materia> materias = new ArrayList<>() ;
            try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setAnio(rs.getInt("año"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
                
                materias.add(materia);
            }
 
            ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "Error al acceder a la tabla materia");
        }
            return materias;  
    }
}
