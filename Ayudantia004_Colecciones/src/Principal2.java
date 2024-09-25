import java.util.ArrayList;
import java.util.Scanner;

// Crear un menu que permita ingresar nombres y apellidos
// y sus notas (1 por persona) y otra para listarlos.
// Solicitar los datos por teclado.

public class Principal2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        
        while(true)
        {
            System.out.println("==== Menú ====");
            System.out.println("1.-Ingresar datos");
            System.out.println("2.-Listar");
            System.out.println("3.-Salir");
            System.out.print("Ingrese opción: ");
            opcion = leerTeclado.nextInt();
        }
        
    }
}
