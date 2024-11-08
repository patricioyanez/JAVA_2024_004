package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Marca;


public class ControladorMarca {
    // crud
    
    public boolean agregar(Marca marca)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO Marca (nombre, habilitado) values (?,?)";
        
            PreparedStatement ps = cx.prepareStatement(sql);
            
            ps.setString(1, marca.getNombre());
            ps.setInt(2, marca.isHabilitado()?1:0);
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Marca marca)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE Marca SET nombre=?, habilitado=? WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);
            
            ps.setString(1, marca.getNombre());
            ps.setInt(2, marca.isHabilitado()?1:0);
            ps.setInt(3, marca.getId());
            
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
            String sql = "DELETE FROM Marca WHERE id=?";
        
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
    public Marca buscarPorId(int id)
    {
        Marca marca = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Marca WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1);
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return marca;
    }
    
    public ArrayList<Marca> buscarTodo()
    {
        ArrayList<Marca> listado = new ArrayList<Marca>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Marca";
        
            PreparedStatement ps = cx.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(marca);
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado;
    }
}
