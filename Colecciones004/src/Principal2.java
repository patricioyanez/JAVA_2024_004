import java.util.ArrayList;
    // Ejercicio 30: crear una clase producto con 5 atributos
    // y agregar elementos a una colección.
    //mostrar todos los productos de la colección
    
public class Principal2 {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        Producto producto1 = new Producto(100, "Chicle", "Arcor", 500, 10);
        Producto producto2 = new Producto(110, "BomBom", "Arcor", 400, 30);
        Producto producto3 = new Producto(111, "Super 8", "Arcor", 600, 50);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        
        // listar los productos
        for(Producto aux : productos)
        {
            System.out.println(aux);
        }
        
    }
}
