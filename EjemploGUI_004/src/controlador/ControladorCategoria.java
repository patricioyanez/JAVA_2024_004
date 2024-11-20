package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import modelo.Categoria;


public class ControladorCategoria {
    // crud
    
    public boolean agregar(Categoria categoria)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO Categoria (nombre, habilitado) values (?,?)";
        
            PreparedStatement ps = cx.prepareStatement(sql);
            
            ps.setString(1, categoria.getNombre());
            ps.setInt(2, categoria.isHabilitado()?1:0);
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Categoria categoria)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE Categoria SET nombre=?, habilitado=? WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);
            
            ps.setString(1, categoria.getNombre());
            ps.setInt(2, categoria.isHabilitado()?1:0);
            ps.setInt(3, categoria.getId());
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean eliminar(int id)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM Categoria WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public Categoria buscarPorId(int id)
    {
        Categoria categoria = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Categoria WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setHabilitado(rs.getInt("habilitado")==1);
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return categoria;
    }
    
    public ArrayList<Categoria> buscarTodo()
    {
        ArrayList<Categoria> listado = new ArrayList<Categoria>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Categoria";
        
            PreparedStatement ps = cx.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(categoria);
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado;
    }
    public javax.swing.DefaultComboBoxModel llenarComboBox()
    {
        Vector listado = new Vector();
        listado.add(new Categoria(0,"Seleccionar", true));
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Categoria WHERE habilitado=1 ORDER BY nombre";
        
            PreparedStatement ps = cx.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(categoria);
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return new javax.swing.DefaultComboBoxModel(listado);
    }

}
