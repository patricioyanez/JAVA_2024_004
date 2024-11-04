package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
}
