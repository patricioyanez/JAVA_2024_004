import java.util.Scanner;

public class PrincipalSentenciaWhile {
    public static void main(String[] args) {
        
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = -1;
        
        while(opcion != 0)
        {
            System.out.println(" === Menú === ");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("0.- Salir");
            System.out.print("Ingrese una opción:");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 0)
            {
                break;
            }
            else if(opcion == 1)
            {
                System.out.println("==== Sumar ====");
            }
            else if(opcion == 2)
            {
                System.out.println("==== Restar ====");
            }
            else
            {
                System.out.println("\n");
                System.out.println("*************************");
                System.out.println("** Opción no es válida **");
                System.out.println("*************************");
            }
            // Ejercicio: Evitar que al salir aparezca el mensaje
            // de pausa
            
            // Ejercicio: Enviar mensaje cuando la opción 
            // no es válida
            System.out.println("Presione c y enter para continuar");
            leerTeclado.next();
        }
    }
}
