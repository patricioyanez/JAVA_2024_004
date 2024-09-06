import java.util.Scanner;

public class ClaseString {
    public static void main(String[] args) {
        String nombre = "Franco";
        String apellido = new String("Farias");
        
        Scanner leerTeclado = new Scanner(System.in);
        
        System.out.println("Ingrese su rut:");
        String rut = leerTeclado.next();
        
        int caracteres = rut.length();
        System.out.println("cantidad de caracteres:" + caracteres);
        
        String texto1 = "fsdfssdf";
        
        if(texto1.length() == 0)
            System.out.println("El texto esta vacio");
        else
            System.out.println("El texto fue especificado");
        
        String texto2 = " Hola ";
        System.out.println("Cant caracteres: " + texto2.length());
        if(texto2.length() == 0)
            System.out.println("Texto 2 esta vacio");
        else
            System.out.println("Texto 2=" +texto2);
        
        System.out.println("***" + texto2 + "****");
        texto2 = texto2.trim();
        System.out.println("***" + texto2 + "****");
        
        String nombre1 = "Juan";
        String nombre2 = "juan";
                
        if(nombre1 == "Juan")
            System.out.println("iguales 1");
        
        if(nombre1.equals(nombre2))
            System.out.println("iguales 2");
        
        
        if(nombre1.equalsIgnoreCase(nombre2))
            System.out.println("iguales 3");
        
        System.out.println("Mayúscula:" + nombre1.toUpperCase());
        System.out.println("Minúscula:" + nombre1.toLowerCase());
        nombre1 = nombre1.toUpperCase();
        
        String mensaje = "Hola Mundo!!!";
        mensaje = mensaje.replace("Hola", "Chao");
        System.out.println(mensaje);
        
        String rut1 = "10.500.100-k";
        
        System.out.println("rut     : " + rut1);
        System.out.println("nro rut : " + rut1.substring(0,10) );
        
        String rutAux = rut1.substring(0,10);
        rutAux = rutAux.replace(".", "");
        
        System.out.println("nri rut 2:" + rutAux);
        
        rutAux = rut1.substring(0,10).replace(".", "");
        System.out.println("nri rut 2:" + rutAux);
        
        // Ejercio 5:
        // solicitar el rut, eliminar los espacios y puntos
        // y mostrar solo el DV.
        
        Scanner leerTeclado1 = new Scanner(System.in);
        System.out.print("Ingrese su rut: ");
        String nuevoRut = leerTeclado1.next();
        nuevoRut = nuevoRut.replace(".", "").replace("-", "").trim();
        int largo = nuevoRut.length();
        nuevoRut = nuevoRut.substring(largo-1, largo);
        System.out.println("El DV es: " + nuevoRut);
        
    }
}
