import java.util.Scanner;
public class Principal {
   
    // punto de arranque de la aplicación
    public static void main(String args[])
    {// entry point
        // print
        System.out.print("Hola Mundo!!!");
        System.out.println("Hola Mundo 2 !!!");
        
        // input        
        Scanner leerTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = leerTeclado.next();
        
        System.out.println("Bienvenido " + nombre);
        
        // sout + tab
        System.out.print("Ingrese su apellido: ");
        String apellido = leerTeclado.next();
        
        System.out.println("Bienvenido " + nombre + " " + apellido);
        // tarea: revisar los tipos de datos disponibles en JAVA
        
        
        // Crear objeto
        Pizza pizza1;
        pizza1 = new Pizza();        
        Pizza pizza2 = new Pizza();
        
        pizza1.nombre = "Vegetaria";
        pizza1.masa = "Delgada";
        pizza1.tamano= "Familiar";
        pizza1.precio = 15000;
        
        System.out.println("=== Pizza 1 ====");
        System.out.println("Nombre  : " + pizza1.nombre);
        System.out.println("Tamaño  : " + pizza1.tamano);
        System.out.println("Masa    : " + pizza1.masa);
        System.out.println("Precio  : " + pizza1.precio);
        // Agregar datos a pizza2 y mostrar su contenido
    }
}
