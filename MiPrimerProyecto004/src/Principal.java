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
    }
}
