
public class Principal {

    public static void main(String[] args) {
        Marca marca1 = new Marca(10, "Pepsi", "Juan", 654679);
        
        Producto p1 = new Producto();
        p1.setCodigo(1000);
        p1.setDescripcion("1.5 lts retornable");
        p1.setPrecio(1500);
        p1.setStock(50);
        p1.setMarca(marca1);
        
        System.out.println(p1.imprimirDatos());
        
    }
    
}
