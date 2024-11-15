package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Producto;


public class ControladorProducto {
    // crud
    
    public boolean agregar(Producto producto)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO Producto (idMarca, idCategoria,codigo,descripcion,stock,precioCosto,precioVenta) " +
                        " values (?,?,?,?,?,?,?)";
        
            PreparedStatement ps = cx.prepareStatement(sql);
           
            ps.setInt(1, producto.getIdMarca());
            ps.setInt(2, producto.getIdCategoria());
            ps.setLong(3, producto.getCodigo());
            ps.setString(4, producto.getDescripcion());
            ps.setInt(5, producto.getStock());
            ps.setInt(6, producto.getPrecioCosto());
            ps.setInt(7, producto.getPrecioVenta());
            
            ps.executeUpdate();
            ps.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Producto producto)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE Producto SET idMarca=?, idCategoria=?,codigo=?,descripcion=?,stock=?,precioCosto=?,precioVenta=? WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);
            
            ps.setInt(1, producto.getIdMarca());
            ps.setInt(2, producto.getIdCategoria());
            ps.setLong(3, producto.getCodigo());
            ps.setString(4, producto.getDescripcion());
            ps.setInt(5, producto.getStock());
            ps.setInt(6, producto.getPrecioCosto());
            ps.setInt(7, producto.getPrecioVenta());
            ps.setInt(8, producto.getId());
            
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
            String sql = "DELETE FROM Producto WHERE id=?";
        
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
    public Producto buscarPorId(int id)
    {
        Producto producto = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idMarca, idCategoria,codigo,descripcion,stock,precioCosto,precioVenta FROM Producto WHERE id=?";
        
            PreparedStatement ps = cx.prepareStatement(sql);            
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setIdMarca(rs.getInt("idMarca"));
                producto.setIdCategoria(rs.getInt("idCategoria"));
                producto.setCodigo(rs.getLong("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecioCosto(rs.getInt("precioCosto"));
                producto.setPrecioVenta(rs.getInt("precioVenta"));
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return producto;
    }
    
    public ArrayList<Producto> buscarTodo()
    {
        ArrayList<Producto> listado = new ArrayList<Producto>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idMarca, idCategoria,codigo,descripcion,stock,precioCosto,precioVenta FROM Producto";
        
            PreparedStatement ps = cx.prepareStatement(sql);            

            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Producto producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setIdMarca(rs.getInt("idMarca"));
                producto.setIdCategoria(rs.getInt("idCategoria"));
                producto.setCodigo(rs.getLong("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecioCosto(rs.getInt("precioCosto"));
                producto.setPrecioVenta(rs.getInt("precioVenta"));
                listado.add(producto);
            }
            
            ps.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado;
    }
}
