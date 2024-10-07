
public class Principal {
 
    public static void main(String[] args) { 
        Empleado empleado = new Empleado(500000, "Cajero", "1-9", "Ana", 2000, "ana@correo.cl");
        
        System.out.println("===== Listado de empleados =====");
        System.out.println(empleado);
        
        // Ejercicio 20: definir la clase cliente con 2 atributos adicionales
        // tipoCliente y credito
        // crear un cliente e imprimir los datos
        
        System.out.println("\n ====== listado de clientes =======");
        Cliente cliente = new Cliente("Vip", 2000000, "2-7", "Juan", 2000, "afsd@email.cl");
        
        System.out.println(cliente);
        // ppt 2.2.1
    }
    
}
