
import java.util.Scanner;



public class PrincipalSentenciaIf {
    public static void main(String[] args) {
        int numero = 0;
        
        if(numero == 0)
            System.out.println("El valor es cero");
        
        if(numero >= 0)
        {
            System.out.println("Es Verdadero");
            System.out.println("Numero no es negativo");
        }
        
        if(numero > 0)
        {
            System.out.println("if/else: verdadero");
        }
        else
        {
            System.out.println("if/else: falso");
        }
        
        int numero2 = 10;
        
        if(numero2 == 0)
        {
            System.out.println("Numero es cero");
        }
        else if(numero2 > 0)
        {
            System.out.println("Numero 2 es mayor a cero");
        }
        
        // if/ else if /else
        if(numero2 == 0)
        {
            System.out.println("Numero es cero");
        }
        else if(numero2 > 0)
        {
            System.out.println("Numero 2 es mayor a cero");
        }
        else
        {
            System.out.println("Todo es falso");
        }
        
        // Ejercicio:
        // preguntar al usuario un numero y enviar 
        // si es natural o no
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero1 = leerTeclado.nextInt();
        
        if(numero1 > 0)
            System.out.println("Es numero natural");
        else
            System.out.println("El numero no es natural");
        
        
        // determinar si el numero es +, - o neutro
        
        if(numero1 > 0)
            System.out.println("El numero es positivo");
        else if(numero1 == 0)
            System.out.println("El numero es neutro");
        else
            System.out.println("El Numero es negativo");
        
        // solicitar la edad y determinar el rango etario
        // niño, adolescente, adulto y 3ra edad
        System.out.print("Ingrese su edad: ");
        int edad = leerTeclado.nextInt();
        if (edad <= 11) {
            System.out.println("Es niño");
        }
        else if (edad < 18) {
            System.out.println("Adolescente");
        }
        else if (edad < 65) {
            System.out.println("Adulto");
        }
        else
        {
            System.out.println("3ra Edad");
        }
    }
}
