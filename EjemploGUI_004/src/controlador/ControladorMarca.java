package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
